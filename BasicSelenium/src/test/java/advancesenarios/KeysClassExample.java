package advancesenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeysClassExample {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.saucedemo.com");
	WebElement user = driver.findElement(By.name("user-name"));
	user.sendKeys("virajnaik337@gmail.com");
	user.sendKeys(Keys.CONTROL,"a");
	user.sendKeys(Keys.CONTROL,"c");
//	WebElement pass = driver.findElement(By.id("password"));
//	pass.sendKeys(Keys.CONTROL,"v");
	user.sendKeys(Keys.TAB,Keys.CONTROL,"v");
}
}
