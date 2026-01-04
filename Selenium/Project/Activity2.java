package LMS;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Activity2 extends CommonClass {
	
	@Test
	public void test() {
	
	String heading = driver.findElement(By.xpath("//h1[contains(text(),'Industry Experts')]")).getText();
	
	Assert.assertEquals(heading, "Learn from Industry Experts");
	}


}
