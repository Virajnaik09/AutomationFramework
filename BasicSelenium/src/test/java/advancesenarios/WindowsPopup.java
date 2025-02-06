package advancesenarios;

import java.util.Set;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsPopup {
public static void main(String[] args) {
	//Approach1---> Using window Id s (can handle only two windows)
//	WebDriver driver = new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.get("https://www.flipkart.com");
//	driver.findElement(By.name("q")).sendKeys("puma",Keys.ENTER);
//	 WebElement ele = driver.findElement(By.xpath("(//img[@class=\"_53J4C-\"])[1]"));
//	 ele.click();
//	String mainID = driver.getWindowHandle();
//	System.out.println(mainID);
//	Set<String> allIDs = driver.getWindowHandles();
//	System.out.println(allIDs);
//	for(String ID : allIDs)
//	{
//		if(!mainID.equals(ID))
//		{
//			driver.switchTo().window(ID);
//		}
//	}
//	String price = driver.findElement(By.xpath("//div[@class=\"Nx9bqj CxhGGd\"]")).getText();
//	System.out.println(price);
	//Approach2---> By Using Title
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.automationtesting.in/Windows.html ");
	driver.findElement(By.xpath("//a[text()='Open New Seperate Windows']")).click();
	driver.findElement(By.xpath("//button[text()=\"click\"]")).click();
	Set<String> allIDs = driver.getWindowHandles();
	for(String ID : allIDs) {
		driver.switchTo().window(ID);
		String AllWins = driver.getTitle();
		System.out.println(AllWins);
		if(ID.contains("Selenium"))
		{
			break;
		}
	}
	driver.findElement(By.xpath("//a[.=\"Learn more & submit!\"]")).click();
}
}
