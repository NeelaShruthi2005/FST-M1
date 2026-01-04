package LMS;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Activity4 extends CommonClass{
	
	@Test
	public void test() {
		String heading= driver.findElement(By.xpath("(//h3[@class='entry-title'])[2]")).getText();
		Assert.assertEquals(heading, "Email Marketing Strategies");
		
	}

}
