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
		driver.manage().timeouts().implicitlyWait(240, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(TestData.getProperties("testData"));			
	}
	public void close()
	{
		driver.close();
	}
}
