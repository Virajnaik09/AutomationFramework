package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {
public static void main(String[] args) throws Throwable {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
//	driver.get("https://www.amazon.in");
//	Thread.sleep(1000);
//	driver.findElement(By.name("field-keywords")).sendKeys("puma",Keys.ENTER);
	driver.get("https://www.saucedemo.com/v1/ ");
	Thread.sleep(2000);
	driver.findElement(By.name("user-name")).sendKeys("standard_user");
	
	Thread.sleep(2000);
	driver.findElement(By.name("password")).sendKeys("secret_sauce");
	
	Thread.sleep(2000);
	driver.findElement(By.id("login-button")).click();
	
}
}
