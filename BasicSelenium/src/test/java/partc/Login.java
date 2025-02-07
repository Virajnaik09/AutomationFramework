package partc;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import POMrepo.loginpage;

public class Login {
	
	//Engg 1
	@Test
	public void login() throws Throwable {
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		FileInputStream fis2 = new FileInputStream("src/test/resources/login1.properties");
		Properties pro = new Properties();
		pro.load(fis2);
		String URL = pro.getProperty("url");
		String USERNAME = pro.getProperty("username");
		String PASSWORD = pro.getProperty("password");
		loginpage login = new loginpage(driver);
		driver.get(URL);
//		login.getUserTextField().sendKeys(USERNAME);
//		login.getPassTextField().sendKeys(PASSWORD);
//		login.getLoginButton().click();
	    login.loginTOpage(USERNAME, PASSWORD);
	    Thread.sleep(1000);
	    driver.quit();
		
	}

}
