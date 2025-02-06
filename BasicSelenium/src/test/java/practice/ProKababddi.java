package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ProKababddi {
	
	@Test
	public void kabaddi() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/search?q=pro+kabaddi+points+table+2024");
//		WebElement name = driver.findElement(By.xpath("//div[@class='tsp-tln']"));
//		System.out.println("Name of the table topper in pro kabaddi 2024 is :"+name.getText());
//		WebElement name1 = driver.findElement(By.xpath("//div[@class='tsp-tln']//span/../../following-sibling::td[2]"));
//		System.out.println("Number of wins of the table topper in pro kabaddi 2024 is :"+name1.getText());
//		WebElement name3 = driver.findElement(By.xpath("//div[@class='tsp-tln']//span/../../following-sibling::td[6]"));
//		System.out.println("Points of the table topper in pro kabaddi 2024 is :"+name3.getText());
	    WebElement name = driver.findElement(By.xpath("//span[@class='tsp-ftdg']/../..//td[@class='tsp-cpl tsp-w']"));
	    System.out.println("Name of the table topper in pro kabaddi 2024 is :"+name.getText());
	    WebElement name1 = driver.findElement(By.xpath("//span[@class='tsp-ftdg']/../..//td[@class='tsp-cpl tsp-w']/following-sibling::td[2]"));
    	System.out.println("Number of wins of the table topper in pro kabaddi 2024 is :"+name1.getText());
    	WebElement name3 = driver.findElement(By.xpath("//span[@class='tsp-ftdg']/../..//td[@class='tsp-cpl tsp-w']/following-sibling::td[6]"));
    	System.out.println("Points of the table topper in pro kabaddi 2024 is :"+name3.getText());
    	driver.quit();
	}
}
