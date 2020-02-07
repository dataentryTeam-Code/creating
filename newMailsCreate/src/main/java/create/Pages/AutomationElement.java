package create.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutomationElement 
{
	private WebDriver driver;
	public AutomationElement(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public AutomationElement(String locator, String descriptionOfElement) 
	{
		
		driver.findElement(By.xpath(locator)).click();;
	}
	public AutomationElement(String locator, String logName, String placeHolder) 
	{
		// TODO Auto-generated constructor stub
	}
	public Label newDynamicObject(String logName, String replacementString) 
	{
		// TODO Auto-generated method stub
		return null;
	}
}
