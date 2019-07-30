package pom;

import generic.Base_page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ZomatoHomepage extends Base_page {

	
	public ZomatoHomepage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath="//a[.='Create an account']")
	private WebElement create;
	
	public void clickLogin()
	{
		create.click();
	}

}
