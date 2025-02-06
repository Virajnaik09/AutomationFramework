package practice;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Flipkart2 {
public static void main(String[] args) {			
	WebDriver driver =  new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://flipkart.com");

	driver.findElement(By.name("q")).sendKeys("iphone",Keys.ENTER);
	List<WebElement> iphoneNames = driver.findElements(By.cssSelector("[class='KzDlHZ']"));
	for(WebElement iphoneNames1 : iphoneNames)
	{
		System.out.println(iphoneNames1.getText());
    }
}
}

