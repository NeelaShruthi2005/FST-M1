package LMS;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Activity8 extends CommonClass {
	
	@Test
	public void test() {
		driver.findElement(By.xpath("//a[contains(@href,'contact')]")).click();
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("shruthi");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("shruthi@gmail.com");
		driver.findElement(By.xpath("//textarea[@id='wpforms-8-field_2']")).sendKeys("Adding Comment");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		String text = driver.findElement(By.id("wpforms-confirmation-8")).getText();
		
		System.out.println(text);
	}

}
