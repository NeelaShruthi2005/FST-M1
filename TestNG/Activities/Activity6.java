package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class Activity6 {
	WebDriver driver;
	
	@BeforeClass
	public void beforeClass() {	
	driver = new ChromeDriver();
	driver.get("https://training-support.net/webelements/login-form");
	System.out.println(driver.getTitle());
	}
	
	@Test
	@Parameters({"uusername", "upassword"})
	public void test(String uusername, String upassword) {
		driver.findElement(By.id("username")).sendKeys(uusername);
		driver.findElement(By.id("password")).sendKeys(upassword);
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
	}
	
	
	
	
	@AfterClass
	public void afterClass() {
		driver.quit();
	}
}
