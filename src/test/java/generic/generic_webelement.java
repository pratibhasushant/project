package generic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class generic_webelement 
{
	
	public void Clear(WebElement we)
	{
		we.clear();
	}
	public void Click(WebElement we)
	{
		we.click();
	}
	public void Sendkeys(WebElement we,String str)
	{
		we.sendKeys(str);
	}
	public WebElement findEle(WebDriver we,String xp)
	{
		WebElement ele = we.findElement(By.xpath(xp));
		return ele;
		
	}
	public List<WebElement> findEles(WebElement we,String xp)
	{
		List<WebElement> ele = we.findElements(By.xpath(xp));
		return ele;
		
	}
	public String getAtr(WebElement we,String str)
	{
	         String ele = we.getAttribute(str);
		return ele;
		
	}
	public Point getLoc(WebElement we)
	{
	         Point ele = we.getLocation();
		return ele;
		
	}
	public Dimension getsize(WebElement we)
	{
	         Dimension ele = we.getSize();
		return ele;
		
	}
	public String gettext(WebElement we)
	{
	         String ele= we.getText();
		return ele;
		
	}
	public String gettagname(WebElement we)
	{
	         String ele = we.getTagName();
		return ele;
		
	}
	public void getcssvalues(WebElement we,String str)
	{
	        String ele = we.getCssValue(str);
	        System.out.println(ele);
	
		
	}
	
	
	
	

}
