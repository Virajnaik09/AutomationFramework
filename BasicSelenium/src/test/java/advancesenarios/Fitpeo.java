package advancesenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Fitpeo {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.fitpeo.com/revenue-calculator");
	WebElement drag = driver.findElement(By.xpath("//input[@aria-orientation=\"horizontal\"]"));
	Actions act = new Actions(driver);
for( int i=0 ;i<2000; i++)
{  
{
	act.clickAndHold(drag).release().perform();
}
}
}}