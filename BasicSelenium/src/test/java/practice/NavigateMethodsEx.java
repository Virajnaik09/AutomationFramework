package practice;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethodsEx {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//driver.navigate().to("https://wwww.amazon.in");
		//driver.navigate().to(new URL("https://www.Amazon.in"));
		Thread.sleep(2000);
		driver.get("https://www.Amazon.in");
		
		Thread.sleep(2000);
		driver.navigate().back();
		
		Thread.sleep(2000);
		driver.navigate().forward();
		
		Thread.sleep(2000);
        driver.navigate().refresh();
	}

}
