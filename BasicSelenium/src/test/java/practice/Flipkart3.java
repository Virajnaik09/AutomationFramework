package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart3 {
	public static void main(String[] args) throws InterruptedException {			
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://flipkart.com");

		driver.findElement(By.name("q")).sendKeys("iphone");
		driver.findElement(By.cssSelector("[class='_2iLD__']")).click();
		Thread.sleep(5000);
//		WebElement price = driver.findElement(By.xpath("//div[text()='Apple iPhone 15 (Black, 128 GB)']/../..//div[@class='Nx9bqj _4b5DiR']"));
//		System.out.println(price.getText());
		WebElement price = driver.findElement(By.xpath("//div[text()='Apple iPhone 15 (Black, 128 GB)']/../following-sibling::div//div[@class='Nx9bqj _4b5DiR']"));
		System.out.println(price.getText());
}
}
