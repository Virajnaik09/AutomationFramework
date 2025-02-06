package advancesenarios;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment2 {
public static void main(String[] args) throws Throwable {
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	driver.get("https://www.globalsqa.com/demo-site/draganddrop/#google_vignette");
driver.switchTo().frame(3);
	Thread.sleep(2000);
WebElement drag1 = driver.findElement(By.xpath("//h5[text()=\"High Tatras\"]"));
WebElement drag2 = driver.findElement(By.xpath("(//li[contains(@class,'ui')])[2]"));
WebElement drop = driver.findElement(By.xpath("//div[@id=\"trash\"]"));
WebElement drag3 = driver.findElement(By.xpath("(//li[contains(@class,'ui')])[3]"));
WebElement drag4 = driver.findElement(By.xpath("(//li[contains(@class,'ui')])[4]"));
Actions act = new Actions(driver);
act.dragAndDrop(drag1, drop).perform();
act.dragAndDrop(drag2, drop).perform();
act.dragAndDrop(drag3, drop).perform();
act.dragAndDrop(drag4, drop).perform();
}
}
