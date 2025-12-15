import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://training-support.net/webelements/dynamic-controls");
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.findElement(By.xpath("//input[@id='textInput']")).isEnabled());
		driver.findElement(By.xpath("//button[@id='textInputButton']")).click();
		System.out.println(driver.findElement(By.xpath("//input[@id='textInput']")).isEnabled());
		
		driver.close();
	}

}
