package pom;

import generic.Base_page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class Cartpage extends Base_page 
{
	public Cartpage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath="//*[@id='shopping-cart-table']/tbody/tr/td[2]/h2/a")
	private WebElement product;
	
	public void verifyProduct()
	{
		String str = product.getText();
		Assert.assertEquals("Flare 2 Women's Sportstyle Shoes",str);
		
	}
			

}
