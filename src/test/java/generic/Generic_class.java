package generic;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Generic_class implements Frame_const
{
	public WebDriver driver;
	static
	{
		System.setProperty(CRHOME_KEY,CRHOME_VALUE);
		System.setProperty(GECKO_KEY,GECKO_VALUE);
		
	}
	@Parameters({"browser"})
	
	
	@BeforeMethod
	public void openApp(String browser)
	{
		if(browser.equals("chrome"))
		driver=new ChromeDriver();
		else
		driver=new FirefoxDriver();	
		driver.get("https://www.puma.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	@AfterMethod
	public void closeApp(ITestResult res) throws IOException
	{
		int status = res.getStatus();
		String tcname = res.getName();
		if(status==2)
		{
			Generic_takephoto.getPhoto(driver);
			Reporter.log(tcname,true);
		}
		
		driver.quit();
	}
	

}
