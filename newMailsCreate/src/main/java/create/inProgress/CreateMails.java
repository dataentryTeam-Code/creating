package create.inProgress;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import create.Pages.BaseTest;
import create.Pages.TestData;
/**********************************************************************************************************
@Name:-Miriyala Sesikiran
@Date::-August 14,2019
@Purpous:- create Mails
**********************************************************************************************************/
public class CreateMails extends BaseTest 
{
	@Test
	public void create() throws Exception
	{	       
		System.setProperty("webdriver.chrome.driver","E:\\PersonalFrameWork\\drivers\\win\\76.0.3809.68\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String userName=TestData.getData("loginDetails/userId");
		String password=TestData.getData("loginDetails/password");
		System.out.println(userName);
		System.out.println(password);
		driver.get("https://www.gmail.com");
	}
}