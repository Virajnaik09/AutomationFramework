package advancesenarios;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class LaunchingPrivateBrowser {
public static void main(String[] args) {
//	ChromeOptions opt = new ChromeOptions();
//	opt.addArguments("--incognito");
//	WebDriver driver = new ChromeDriver(opt);
//	driver.get("https://www.amazon.in");
	EdgeOptions edg = new EdgeOptions();
	edg.addArguments("--InPrivate");
	WebDriver driver = new EdgeDriver(edg);
	driver.get("https://www.amazon.in");
}
}
