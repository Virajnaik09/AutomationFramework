package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class DemoAutomationTesting {
	public static void main(String[] args)  {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]")).sendKeys("Viraj");
		driver.findElement(By.xpath("//input[@placeholder=\"Last Name\"]")).sendKeys("Naik");
		driver.findElement(By.xpath("//textarea[@ng-model=\"Adress\"]")).sendKeys("Gaongeri,majali,karwar");
		driver.findElement(By.xpath("//input[@ng-model=\"EmailAdress\"]")).sendKeys("Virajrj09@gmail.com");
		driver.findElement(By.xpath("//input[@type=\"tel\"]")).sendKeys("9686101337");
		driver.findElement(By.xpath("//input[@ng-model=\"radiovalue\"]")).click();
		driver.findElement(By.id("checkbox1")).click();
		WebElement selectdrpele = driver.findElement(By.xpath("//select[contains(@id,'Skills')]"));
		Select selectdrp = new Select(selectdrpele);
		selectdrp.selectByVisibleText("Engineering");
				WebElement selectdrpele1 = driver.findElement(By.xpath("//select[contains(@id,'countries')]"));
				Select selectdrp1 = new Select(selectdrpele1);
				selectdrp1.selectByVisibleText("Select Country");
//				WebElement drpselect0 = driver.findElement(By.xpath("//select[contains(@class,'ui')]"));
//              driver.findElement(By.xpath("//SPAN[@role='combobox']")).click();
				WebElement drpselect2 = driver.findElement(By.xpath("//select[contains(@id,'yearbox')]"));
				Select select = new Select(drpselect2);
				select.selectByVisibleText("1999");
				WebElement drpselect3 = driver.findElement(By.xpath("//select[contains(@placeholder,'Month')]"));
				Select select1= new Select(drpselect3);
				select1.selectByVisibleText("November");
				WebElement drpselect4 = driver.findElement(By.xpath("//select[contains(@id,'daybox')]"));
				Select select2= new Select(drpselect4);
				select2.selectByVisibleText("9");
				driver.findElement(By.xpath("//input[contains(@id,'firstpassword')]")).sendKeys("Virajnaik@123");
				driver.findElement(By.xpath("//input[contains(@id,'secondpassword')]")).sendKeys("Virajnaik@12");
				driver.findElement(By.xpath("//button[contains(@id,'submitbtn')]")).click();

				
				
	}

}
