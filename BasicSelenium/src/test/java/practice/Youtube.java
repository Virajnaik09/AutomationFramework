package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://youtube.com");
		driver.findElement(By.cssSelector("input#search")).sendKeys("tu hai kahan by zayan malik");
		driver.findElement(By.cssSelector("[id='search-icon-legacy']")).click();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
	}

}
