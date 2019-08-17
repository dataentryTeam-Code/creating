package create.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;

public class Librearies //extends Label
{
	public WebDriver driver=null;
	public void properties() throws Exception 
	{
		final String key=TestData.getProperties("key");
		final String path=TestData.getProperties("path");
		System.setProperty(key,path);		
	}
	public WebDriver obj() throws Exception
	{
		final String browser=TestData.getProperties("browser");
		if(browser.equalsIgnoreCase("chrome"))
		{
			    driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			        driver=new FirefoxDriver();	
		}
		else if(browser.equalsIgnoreCase("ie"))
		{
	        driver=new InternetExplorerDriver();
		}
		else if(browser.equalsIgnoreCase("opera"))
		{
			OperaOptions c=new OperaOptions();
			c.setBinary("C:\\Program Files\\Opera\\53.0.2907.99\\opera.exe");
			System.setProperty("webdriver.opera.driver","H:\\Selenium\\operadriver.exe");
	        driver=new OperaDriver(c);
		}
		else
		{
			System.out.println("invalid browser name");
			System.exit(0);
		}
		return driver;
	}
	public void element() 
	{
		
	}
}
