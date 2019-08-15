package create.inProgress;
import org.testng.annotations.Test;
import create.Pages.BaseTest;
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
		//startBrowser("redifMail");
		String password=PasswordGenerator();
		System.out.println(password);
		String userName=stringGenerator(8);
		System.out.println(userName);		
		//close();
	}
}
