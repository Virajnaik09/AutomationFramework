package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com");
	driver.findElement(By.name("q")).sendKeys("bluetooth earphone");
	driver.findElement(By.cssSelector("[class='_2iLD__']")).click();
	Thread.sleep(2000);
//	List<WebElement> BluetoothNames = driver.findElements(By.cssSelector("[class='wjcEIp']"));
//	
//    for(WebElement names : BluetoothNames)
//{
//    	
//	System.out.println(names.getText());
//}
//	List<WebElement> BluetoothNames1 = driver.findElements(By.cssSelector("[class='Nx9bqj']"));
//	
//    for(WebElement names1 : BluetoothNames1)
//{
//	System.out.println(names1.getText());
//	System.out.println(driver.findElement(By.xpath("(//a[@class='wjcEIp'][1])")).getText());
	System.out.println(driver.findElement(By.xpath("(//a[@class='wjcEIp'][2])")).getText());

}
}

