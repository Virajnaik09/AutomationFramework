package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Flipkart1 {
	@Test
	public void flip() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://flipkart.com");
		driver.manage().window().maximize();
//		driver.findElement(By.name("q")).sendKeys("nike shoes",Keys.ENTER);
//		System.out.println(driver.findElement(By.cssSelector("[title=\"Winflo 10 Running Shoes For Men\"]")).getText());

		driver.findElement(By.name("q")).sendKeys("iphone",Keys.ENTER);
		List<WebElement> dri = driver.findElements(By.cssSelector("[class='KzDlHZ']"));
	
	}

	
}
