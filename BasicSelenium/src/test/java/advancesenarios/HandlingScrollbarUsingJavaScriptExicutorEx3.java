package advancesenarios;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingScrollbarUsingJavaScriptExicutorEx3 {
	public static void main(String[] args) throws Throwable {
		WebDriver driver =  new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
	    JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        Thread.sleep(2000);
        js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");

	}
}