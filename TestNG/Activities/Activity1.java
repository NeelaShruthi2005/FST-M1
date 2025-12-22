package tests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity1 {
	
	WebDriver driver;
	
	@BeforeClass
	public void beforeClass() {
		
	driver = new ChromeDriver();
	driver.get("https://training-support.net");
	}
	
	@Test(priority = 1)
	public void test() throws InterruptedException {
		System.out.println(driver.getTitle());
		
		Assert.assertEquals(driver.getTitle(), "Training Support");
		
		driver.findElement(By.cssSelector("a[href='/about']")).click();
		Thread.sleep(2000);
		
	
	}
	
	@Test(priority = 2)
	public void test2() {
		System.out.println(driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "About Training Support");
	}
	
	
	
	@AfterClass
	public void close() {
		driver.quit();
	}

}
