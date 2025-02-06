package advancesenarios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BigBasket {
public static void main(String[] args) throws Throwable {
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.bigbasket.com");
	WebElement search = driver.findElement(By.xpath("//div[@class=\"Header___StyledQuickSearch2-sc-19kl9m3-0 gzbZOD\"]//input[1]"));
	Thread.sleep(2000);
	search.sendKeys("apples");
	Thread.sleep(2000);
	 List<WebElement> sugg = driver.findElements(By.xpath("//div[@class=\"Header___StyledQuickSearch2-sc-19kl9m3-0 gzbZOD\"]//li"));
	 for(WebElement allsugg : sugg) {
	{if(allsugg.getText().contains("Apple - Ambri"))
	{
		System.out.println(allsugg.getText());
		Thread.sleep(2000);
	}
	}allsugg.click();
	
	 }}}

