package create.Pages;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest extends Librearies
{	
	WebDriver driver=null;
	public void startBrowser() throws Exception
	{
		System.setProperty("webdriver.chrome.driver","E:\\PersonalFrameWork\\drivers\\win\\76.0.3809.68\\chromedriver.exe");	
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(240, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(TestData.getProperties("testData"));			
	}
	public void close()
	{
		driver.close();
	}
}
