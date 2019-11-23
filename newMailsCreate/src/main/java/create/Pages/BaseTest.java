package create.Pages;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
public class BaseTest extends Librearies
{	
	WebDriver driver=null;
	public void startBrowser() throws Exception
	{		
		properties();
		driver=obj();
		waitUpto();
		url();
	}
	public void waitUpto()
	{
		driver.manage().timeouts().implicitlyWait(240, TimeUnit.SECONDS);
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
