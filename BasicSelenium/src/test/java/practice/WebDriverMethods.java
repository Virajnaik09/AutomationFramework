package practice;

import java.text.FieldPosition;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	// method :1
	driver.get("https://www.Amazon.in");
	// method :2
	System.out.println(driver.getTitle());
	// method :3
	System.out.println(driver.getCurrentUrl());
	// method :4
	//System.out.println(driver.getPageSource());
	// method :5
	driver.manage().window().maximize();
	// method :6
	driver.manage().window().minimize();
	// method :7 
	//driver.close();
	//driver.quit();
	//driver.manage().window().fullscreen();
	Dimension size = driver.manage().window().getSize();
	System.out.println(size);
	System.out.println(size.height);
	System.out.println(size.width);
	//System.out.println(driver.manage().window().getSize());
//	Dimension size1 = new Dimension(800,800);
//	driver.manage().window().setSize(size1);
	driver.manage().window().setSize(new Dimension(800,500));
	System.out.println(driver.manage().window().getPosition());
    driver.manage().window().setPosition(new Point(300,250));
}
}
