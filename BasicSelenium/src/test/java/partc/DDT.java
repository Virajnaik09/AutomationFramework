package partc;

import java.io.FileInputStream;
import java.io.Reader;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DDT {
	
	
	//virajnaik
public static void main(String[] args) throws Throwable {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	//Step 1---> Path connection from local disc
	//FileInputStream fis = new FileInputStream("C:\\Users\\viraj\\Downloads\\login1.properties");
	//From the project
	FileInputStream fis2 = new FileInputStream("src/test/resources/login1.properties");
	//Step 2---> Loading the Properties to the keys
	Properties pro = new Properties();
	pro.load(fis2);
	//Step 3---> Storing the properties into the variables
	String URL = pro.getProperty("url");
	String USERNAME = pro.getProperty("username");
	String PASSWORD = pro.getProperty("password");
	driver.get(URL);
	driver.findElement(By.cssSelector("#user-name")).sendKeys(USERNAME);
	driver.findElement(By.cssSelector("input#password")).sendKeys(PASSWORD);
    driver.findElement(By.cssSelector("input.btn_action")).click();

	
}
}
