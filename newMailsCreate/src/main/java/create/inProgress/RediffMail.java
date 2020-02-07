package create.inProgress;
import java.io.File;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.FindFailed;
import create.Pages.BaseTest;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;
import net.sourceforge.tess4j.util.LoadLibs;

public class RediffMail extends BaseTest
{
	Tesseract img;
	WebDriverWait wait;
	JavascriptExecutor js;
	public RediffMail(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	//Elements
	@FindBy(xpath="//input[contains(@name,'name')]") WebElement fullName;
	@FindBy(xpath="//input[contains(@name,'login')]") WebElement chooseMail;
	@FindBy(xpath="//input[@value='Check availability']") WebElement checkAvilability;
	@FindBy(xpath="//div[@id='check_availability']/font/b[contains(text(),'Yippie')]") By successMsg;
	@FindBy(xpath="//input[contains(@name,'passwd')]") WebElement password;
	@FindBy(xpath="//input[contains(@name,'confirm')]") WebElement cnfPassword;
	@FindBy(xpath="((//td[@colspan='3'][@align='left'])[4])/img") WebElement Ocr;
	public RediffMail fullName(String value) 
	{
		//wait.until(ExpectedConditions.elementToBeClickable(fullName));
		fullName.sendKeys(value);
		return this;
	}
	public RediffMail chooseMail(String value) 
	{
		chooseMail.sendKeys(value);
		checkAvilability.click();
		//wait.until(ExpectedConditions.visibilityOfElementLocated(successMsg));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='check_availability']/font/b[contains(text(),'Yippie')]")));
		return this;
	}
	public RediffMail choosePassword(String value) 
	{
		password.sendKeys(value);
		cnfPassword.sendKeys(value);
		return this;
	}
	public String getText() throws FindFailed, IOException, TesseractException
	{
		File fo=LoadLibs.extractTessResources("tessdata");
		img=new Tesseract();
		js=(JavascriptExecutor)driver;
		img.setDatapath(fo.getAbsolutePath());
		js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
		File res=Ocr.getScreenshotAs(OutputType.FILE);
		String result=img.doOCR(res);
		System.out.println(result);
		return result;
	}
}
