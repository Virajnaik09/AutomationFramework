package advancesenarios;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleWindows {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
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
		driver.findElement(By.xpath("//a[.=\"Learn more & submit!\"]")).click();
		Set<String> all = driver.getWindowHandles();
		//System.out.println(all);
		for (String ID : all) 
		{
			driver.switchTo().window(ID);
			String title = driver.getTitle();
			//System.out.println(title);
			if(ID.contains("SeleniumConf & AppiumConf"))
			{
				break;
			}
		}
		driver.findElement(By.xpath("//a[.=\"Veles e Vents\"]")).click();
		//driver.close();----> Closes a single tab
		//driver.switchTo().window(main);
		Set<String> all1 = driver.getWindowHandles();
		//System.out.println(all1);
		for (String ID1 : all1) 
		{
			driver.switchTo().window(ID1);
			String title1 = driver.getTitle();
			System.out.println(title1);
			if(title1.contains("Frames & windows"))
			{
				break;
			}
		}
		driver.findElement(By.xpath("//a[.=\"Home\"]")).click();
		//driver.quit();----> Closes all the windows + closes the browser also	
}
	}
