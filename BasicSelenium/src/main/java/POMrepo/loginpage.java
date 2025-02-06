package POMrepo;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {
	public loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver ,this);
	}
	
@FindBy(id = "user-name")
private WebElement userTextField;

 @FindBy(css = "[data-test=\"password\"]")
 private WebElement passTextField;
 
 @FindBy(xpath = "//input[@value=\"LOGIN\"]")
 private WebElement loginButton;

public WebElement getUserTextField() {
	return userTextField;
}

public WebElement getPassTextField() {
	return passTextField;
}

public WebElement getLoginButton() {
	return loginButton;
}
public void loginTOpage (String username , String password)
{
	userTextField.sendKeys(username);
	passTextField.sendKeys(password);
	loginButton.click();
}
 

}
