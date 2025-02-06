package advancesenarios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleWebelements {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		List<WebElement> link = driver.findElements(By.xpath("//a"));
		int count =0 ;
		for(WebElement name : link)
		{
			//System.out.println(name.getText()	);//fetches all the visible text from the application
			System.out.println(name.getAttribute("href"));// fetches all the links from the application
			count++;
		}
		System.out.println("Total links present in Amazon application :-" +count);
	}

}
