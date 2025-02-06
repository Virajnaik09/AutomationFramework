package advancesenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://the-internet.herokuapp.com/nested_frames");
	driver.switchTo().frame(0);
	WebElement left = driver.findElement(By.xpath("//frame[@name=\"frame-left\"]"));
driver.switchTo().frame(left);
WebElement ele = driver.findElement(By.xpath("//body"));
System.out.println(ele.getText());
driver.switchTo().parentFrame();
WebElement middle = driver.findElement(By.xpath("//frame[@name=\"frame-middle\"]"));
	driver.switchTo().frame(middle);
	WebElement ele2 = driver.findElement(By.xpath("//body"));
	System.out.println(ele2.getText());
    driver.switchTo().parentFrame();
	WebElement right = driver.findElement(By.xpath("//frame[@name=\"frame-right\"]"));
	driver.switchTo().frame(right);
	WebElement ele3 = driver.findElement(By.xpath("//body"));
	System.out.println(ele3.getText());
//	driver.switchTo().parentFrame();
//	driver.switchTo().parentFrame();
//	driver.switchTo().parentFrame();
	driver.switchTo().defaultContent();
	WebElement bottom = driver.findElement(By.xpath("//frame[@name=\"frame-bottom\"]"));
	driver.switchTo().frame(bottom);
	String ele4 = driver.findElement(By.xpath("//body")).getText();
	System.out.println(ele4);
	driver.switchTo().defaultContent();
	driver.switchTo().frame(0);
	WebElement right1 = driver.findElement(By.xpath("//frame[@name=\"frame-right\"]"));
	driver.switchTo().frame(right1);
	WebElement ele41 = driver.findElement(By.xpath("//body"));
	System.out.println(ele41.getText());
	
}
}
//frame[@name="frame-middle"]