package LMS;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Activity1 extends CommonClass{
	
	@Test
	public void test() {
		String title =driver.getTitle();
		Assert.assertEquals(title, "Alchemy LMS – An LMS Application");
		
	}

}
