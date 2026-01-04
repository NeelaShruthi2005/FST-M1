package LMS;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class CommonClass {
	WebDriver driver;
	
	 @BeforeMethod
	    public void setup() {
	        driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        driver.manage().window().maximize();
	        driver.get("https://alchemy.hguy.co/lms/");
	    }
	 

	    @AfterMethod
	    public void tearDown() {
	        driver.quit();
	    }
	
	
	
}
