package create.inProgress;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import create.Pages.BaseTest;
/**********************************************************************************************************
@Name:-Miriyala Sesikiran
@Date::-Feb 07,2020
@Purpous:- create Mails
**********************************************************************************************************/
public class CreateMails extends BaseTest 
{
	@Test
	public void create() throws Exception
	{	
		//to check git hub
		WebDriver obj=startBrowser();
		wait=waitUntilvisible(obj);
		RediffMail rediff=new RediffMail(obj);
		String FullName=stringGenerator(8);
		rediff.fullName(FullName).chooseMail(FullName);
		String password=PasswordGenerator();
		rediff.choosePassword(password);
		String ocr=rediff.getText();
	}
}
