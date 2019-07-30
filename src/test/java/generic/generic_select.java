package generic;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class generic_select {
	Select s;
	public generic_select(WebElement we)
	{
		s=new Select(we);
	}


	public void selectIndex(int i)
	{
		
		s.selectByIndex(i);
		
	}
	
	public void selectValue(String str)
	{
	
		s.selectByValue(str);
		
	}
	
	public void selectVisibletext(String str)
	{

		s.selectByVisibleText(str);
		
	}
	
	public void deselectIndex(int i)
	{
		
		s.deselectByIndex(i);
		
	}
	public void deselectValue(String str)
	{
	
		s.deselectByValue(str);
		
	}
	
	public void deselectVisibletext(String str)
	{
		
		s.deselectByVisibleText(str);
		
	}
	public void deselectall()
	{
		s.deselectAll();
		
	}
	public  List<WebElement> getOpt()
	{
		List<WebElement> st = s.getOptions();
		return st;
		
	}
	
	public  List<WebElement> getAllSelectedOptions()
	{
		List<WebElement> st = s.getAllSelectedOptions();
		return st;
		
	}
	
	public WebElement getFirstSelOpt(WebElement we)
	{
		Select s=new Select(we);
		WebElement st = s.getFirstSelectedOption();
		return st;
		
	}
	
	
	public void isMult()
	{
		
		boolean st = s.isMultiple();
	if(st)
	{
		System.out.println("the d.d is multi select");
	}else{
		System.out.println("the d.d is not multi select");
	}
		
	}
	
}
