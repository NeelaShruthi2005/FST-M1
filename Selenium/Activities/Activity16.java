import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        ChromeDriver driver = new ChromeDriver();
        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://training-support.net/webelements/selects");
        driver.manage().window().maximize();

        System.out.println(driver.getTitle());
        WebElement dropdown = driver.findElement(By.cssSelector("select.h-10"));
        
        Select select = new Select(dropdown);
        
        select.selectByVisibleText("Two");
        
        String one = select.getFirstSelectedOption().getText();
        System.out.println("Selected value: " + one);
        
        select.selectByIndex(3);
        
        
        String two = select.getFirstSelectedOption().getText();
        System.out.println("Selected value: " + two);
        
        select.selectByValue("four");
        
        
        String three = select.getFirstSelectedOption().getText();
        System.out.println("Selected value: " + three);
        
        driver.close();
        

	}

}
