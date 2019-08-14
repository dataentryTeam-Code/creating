package create.inProgress;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;

public class Practice 
{
	public static void main(String[] args) throws Exception 
	{WebDriver driver=null;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter browser name");
	String b=sc.nextLine();
	if(b.equalsIgnoreCase("chrome"))
	{
	System.setProperty("webdriver.chrome.driver","E:\\PersonalFrameWork\\drivers\\win\\76.0.3809.68\\chromedriver.exe");
    driver=new ChromeDriver();
	}
	else if(b.equalsIgnoreCase("firefox"))
	{
		System.setProperty("webdriver.gecko.driver","H:\\Selenium\\geckodriver.exe");
        driver=new FirefoxDriver();	
	}
	else if(b.equalsIgnoreCase("ie"))
	{
		System.setProperty("webdriver.ie.driver","H:\\Selenium\\IEDriverserver.exe");
        driver=new InternetExplorerDriver();
	}
	else if(b.equalsIgnoreCase("opera"))
	{
		OperaOptions c=new OperaOptions();
		c.setBinary("C:\\Program Files\\Opera\\53.0.2907.99\\opera.exe");
		System.setProperty("webdriver.opera.driver","H:\\Selenium\\operadriver.exe");
        driver=new OperaDriver(c);
	}
	else
	{
		System.out.println("invalid browser name");
		System.exit(0);
	}
		driver.manage().timeouts().implicitlyWait(240, TimeUnit.SECONDS);
		//Maximize
		driver.manage().window().maximize();
		//delete Cookies
		driver.manage().deleteAllCookies();
		int a=driver.manage().getCookies().size();
		System.out.println(a);
		//Lunch Site
		driver.get("http://www.gmail.com");		
		//Login
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("msasikiran225");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Ms@si2726");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		//Table all mails in mail box
		List<WebElement> l=driver.findElements(By.xpath("(//table)[6]/tbody/tr"));
		System.out.println("Count no.of mails  "+ l.size());
        int c=0;
        int i=1;
        for(i=1;i<l.size();i++)
        {
        	List<WebElement> l1=driver.findElements(By.xpath("(//table)[6]/tbody/tr["+i+"]/td"));
       		//get 8th column text
    		String x=l1.get(7).getText();
    		SimpleDateFormat f=new SimpleDateFormat("dd/MMM/yy");
       		Date d=new Date();
    		//today date
    		String y=f.format(d);
    		if(x.contains("Jun"))
    		{
    			c=c+1;
    		}
    		else
    		{
    			if(y.contains("Jun")&&x.contains("am"))
    			{
    				c=c+1;
    			}
    			else if(y.contains("Jun")&&x.contains("pm"))
    			{
    				c=c+1;
    			}
    		}
        }
        System.out.println("Count of June mails is  "+c);
		Thread.sleep(5000);
		//Logout
		driver.findElement(By.xpath("//span[@class='gb_db gbii']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='gb_Ea gb_1f gb_8f gb_Oe gb_Jb']")).click();
		//Close
		Thread.sleep(1000);
		driver.close();
	}
}
