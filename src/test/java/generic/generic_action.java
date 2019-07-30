package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class generic_action 
{
	Actions a;
	public generic_action(WebDriver d)
	{
		a=new Actions(d);
	}
public void dragAnddrop(WebElement src,WebElement dest)
{
	
	a.dragAndDrop(src, dest).perform();
			
}
public void rightClick(WebElement src)
{
	a.contextClick(src).perform();
			
}
public void moveTo(WebElement src)
{
	a.moveToElement(src).perform();
			
}
public void doubleclick(WebElement src)
{
	a.doubleClick(src).perform();
			
}

}
