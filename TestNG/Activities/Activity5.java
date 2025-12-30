package tests;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity5 {
	WebDriver driver;

	
	@BeforeTest (alwaysRun = true)
	public void beforeClass() {
		
	driver = new ChromeDriver();
	driver.get("https://training-support.net/webelements/target-practice");
	System.out.println(driver.getTitle());
	}
	
	
	@Test
	public void pageTitleTest() {
		String title = driver.getTitle();
		System.out.println("Title is: " + title);
		Assert.assertEquals(title, "Selenium: Target Practice");
	}
	
	
	 @Test(groups = "HeaderTests")
	    public void verifyThirdHeaderText() {
		 WebElement header3 = driver.findElement(By.xpath("//h3[contains(@class, 'orange')]"));
	        Assert.assertEquals(header3.getText(), "Heading #3");
	    
	    }

	    @Test(groups = "HeaderTests")
	    public void verifyFifthHeaderColor() {
	    	Color header5Color = Color.fromString(driver.findElement(By.cssSelector("h5.text-purple-600")).getCssValue("color"));
	        Assert.assertEquals(header5Color.asHex(), "#9333ea");
	    }

	    
	    
	    @Test(groups = "ButtonTests")
	    public void verifyEmeraldButtonText() {
	    	 WebElement button1 = driver.findElement(By.xpath("//button[contains(@class, 'emerald')]"));
	         Assert.assertEquals(button1.getText(), "Emerald");
	    }

	    @Test(groups = "ButtonTests")
	    public void verifyFirstButtonThirdRowColor() {
	    	WebElement purpleButton =
	                driver.findElement(By.xpath("//button[text()='Purple']"));

	        Color bgColor = Color.fromString(
	                purpleButton.getCssValue("background-color"));

	        Assert.assertEquals(bgColor.asHex(), "#e9d5ff");
	    }
	    
	
	@AfterTest (alwaysRun = true)
	public void close() {
		driver.close();

	}
	}
