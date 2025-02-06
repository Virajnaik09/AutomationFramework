package advancesenarios;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDropdownUsingRobotClass {
public static void main(String[] args) throws Throwable {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com");
	driver.findElement(By.xpath("//a[text()=\"Create new account\"]")).click();
	WebElement daylist = driver.findElement(By.xpath("//select[@id=\"day\"]"));
	daylist.click();
	Robot robo = new Robot();
	Thread.sleep(3000);
	robo.keyPress(KeyEvent.VK_DOWN);
	robo.keyRelease(KeyEvent.VK_DOWN);
	Thread.sleep(1000);
	robo.keyPress(KeyEvent.VK_DOWN);
	robo.keyRelease(KeyEvent.VK_DOWN);
	Thread.sleep(1000);
	robo.keyPress(KeyEvent.VK_DOWN);
	robo.keyRelease(KeyEvent.VK_DOWN);
	Thread.sleep(1000);
	robo.keyPress(KeyEvent.VK_UP);
	robo.keyRelease(KeyEvent.VK_UP);
	Thread.sleep(1000);
	robo.keyPress(KeyEvent.VK_UP);
	robo.keyRelease(KeyEvent.VK_UP);
	
}
}
