package advancesenarios;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class HandlingWait {

	public static void main(String[] args) {
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.saucedemo.com/v1/");
   //version :- 3
//    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    //or
//   Timeouts time = driver.manage().timeouts();
//   time.implicitlyWait(10,TimeUnit.SECONDS);
   
   //version :- 4
 //  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
   //or
//   Timeouts time = driver.manage().timeouts();
//   time.implicitlyWait(Duration.ofSeconds(10));
    driver.findElement(By.id("user-name")).sendKeys("standard_user");
    driver.findElement(By.id("password")).sendKeys("secret_sauce");
    WebElement login = driver.findElement(By.id("login-button"));
//    WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
//    wait.until(ExpectedConditions.elementToBeClickable(login));
//    login.click();
//    wait.until(ExpectedConditions.titleContains("Swag Labs"));
//    driver.findElement(By.xpath("(//button[text()=\"ADD TO CART\"])[1]")).click();
  FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
  wait.withTimeout(Duration.ofSeconds(10));
  wait.pollingEvery(Duration.ofSeconds(1));
  wait.until(ExpectedConditions.elementToBeClickable(login));
  login.click();
  wait.until(ExpectedConditions.titleContains("Swag Labs"));
  WebElement ele = driver.findElement(By.xpath("(//button[text()=\"ADD TO CART\"])[1]"));
  ele.click();
   }

}
