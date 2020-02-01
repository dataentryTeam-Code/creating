package create.Pages;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
public class BaseTest extends Librearies
{	
	public WebDriver driver;
	public WebDriver startBrowser() throws Exception
	{		
		properties();
		driver=obj();
		waitUpto();
		maximize();
		url();
		return driver;
	}
	public void waitUpto()
	{
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}
	public void maximize()
	{
		driver.manage().window().maximize();
	}
	public void url() throws Exception
	{
		driver.get(TestData.getProperties("testData"));	
	}
	public void close()
	{
		driver.close();
	}	
	
}
