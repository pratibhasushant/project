package pom;

import generic.Base_page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Productpage extends Base_page  
{
	public Productpage(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(xpath="(//span[@class='swatch-label2'])[1]")
	private WebElement size;
	@FindBy(xpath="//button[@title='Add to Cart']")
	private WebElement Atocart;
	@FindBy(xpath="//div[@class='header-minicart']")
	private WebElement cart;

	public void addProduct() throws InterruptedException
	{
		Thread.sleep(5000);
		size.click();
		Atocart.click();
		Thread.sleep(5000);
		cart.click();
	
	}
	
	
	

}
