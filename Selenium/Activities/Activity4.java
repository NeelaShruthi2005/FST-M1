import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://training-support.net/webelements/target-practice");
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.findElement(By.xpath("//h3[contains(text(),'#3')]")).getText());
		System.out.println(driver.findElement(By.xpath("//h5[contains(text(),'#5')]")).getCssValue("color"));
		System.out.println(driver.findElement(By.xpath("//button[text()='Purple']")).getDomAttribute("class"));
		System.out.println(driver.findElement(By.xpath("//button[contains(@class, 'slate')]")).getText());
		
		driver.close();
	}

}
