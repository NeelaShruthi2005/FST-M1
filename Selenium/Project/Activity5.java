package LMS;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Activity5 extends CommonClass{
	
	@Test
	public void test() {
		 driver.findElement(By.xpath("//li[contains(@id,'item-1507')]//a")).click();
		 
		 String currenturl = driver.getCurrentUrl();
		 
		 Assert.assertEquals(currenturl, "https://alchemy.hguy.co/lms/my-account/");
		 
		 String titleofcurrentpage = driver.getTitle();
		 
		 Assert.assertTrue(titleofcurrentpage.contains("My Account"));
		 
		 
		
		
	}

}
