package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OlympicMedals {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://olympics.com/en/paris-2024/medals");
		String name = driver.findElement(By.xpath("//span[text()='Germany']")).getText();
		System.out.println("Name of the country is :"+name);
		String gold = driver.findElement(By.xpath("//span[text()='Germany']/../..//span/preceding-sibling::span[@class='e1oix8v91 emotion-srm-19huvme']")).getText();
		System.out.println("Number of gold won by "+name+"is "+gold);
	}

}
//span[text()='Germany']/../..//span/preceding-sibling::span[@class='e1oix8v91 emotion-srm-19huvme']