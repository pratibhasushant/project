package pom;

import generic.Base_page;
import generic.Excel_read;
import generic.Switch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Zomatologinpage extends Base_page
{
	public Zomatologinpage(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath="//span[.='Continue with Facebook']")
	private WebElement fblogin;
	@FindBy(xpath="//*[@id='email']")
	private WebElement email;
	@FindBy(xpath="//*[@id='pass']")
	private WebElement pwd;
	@FindBy(name="login")
	private WebElement login;
	@FindBy(xpath="//*[@id='modal-container']/i")
	private WebElement close;
	public void performLogin() throws InterruptedException
	{
		fblogin.click();
		Thread.sleep(3000);
		Switch s=new Switch();
		s.switchToNextTab(driver);
		Thread.sleep(3000);
		email.sendKeys(Excel_read.readCellValue("Sheet1", 3, 0));
		pwd.sendKeys(Excel_read.readCellValue("Sheet1", 3, 1));
		login.click();
		Thread.sleep(8000);
		s.switchToNextTab(driver);
		Thread.sleep(8000);
		close.click();
	}
	

}
