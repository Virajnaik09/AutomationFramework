package advancesenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartUsingAncestorAndDescendant {
public static void main(String[] args) throws Throwable {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com");
	driver.findElement(By.name("q")).sendKeys("iphone",Keys.ENTER);
	Thread.sleep(1000);
	WebElement ele = driver.findElement(By.xpath("(//div[@class=\"KzDlHZ\"])[1]/ancestor::div[@class=\"yKfJKb row\"]//div[@class=\"Nx9bqj _4b5DiR\"]"));
	System.out.println(ele.getText());
	
}
}
