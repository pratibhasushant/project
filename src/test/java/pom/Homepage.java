package pom;

import generic.Base_page;
import generic.Excel_read;
import generic.Switch;
import generic.generic_action;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Homepage extends Base_page  
{
	public Homepage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath="/html/body/div[1]/div/div/div[2]/div/div/ul/li[3]/a")
	private WebElement myacc;
	@FindBy(xpath="//a[.='Sign Out']")
	private WebElement singout;
	@FindBy(xpath="//input[@id='search']")
	private WebElement search;
	@FindBy(xpath="(//button[@type='submit'])[1]")
	private WebElement submit;
	@FindBy(xpath="(//li[@class='item last'])[6]")
	private WebElement product;
	
	public void addtoCart() throws InterruptedException
	{
		String hptitle = Excel_read.readCellValue("Loginlogout", 1, 2);
		WebDriverWait dw=new WebDriverWait(driver,20);
		dw.until(ExpectedConditions.titleContains(hptitle));
	
		
		search.sendKeys("shoes");
		Thread.sleep(5000);
		submit.click();
	Thread.sleep(10000);
		product.click();
		
		
		
	}
	public void logout() throws InterruptedException
	{
		generic_action ga=new generic_action(driver);
		ga.moveTo(myacc);
		singout.click();
	}
	
	
	
	
	
}
