import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://training-support.net/webelements/keyboard-events");
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());
		
		Actions actions = new Actions(driver);
		
		actions.sendKeys("shruthi").perform();
		
		System.out.println(driver.findElement(By.cssSelector("h1[class*='mt-3']")).getText());
		
		
		driver.close();

	}

}
