package pomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="username")
	public WebElement userNameTextfield;
	
	
	@FindBy(name="pwd")
	public WebElement passwordTextfield;
	
	@FindBy(xpath="//div[text()='Login ']")
	public WebElement loginButton;
	
	//Business Logic
	public void loginAction(String username,String password)
	{
		userNameTextfield.sendKeys(username);
		passwordTextfield.sendKeys(password);
		loginButton.click();
	}
	
	
	
	
	
	

}
