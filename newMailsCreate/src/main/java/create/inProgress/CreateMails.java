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
		wait=waitUntilvisible(obj);
		RediffMail rediff=new RediffMail(obj);
		String FullName=stringGenerator(8);
		rediff.fullName(FullName).chooseMail(FullName);
		String password=PasswordGenerator();
		rediff.choosePassword(password);
	}
}
