package advancesenarios;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment1 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Frames.html");
		//1---> By Index number
		//driver.switchTo().frame(0);
		//	WebElement txt = driver.findElement(By.xpath("//input[@type=\"text\"]"));
		//	Actions act = new Actions(driver);
		//	act.moveToElement(txt).click().sendKeys("viraj naik").perform();
		//2---> By Id attribute
		//driver.switchTo().frame("singleframe");
		//		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("viraj naik");
		//3---> By Name Attribute
		//		driver.switchTo().frame("SingleFrame");
		//		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("viraj naik");
		//4---> By Frame Element
		//WebElement frame = driver.findElement(By.xpath("//iframe[@id=\"singleframe\"]"));
		//driver.switchTo().frame(frame);
		//driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("naik");
	}
}
