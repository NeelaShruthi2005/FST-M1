import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://training-support.net/webelements/drag-drop");
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());
		
		Actions actions = new Actions(driver);
		
		 WebElement football = driver.findElement(By.id("ball"));
		 WebElement dropzone1 = driver.findElement(By.id("dropzone1"));
		 WebElement dropzone2 = driver.findElement(By.id("dropzone2"));
		 
		 actions.clickAndHold(football).moveToElement(dropzone1).release().perform();
		 if(dropzone1.findElement(By.className("dropzone-text")).getText().equals("Dropped!")) {
	        	System.out.println("Ball was dropped in Dropzone 1");
	        }
		 actions.clickAndHold(football).moveToElement(dropzone2).release().perform();
		 if(dropzone2.findElement(By.className("dropzone-text")).getText().equals("Dropped!")) {
	        	System.out.println("Ball was dropped in Dropzone 2");
	        }
		 
		 driver.close();

	}

}
