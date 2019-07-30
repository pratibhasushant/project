package scripts;

import org.testng.annotations.Test;

import pom.Homepage;
import pom.loginpage;
import generic.Excel_read;
import generic.Generic_class;

public class LoginLogout extends  Generic_class 
{
	@Test(priority=2)
	public void validLoginlogout() throws InterruptedException
	{
		String un = Excel_read.readCellValue("Loginlogout", 1, 0);
		String pwd = Excel_read.readCellValue("Loginlogout", 1, 1);
		loginpage lp=new loginpage(driver);
		lp.singIn(un, pwd);
		Homepage hp=new Homepage(driver);
		String hptitle = Excel_read.readCellValue("Loginlogout", 1, 2);
		hp.verifyTitle(hptitle);
		Thread.sleep(5000);
		hp.logout();
		String lptitle = Excel_read.readCellValue("Loginlogout", 1, 3);
		
		
		
	}
	

}
