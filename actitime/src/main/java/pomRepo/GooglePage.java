package pomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GooglePage 
{
	
	public GooglePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="q")
	public WebElement googleSearchBox;
	
	@FindBy(xpath="(//input[@value='Google Search'])[2]")
	public WebElement googleSearchButton;
}
