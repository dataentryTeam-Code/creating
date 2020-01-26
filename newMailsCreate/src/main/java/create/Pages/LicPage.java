package create.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class LicPage extends BaseTest
{
	public LicPage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	//Elements
	public WebDriver driver;
	@FindBy(xpath="//input[@value='Registered User']") WebElement registeredUser;
	
	//methods
	public void clickOnRegisteredUser() 
	{
		registeredUser.click();;
	}
}
