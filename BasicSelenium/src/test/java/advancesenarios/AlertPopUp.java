package advancesenarios;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		//driver.findElement(By.xpath("//button[.=\"Click for JS Alert\"]")).click();
		//driver.findElement(By.xpath("//button[.=\"Click for JS Confirm\"]")).click();
		driver.findElement(By.xpath("//button[.=\"Click for JS Prompt\"]")).click();
		Alert alt = driver.switchTo().alert();
		String txt = alt.getText();
		System.out.println(txt);
		alt.sendKeys("viraj naik");
		Thread.sleep(2000);
		alt.accept();
		//alt.dismiss();
	}

}
