import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.security.spec.InvalidKeySpecException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CalenderPopUp {
public static void main(String[] args) throws Throwable {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.makemytrip.com");
	Actions act = new Actions(driver);
	act.moveByOffset(10, 20).click().perform();
	driver.findElement(By.xpath("//span[.=\"Departure\"]")).click();
	Robot robo = new Robot();
	robo.keyPress(KeyEvent.VK_PAGE_UP);
	robo.keyRelease(KeyEvent.VK_PAGE_UP);
	//Approach-->1
	//driver.findElement(By.xpath("//div[.=\"November 2024\"]/../..//div[@class=\"DayPicker-Month\"]//p[text()=\"30\"]")).click();
	//Approach-->2
	//driver.findElement(By.xpath("//div[.=\"November 2024\"]/ancestor::div[@class=\"DayPicker-Month\"]//p[text()=\"30\"]")).click();
	//Approach-->3
	//driver.findElement(By.xpath("//div[.=\"November 2024\"]/ancestor::div[@class=\"DayPicker-Month\"]/descendant::p[text()=\"30\"]")).click();
	String month = "December 2024";
	String day = "25";
	driver.findElement(By.xpath("//div[.=\""+month+"\"]/ancestor::div[@class=\"DayPicker-Month\"]/descendant::p[text()=\""+day+"\"]")).click();
}
}
