import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://training-support.net/webelements/dynamic-controls");
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.findElement(By.xpath("//input[@id='checkbox']")).isSelected());
		driver.findElement(By.xpath("//input[@id='checkbox']")).click();
		System.out.println(driver.findElement(By.xpath("//input[@id='checkbox']")).isSelected());
		
		driver.close();
		
	}

}
