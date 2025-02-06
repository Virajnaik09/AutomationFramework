package advancesenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingKeyboardUsingKeysClass {
public static void main(String[] args) throws Throwable {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(1000);
	driver.get("https://www.saucedemo.com"); 
//	 driver.findElement(By.name("user-name")).sendKeys("standard_user");
//	 driver.findElement(By.id("password")).sendKeys("secret_sauce",Keys.ENTER);
//	 WebElement user = driver.findElement(By.name("user-name"));
//	 user.sendKeys("standard_user");
//	 user.sendKeys(Keys.TAB,"secret_sauce",Keys.ENTER);
}
}
