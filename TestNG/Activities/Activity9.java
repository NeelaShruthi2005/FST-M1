package tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity9 {
WebDriver driver;
	
	@BeforeClass
	public void beforeClass() {	
	driver = new ChromeDriver();
	driver.get("https://training-support.net/webelements/alerts");
	System.out.println(driver.getTitle());
	}
	
	@Test
	public void simpleAlertTestCase() {
		driver.findElement(By.id("simple")).click();
		Reporter.log("Clicked the simple button");
        
        Alert alert = driver.switchTo().alert();
        String alertText = alert.getText();
        System.out.println("Text in alert: " + alertText);
        Reporter.log("printed the text in alert");
        
        alert.accept();
        Reporter.log("accepted the alert");
        
        Assert.assertEquals(driver.findElement(By.id("result")).getText() , "You just accepted a simple alert!" );
        
        System.out.println(driver.findElement(By.id("result")).getText());
        Reporter.log("printed the result after alert closed");
        
        Reporter.log("TestCase Ended");
	}
	
	@Test
	public void confirmAlertTestCase() {
		 driver.findElement(By.id("confirmation")).click();
		 Reporter.log("Clicked on Confirmation button");
	        
	        Alert alert = driver.switchTo().alert();
	        String alertText = alert.getText();
	        System.out.println("Text in alert: " + alertText);
	        Reporter.log("printed the text of Alert");
	        
	        alert.accept();
	        Reporter.log("Accepted the alert");
	        Assert.assertEquals(driver.findElement(By.id("result")).getText() , "You just accepted a confirmation alert!" );
	        
	        System.out.println(driver.findElement(By.id("result")).getText());
	        Reporter.log("printed the result after alert closed");
	        
	        driver.findElement(By.id("confirmation")).click();
	        Reporter.log("clicked on confirmation button again to verify the dismiss button");
	        
	        alert.dismiss();
	        Reporter.log("dismissed the alert");
	        
	        Assert.assertEquals(driver.findElement(By.id("result")).getText() , "You just dismissed a confirmation alert!" );

	        
	        System.out.println(driver.findElement(By.id("result")).getText());
	        Reporter.log("printed the result after alert closed");
	        
	        Reporter.log("TestCase Ended");
	}
	@Test
	public void promptAlertTestCase() {
		driver.findElement(By.id("prompt")).click();
		 Reporter.log("Clicked on prompt button");
        
        Alert alert = driver.switchTo().alert();
        String alertText = alert.getText();
        System.out.println("Text in alert: " + alertText);
        Reporter.log("Printed the text on Alert");
        
        String s = "Shruthi";
        alert.sendKeys(s);
        Reporter.log("added the text in the prompt");
        
        alert.accept();
        Reporter.log("accepted the alert/clicked ok"); 
        
        String result = driver.findElement(By.id("result")).getText();
 
        Assert.assertTrue(result.contains(s),"Result does not contain the entered username");
        
        System.out.println(result);
        Reporter.log("Printed the result after alert got closed");
        
        Reporter.log("TestCase Ended");
	}
	
	@BeforeMethod
	public void defaulttest() {
		driver.switchTo().defaultContent();
		Reporter.log("Switched back to the default page");
	}
	
	
	
	@AfterClass
	public void afterClass() {
		driver.close();
	}
}
