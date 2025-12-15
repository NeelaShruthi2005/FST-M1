import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		driver.get("https://training-support.net/webelements/dynamic-controls");
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.findElement(By.xpath("//input[@id='checkbox']")).isDisplayed());
		
		driver.findElement(By.xpath("//button[text()='Toggle Checkbox']")).click();
		
		wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath("//input[@id='checkbox']"))));
		
		System.out.println(driver.findElement(By.xpath("//input[@id='checkbox']")).isDisplayed());
		
		driver.findElement(By.xpath("//button[text()='Toggle Checkbox']")).click();
		
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//input[@id='checkbox']")))).click();
		
		System.out.println(driver.findElement(By.xpath("//input[@id='checkbox']")).isSelected());
		
		driver.close();

	}

}
