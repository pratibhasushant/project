package generic;

import java.util.Set;

import org.openqa.selenium.WebDriver;

public class Switch 
{
	public void switchToNextTab(WebDriver driver) throws InterruptedException
	{
		String p = driver.getWindowHandle();
		Set<String> ps = driver.getWindowHandles();
		ps.remove(p);
		for(String d:ps)
		{
		driver.switchTo().window(d);
		}
		Thread.sleep(3000);
	}

}
