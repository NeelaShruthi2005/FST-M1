package tests;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;

import org.testng.annotations.Test;

public class Activity7 {
WebDriver driver;
WebDriverWait wait;
	
	@BeforeClass
	public void beforeClass() {	
	driver = new ChromeDriver();
	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	driver.get("https://training-support.net/webelements/login-form");
	System.out.println(driver.getTitle());
	}
	
	@DataProvider(name = "Authentication")
	public static Object[][] credentials() {
	    return new Object[][] { 
	        { "testuser_1", "Test@123", false }, 
	        { "admin", "password", true }
	    };
	}
	
	@Test(dataProvider = "Authentication")
	public void test(String uusername, String upassword, boolean shouldLoginSucceed) {
		
		driver.navigate().refresh();

	    driver.findElement(By.id("username")).clear();
	    driver.findElement(By.id("password")).clear();

	    driver.findElement(By.id("username")).sendKeys(uusername);
	    driver.findElement(By.id("password")).sendKeys(upassword);
	    driver.findElement(By.xpath("//button[text()='Submit']")).click();

	    WebElement message;

	    if (shouldLoginSucceed) {
	    	
	    	wait.until(ExpectedConditions.urlContains("login-success"));
	        message = wait.until(
	        	            ExpectedConditions.presenceOfElementLocated(By.tagName("h1"))
	        	        );

	        Assert.assertTrue(
	        	    message.getText().toLowerCase().contains("login success"),
	        	    "Expected login success heading"
	        	);

	    } else {
	        message = wait.until(
	            ExpectedConditions.visibilityOfElementLocated(By.id("subheading"))
	        );

	        Assert.assertTrue(
	            message.getText().toLowerCase().contains("invalid"),
	            "Expected invalid credentials message"
	        );
	    }
	}
	
	@AfterClass
	public void afterClass() {
		driver.quit();

}
}
