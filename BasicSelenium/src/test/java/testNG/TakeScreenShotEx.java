package testNG;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TakeScreenShotEx {
	@Test
	public void M1() throws Throwable 
	{
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		
		 TakesScreenshot TS = (TakesScreenshot)driver;
		File src = TS.getScreenshotAs(OutputType.FILE);
		File dst = new File("./FailedScripts.png");
	    FileUtils.copyFile(src, dst);
	}

}
