package create.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LicPage extends BaseTest
{
	public WebDriver driver;
	public WebDriverWait wait;
	public LicPage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	//Elements
	Label regiser=new Label("//input[@value='Registered User']", "register");
	@FindBy(xpath="//input[@value='Registered User']") WebElement registeredUser;
	@FindBy(xpath="//input[@name='userId']") WebElement userName;
	@FindBy(xpath="//input[@name='password']") WebElement password;
	@FindBy(xpath="//input[@name='dob']") WebElement dob;
	@FindBy(xpath="//span[text()='Sign In']/../../..") WebElement signIn;
	//methods
	public LicPage clickOnRegisteredUser() throws InterruptedException 
	{
		//regiser.elementWait;
		wait.until(ExpectedConditions.elementToBeClickable(registeredUser));
		registeredUser.click();
		return this;
	}

	public LicPage sendUserName(String value) 
	{
		//wait.until(ExpectedConditions.elementToBeClickable(userName));
		userName.sendKeys(value);
		return this;
	}
	public LicPage sendPassword(String value) 
	{
		//wait.until(ExpectedConditions.elementToBeClickable(userName));
		password.sendKeys(value);
		return this;
	}
	public LicPage sendDOB(String value) 
	{
		//wait.until(ExpectedConditions.elementToBeClickable(userName));
		dob.sendKeys(value);
		signIn.click();
		return this;
	}
}
