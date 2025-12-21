import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://training-support.net/webelements/tables");
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());
		
		List<WebElement> rows = driver.findElements(By.xpath("//table/tbody/tr"));
		List<WebElement> columns = driver.findElements(By.xpath("//table/thead/tr/th"));
		
		System.out.println("Rows :" +rows.size() + "  and columns: " + columns.size());
		
		System.out.println("Book name before sorting: " + driver.findElement(By.xpath("//table/tbody/tr[5]/td[2]")).getText());
		 
		driver.findElement(By.xpath("//table/thead/tr/th[5]")).click(); 
		
		System.out.println("Book name after sorting: " + driver.findElement(By.xpath("//table/tbody/tr[5]/td[2]")).getText());
		
		
		 driver.close();

	}

}
