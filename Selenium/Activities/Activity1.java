import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://training-support.net");
		System.out.println(driver.getTitle());
		
		driver.findElement(By.cssSelector("a[href='/about']")).click();
		Thread.sleep(1000);
		System.out.println(driver.getTitle());
		
		driver.quit();
	}

}
