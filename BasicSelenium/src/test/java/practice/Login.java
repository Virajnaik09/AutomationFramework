package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login {

	@Test
	public void login() {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/v1/ ");
		//	driver.findElement(By.id("user-name")).sendKeys("standard_user");
		//	driver.findElement(By.id("password")).sendKeys("secret_sauce");
		//syntax 3 :- for cssSelector
		driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
		//syntax 4:- for cssSelector

		driver.findElement(By.cssSelector("input#password")).sendKeys("secret_sauce");
		//syntax 5:- for cssSelector by using className 
		//driver.findElement(By.id("login-button")).click();
		//driver.findElement(By.cssSelector(".btn_action")).click();
		//syntax 6:- for cssSelector by using className 
		driver.findElement(By.cssSelector("input.btn_action")).click();

	}
}
