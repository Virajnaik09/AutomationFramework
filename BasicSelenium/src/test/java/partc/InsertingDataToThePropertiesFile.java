package partc;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class InsertingDataToThePropertiesFile {
public static void main(String[] args) throws Throwable {
	FileInputStream fis = new FileInputStream("src/test/resources/login1.properties");
	Properties pro = new Properties();
	pro.setProperty("url", "https://www.saucedemo.com/v1");
	pro.setProperty("username", "standard_user");
	pro.setProperty("password", "secret_sauce");
	FileOutputStream fos = new FileOutputStream("src/test/resources/login1.properties");
	pro.store(fos, "new file");
}
}
