package pom;

import generic.Base_page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginpage extends Base_page 
{
	public loginpage(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(xpath="(//a[.='Sign In'])[2]")
	private WebElement signin;
	@FindBy(xpath="(//input[@title='Email Address'])[3]")
	private WebElement email;
	@FindBy(xpath="(//input[@title='Password'])[3]")
	private WebElement pwd;
	@FindBy(xpath="//button[@title='Login']")
	private WebElement login;
	@FindBy(xpath="//*[@id='magestore-invalid-email']")
	private WebElement invalidloginmsg;
	public void singIn(String em,String pw) throws InterruptedException
	{
		signin.click();
		Thread.sleep(3000);
		email.sendKeys(em);
		pwd.sendKeys(pw);
		login.click();

	}
	
	public void invalidLogin()
	{
		verifyElement(invalidloginmsg);
	}
	
	

}
