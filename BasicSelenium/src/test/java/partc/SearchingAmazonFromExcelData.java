package partc;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SearchingAmazonFromExcelData {
	@Test
public void amazon()throws Throwable, IOException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in");
	FileInputStream fis = new FileInputStream("C:\\Users\\viraj\\Downloads\\Book1.xlsx");
	Workbook book = WorkbookFactory.create(fis);
	Sheet sheet = book.getSheet("Sheet2");
	Row row = sheet.getRow(0);
	Cell column = row.getCell(0);
	String excel = column.getStringCellValue();
	//System.out.println(excel);
	driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]")).sendKeys(excel,Keys.ENTER);
	Thread.sleep(1000);
	driver.quit();
}
}
