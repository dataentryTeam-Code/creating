package create.Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class BaseTest extends Global
{	
	WebDriver driver=null;
	public void startBrowser(String key) throws Exception 	{
		System.setProperty("webdriver.chrome.driver","E:\\PersonalFrameWork\\drivers\\win\\76.0.3809.68\\chromedriver.exe");	
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(240, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(TestData.getProperties(key));		
	}
	public void close()
	{
		driver.close();
	}
}
