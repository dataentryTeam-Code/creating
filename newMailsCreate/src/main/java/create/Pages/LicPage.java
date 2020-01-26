package create.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
public class LicPage extends BaseTest
{
	public WebDriver driver;
	public LicPage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	public void clickOnRegisteredUser() 
	{
		driver.findElement(By.xpath("//input[@value='Registered User']")).click();
	}
}
