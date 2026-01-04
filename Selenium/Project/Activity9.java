package LMS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Activity9 extends CommonClass {

	@Test
	public void test() {
		
		
		driver.findElement(By.xpath("//a[contains(@href,'all-courses')]")).click();
		driver.findElement(By.xpath("//h3[@class='entry-title']")).click();
		
		 String title = driver.findElement(By.className("entry-title")).getText();
	        System.out.println("Course Title: " + title);

	        if (driver.findElements(By.name("mark_complete")).size() > 0) {
	            driver.findElement(By.name("mark_complete")).click();
	        }
	}
}
