package advancesenarios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HAndlingAutoSuggestion {
public static void main(String[] args) throws Throwable {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
//	driver.get("https://www.flipkart.com");
//	driver.findElement(By.name("q")).sendKeys("infinix");
//	Thread.sleep(2000);
//	List<WebElement> allsugg = driver.findElements(By.xpath("//ul[@class=\"_1sFryS _2x2Mmc _3ofZy1\"]//li"));
//for(WebElement sugg : allsugg)
//{
//	System.out.println(sugg.getText());
//	if(sugg.getText().contains("infinix hot 50 5g"));
//	{sugg.click();}
//}
	driver.get("https://amazon.in");
	driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]")).sendKeys("nike");
	Thread.sleep(2000);

	List<WebElement> allsugg = driver.findElements(By.xpath("//div[@class=\"s-suggestion s-suggestion-ellipsis-direction\"]"));
	for(WebElement sugg : allsugg)
	{
		System.out.println(sugg.getText());
		Thread.sleep(2000);
		if(sugg.getText().contains("nike running shoes for man"));
		{
		sugg.click();
		}
	}
}}

