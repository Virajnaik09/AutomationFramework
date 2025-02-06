package advancesenarios;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingScrollBarUsingRobotClass {
public static void main(String[] args) throws Throwable {
	WebDriver driver =  new ChromeDriver();
	driver.get("https://www.amazon.com");
	driver.manage().window().maximize();
	Robot robo = new Robot();
	robo.keyPress(KeyEvent.VK_PAGE_DOWN);
	robo.keyRelease(KeyEvent.VK_PAGE_DOWN);
	Thread.sleep(1000);
	robo.keyPress(KeyEvent.VK_PAGE_DOWN);
	robo.keyRelease(KeyEvent.VK_PAGE_DOWN);
	Thread.sleep(1000);
	robo.keyPress(KeyEvent.VK_PAGE_DOWN);
	robo.keyRelease(KeyEvent.VK_PAGE_DOWN);
	Thread.sleep(1000);
	robo.keyPress(KeyEvent.VK_PAGE_DOWN);
	robo.keyRelease(KeyEvent.VK_PAGE_DOWN);
	Thread.sleep(1000);
	robo.keyPress(KeyEvent.VK_PAGE_DOWN);
	robo.keyRelease(KeyEvent.VK_PAGE_DOWN);
}
}
