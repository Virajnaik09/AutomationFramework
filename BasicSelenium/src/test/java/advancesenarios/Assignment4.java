package advancesenarios;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.automationtesting.in/Windows.html ");
	driver.findElement(By.xpath("//a[text()='Open New Seperate Windows']")).click();
	driver.findElement(By.xpath("//button[text()=\"click\"]")).click();
	String main = driver.getWindowHandle();
	//System.out.println(main);
	Set<String> allIDs = driver.getWindowHandles();
	//System.out.println(allIDs);
	for(String Id : allIDs)
	{
		if(!main.equals(Id))
		{
			driver.switchTo().window(Id);
		}
	}
	driver.findElement(By.xpath("//span[text()=\"Downloads\"]")).click();
//	String title = driver.findElement(By.xpath("//h1")).getText();
//	System.out.println("You Have Successfully Clicked On " + title);
}
}
