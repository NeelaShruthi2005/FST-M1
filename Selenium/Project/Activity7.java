package LMS;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Activity7 extends CommonClass {
	
	@Test
	public void test() {
		
		driver.findElement(By.xpath("//a[contains(@href,'all-courses')]")).click();
		
		List<WebElement> courses = driver.findElements(By.xpath("//h3[@class='entry-title']"));
		
		System.out.println("Number of Courses = " + courses.size());
		
	}

}
