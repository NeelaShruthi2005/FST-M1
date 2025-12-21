import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Activity8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://training-support.net/webelements/mouse-events");
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());
		
		Actions actions = new Actions(driver);
		
		WebElement button1 = driver.findElement(By.xpath("(//div[contains(@class , 'cursor-pointer')])[1]"));
		WebElement button2 = driver.findElement(By.xpath("(//div[contains(@class , 'cursor-pointer')])[2]"));
		WebElement button3 = driver.findElement(By.xpath("(//div[contains(@class , 'cursor-pointer')])[3]"));
		WebElement button4 = driver.findElement(By.xpath("(//div[contains(@class , 'cursor-pointer')])[4]"));
		actions.click(button1).pause(1000).moveToElement(button2).pause(2000).click().perform();
		
		System.out.println(driver.findElement(By.cssSelector("p#result")).getText());
		
		actions.click(button3).pause(2000).contextClick(button4).pause(2000).perform();
		actions.click(driver.findElement(By.xpath("//span[normalize-space()='Open']"))).pause(5000).build().perform();
		System.out.println(driver.findElement(By.cssSelector("p#result")).getText());
		driver.close();
		
	}

}
