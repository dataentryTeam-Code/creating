package create.Pages;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
public class BaseTest extends Librearies
{	
	public WebDriver driver=null;
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
