import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  ChromeDriver driver = new ChromeDriver();
	      

	        driver.get("https://training-support.net/webelements/alerts");
	        driver.manage().window().maximize();

	        System.out.println(driver.getTitle());
	        
	        driver.findElement(By.id("simple")).click();
	        
	        Alert alert = driver.switchTo().alert();
	        String alertText = alert.getText();
	        System.out.println("Text in alert: " + alertText);
	        
	        alert.accept();
	        System.out.println(driver.findElement(By.id("result")).getText());
	        driver.close();

	}

}
