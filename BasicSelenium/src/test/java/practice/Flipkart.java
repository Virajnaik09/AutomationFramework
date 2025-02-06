package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com");
		
		driver.findElement(By.name("q")).sendKeys("iphone",Keys.ENTER);
		
		//driver.findElement(By.className("KzDlHZ")).click();

        driver.findElement(By.cssSelector("[data-id='MOBGTAGPFDXBQ9BH']")).click();
        System.out.println(driver.findElement(By.cssSelector("[class='VU-ZEz']")).getText());
//		System.out.println(dri);
		//System.out.println(driver.getTitle().contains("\"VU-ZEz\""));
		//driver.findElements(By.cssSelector("[data-id='MOBGTAGPFDXBQ9BH']")).toString().getChars(0, 0, null, 0);
//		String dri = driver.findElement(By.linkText("Apple iPhone 15 (Pink, 128 GB)")).getText();
//		System.out.println(dri);
}
}