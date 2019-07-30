package scripts;

import generic.Excel_read;
import generic.Generic_class;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pom.Homepage;
import pom.loginpage;

public class InvalidLogin extends  Generic_class 
{
	
		@Test
		public void invalidLoginlogout() throws InterruptedException
		{
			String un = Excel_read.readCellValue("Loginlogout", 2, 0);
			String pwd = Excel_read.readCellValue("Loginlogout", 2, 1);
			loginpage lp=new loginpage(driver);
			lp.singIn(un, pwd);
			lp.invalidLogin();
			
			
		}
		

	}


