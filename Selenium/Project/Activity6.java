package LMS;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Activity6 extends CommonClass {

	@Test
	public void test() {
		driver.findElement(By.xpath("//li[contains(@id,'item-1507')]//a")).click();
		
		driver.findElement(By.xpath("//a[@href='#login']")).click();
		
		driver.findElement(By.id("user_login")).sendKeys("root");
		driver.findElement(By.id("user_pass")).sendKeys("pa$$w0rd");
		driver.findElement(By.id("rememberme")).click();
		driver.findElement(By.id("wp-submit")).click();
		
		Assert.assertTrue(driver.getPageSource().contains("Logout"));
		
		
	}
}
