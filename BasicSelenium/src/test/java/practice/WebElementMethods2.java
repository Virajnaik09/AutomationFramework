package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class WebElementMethods2 {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://facebook.com");
		//method : 4
		//	WebElement username = driver.findElement(By.xpath("//input[@id='email']"));
		//	username.sendKeys("viraj naik");
		//	username.clear();
		//	username.sendKeys("naik viraj");
		//method : 5
		//	WebElement img = driver.findElement(By.xpath("//img[@class=\"fb_logo _8ilh img\"]"));
		//	if(img.isDisplayed())
		//	{
		//		System.out.println("Element is Displayed");
		//	}
		//	else
		//	{
		//		System.out.println("Element is not Displayed");
		//	}
		//method : 6
		//	WebElement ele = driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
		//	if(ele.isEnabled())
		//	{
		//		ele.click();
		//	}
		//	else
		//	{
		//		System.out.println("Disabaled");
		//	}
		//	//method : 7
		//	WebElement ele1 = driver.findElement(By.xpath("//input[@value='2']"));
		//	//ele1.click();
		//	if(ele1.isSelected())
		//	{
		//		System.out.println("selected");
		//	}
		//	else
		//	{
		//		System.out.println("Not selected");
		//	}
		//	Thread.sleep(2000);
		//method : 8
		//	WebElement ele2 = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		//	System.out.println(ele2.getLocation().getX());
		//	ele2.getLocation().getY();
		//method : 
		//	ele2.getSize().getHeight();
		//	ele2.getSize().getWidth();
		//	
		//	//method : 9
		//System.out.println(ele2.getRect().getHeight());
		////	ele2.getRect().getWidth();
		////	ele2.getRect().getX();
		////	ele2.getRect().getY();
		    // driver.get("https://amazon.in");
		////method : 10
		//WebElement link = driver.findElement(By.xpath("//a[text()=\"Today's Deals\"]"));
		//System.out.println(link.getAttribute("class"));
		////method : 11
		//System.out.println(link.getTagName());
		////method : 12
		//System.out.println(link.getDomAttribute("class"));
		////method : 13
		//System.out.println(link.getDomProperty("text"));
		// WebElement ele = driver.findElement(By.xpath("//a[text()=\"MX Player\"]"));
		////method : 14
		// System.out.println(ele.getAriaRole());
//		  //method : 15
//		   WebElement vir = driver.findElement(By.xpath("//a[text()=\"Today's Deals\"]"));
//		   System.out.println(vir.getAccessibleName());
	      //method : 16
//		   WebElement raj = driver.findElement(By.xpath("//a[text()=\"Today's Deals\"]"));
//		   System.out.println(raj.getCssValue("color"));
//		   System.out.println(raj.getCssValue("font-size"));
		driver.get("https://www.cricbuzz.com");
	WebElement vir = driver.findElement(By.xpath("//img[@title='Cricbuzz Logo'][1]"));
		  System.out.println(vir.getAccessibleName());
		  System.out.println(vir.getCssValue("color"));
	}
}
