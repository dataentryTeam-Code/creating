package create.inProgress;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import create.Pages.BaseTest;
import create.Pages.LicPage;
import create.Pages.TestData;
/**********************************************************************************************************
@Name:-Miriyala Sesikiran
@Date::-Feb 01,2020
@Purpous:- Login Dad Lic Policy
**********************************************************************************************************/
public class DadLic extends BaseTest 
{
	@Test
	public void create() throws Exception
	{
		WebDriver obj=startBrowser();
		LicPage lic=new LicPage(obj);
		lic.clickOnRegisteredUser();
		lic.sendUserName(TestData.getData("dad_userId")).sendPassword(TestData.getData("lic_password"))
		.sendDOB(TestData.getData("dad_DOB"));
	}
}