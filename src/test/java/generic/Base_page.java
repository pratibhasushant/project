package generic;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class Base_page 
{
	public WebDriver driver;
	public Base_page(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void verifyTitle(String title)
	{
		WebDriverWait wait=new WebDriverWait(driver,10);
		
		
	try
	{
	wait.until(ExpectedConditions.titleContains(title));
	Reporter.log("title is matching",true);
	}
	catch(Exception e)
	{
		Reporter.log("title is not matching",true);
		Assert.fail();
	}
	
	

}
	public void verifyElement(WebElement we)
	{
		WebDriverWait wait=new WebDriverWait(driver,10);
		
		
	try
	{
	wait.until(ExpectedConditions.visibilityOf(we));
	Reporter.log("title is matching",true);
	}
	catch(Exception e)
	{
		Reporter.log("title is not matching",true);
		Assert.fail();
	}
	
	

}
	
}