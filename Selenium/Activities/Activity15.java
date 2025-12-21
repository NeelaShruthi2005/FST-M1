import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity15 {

    public static void main(String[] args) {

        ChromeDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://training-support.net/webelements/dynamic-attributes");
        driver.manage().window().maximize();

        System.out.println(driver.getTitle());

     
        driver.findElement(By.xpath("//input[@placeholder='Full name']")).sendKeys("Shruthi");
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("shruthi@gmail.com");
        driver.findElement(By.xpath("//input[@type='date']")).sendKeys("2026-05-05");
        driver.findElement(By.xpath("//textarea[contains(@id,'additional-details')]")).sendKeys("comments-123");
        driver.findElement(By.xpath("//button[text()='Submit']")).click();

       
        String successMsg = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("action-confirmation"))).getText();

        System.out.println("Success message: " + successMsg);

        driver.quit();
    }
}