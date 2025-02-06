package advancesenarios;

import java.util.Set;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartMultiwindow 
{
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		driver.findElement(By.name("q")).sendKeys("iphone",Keys.ENTER);
		driver.findElement(By.xpath("//div[.=\"Apple iPhone 15 (Black, 128 GB)\"]")).click();
		Set<String> wins = driver.getWindowHandles();
		//System.out.println(wins);
		for (String ID : wins) 
		{
			driver.switchTo().window(ID);
			String title = driver.getTitle();
			//System.out.println(title);
			if(title.contains("Apple iPhone 15 (Black, 128 GB)\r\n"))
			{
				break;
			}
		}
		WebElement ele = driver.findElement(By.xpath("//div[@class=\"C7fEHH\"]"));
		System.out.println(ele.getText());
	}
}
