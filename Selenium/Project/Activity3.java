package LMS;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Activity3 extends CommonClass {

	@Test
	public void test() {
		String heading = driver.findElement(By.xpath("(//h3[@class='uagb-ifb-title'])[1]")).getText();
		
		Assert.assertEquals(heading, "Actionable Training");
		
	}
}
