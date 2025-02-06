package advancesenarios;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserNativePopUps {
public static void main(String[] args) throws Throwable {
//	ChromeOptions opt = new ChromeOptions();
//	opt.addArguments("--disable-notification");
//	WebDriver driver = new ChromeDriver(opt);
//	driver.manage().window().maximize();
//	driver.get("https://in.puma.com/in/en");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.irctc.co.in/nget/train-search");
	Robot robo = new Robot();
	   //for canceling notification
	robo.keyPress(KeyEvent.VK_TAB);
	robo.keyRelease(KeyEvent.VK_TAB);
	robo.keyPress(KeyEvent.VK_TAB);
	robo.keyRelease(KeyEvent.VK_TAB);
	robo.keyPress(KeyEvent.VK_TAB);
	robo.keyRelease(KeyEvent.VK_TAB);
	Thread.sleep(2000);
	robo.keyPress(KeyEvent.VK_ENTER);
	robo.keyRelease(KeyEvent.VK_ENTER);
	//for blocking notification

}
}
