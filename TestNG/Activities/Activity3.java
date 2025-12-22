package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity3 {
WebDriver driver;
WebDriverWait wait;
	
	@BeforeClass
	public void beforeClass() {
		
	driver = new ChromeDriver();
	 wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	driver.get("https://training-support.net/webelements/login-form/");
	System.out.println(driver.getTitle());
	}
	
	
	@Test
	public void test() {
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("password");
		
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		 String message = wait.until(
	                ExpectedConditions.visibilityOfElementLocated(
	                        By.cssSelector("h2.text-center")
	                )
	        ).getText();
		Assert.assertEquals(message, "Welcome Back, Admin!");
	}
	
	@AfterClass
	public void close() {
		driver.quit();
	}
}
