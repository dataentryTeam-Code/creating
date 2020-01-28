package create.inProgress;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import create.Pages.BaseTest;
import create.Pages.LicPage;
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
		WebDriver obj=startBrowser();
		LicPage lic=new LicPage(obj);
		lic.clickOnRegisteredUser();
		lic.sendUserName(TestData.getData("mom_userId")).sendPassword(TestData.getData("lic_password"))
		.sendDOB(TestData.getData("mom_DOB"));
	}
}
