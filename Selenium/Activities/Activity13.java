import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://training-support.net/webelements/tables");
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());
		
		List<WebElement> rows = driver.findElements(By.xpath("//table/tbody/tr"));
		List<WebElement> columns = driver.findElements(By.xpath("//table/thead/tr/th"));
		
		System.out.println("Rows :" +rows.size() + "  and columns: " + columns.size());
		
		List<WebElement> thirdRow = driver.findElements(By.xpath("//table[contains(@class, 'table-auto')]/tbody/tr[3]/td"));
        System.out.println("Third row cell values: ");
        for(WebElement cell : thirdRow) {
            System.out.println(cell.getText());
        }
        
        WebElement cellValue = driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]"));
        System.out.println("Second row, second cell value: " + cellValue.getText());

		
		driver.close();

	}

}
