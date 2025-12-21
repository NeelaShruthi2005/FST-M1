import java.time.Duration;
import org.openqa.selenium.TimeoutException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.training-support.net/webelements/dynamic-content");
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());
		
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.findElement(By.id("genButton")).click();
		
		try {
		    wait.until(ExpectedConditions.textToBePresentInElementLocated(
		        By.id("word"), "release"));
		    System.out.println(driver.findElement(By.id("word")).getText());
		} catch (TimeoutException e) {
		    System.out.println("Text not found");
		}
		
		driver.close();

	}

}
