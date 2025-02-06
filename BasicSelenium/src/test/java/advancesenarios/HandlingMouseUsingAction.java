package advancesenarios;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingMouseUsingAction {
public static void main(String[] args) throws Throwable {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	//driver.get("https://www.amazon.in");
//	WebElement ele = driver.findElement(By.xpath("//div[text()=\"EN\"]"));
//	Actions act = new Actions(driver);
//	act.moveToElement(ele).perform();
	
//	WebElement ele = driver.findElement(By.xpath("//a[text()=\"Today's Deals\"]"));
//	Actions act = new Actions(driver);
//	act.contextClick(ele).perform();
//	driver.get("https://www.saucedemo.com");
//	WebElement USERNAME = driver.findElement(By.name("user-name"));
//	WebElement PASSWORD = driver.findElement(By.name("password"));
//	WebElement LOGIN = driver.findElement(By.xpath("//input[@name=\"login-button\"]"));
//	Actions act = new Actions(driver);
//	act.sendKeys(USERNAME,"standard_user").perform();
//	act.sendKeys(PASSWORD,"secret_sauce").perform();
//	act.click(LOGIN).perform();
//	//act.sendKeys(USERNAME,"standard_user").sendKeys(PASSWORD,"secret_sauce").click(LOGIN).perform();
//	driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
//	WebElement drag = driver.findElement(By.id("draggable"));
//	WebElement drop = driver.findElement(By.id("droppable"));
// 	Actions act = new Actions(driver);
// 	act.clickAndHold(drag).perform();
// 	act.release(drop).perform();
 	//or
// 	act.clickAndHold(drag).release(drop).build().perform();
 	//or
 	//act.dragAndDrop(drag, drop).perform();
 	driver.get("https://www.makemytrip.com");
	Actions act = new Actions(driver);
	Thread.sleep(3000);
act.moveByOffset(10, 20).click().perform();

}
}
