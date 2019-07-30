package generic;

import org.apache.commons.net.telnet.WindowSizeOptionHandler;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;



public class genericJavase 
{
	
	JavascriptExecutor js;
	public genericJavase(WebDriver wd)
	{
		js=(JavascriptExecutor) wd;
	}
	
	
	public void executescript(String id1)
	{
	
		js.executeScript("document.getElementById(id1).value='xyz'");
	
	}
	public void scrollBar(int y)
	{
	
		js.executeScript("window.scrollBy(0,"+y+")");
	
	}
	

}
