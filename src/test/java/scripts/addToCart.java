package scripts;

import java.util.concurrent.TimeUnit;

import generic.Excel_read;
import generic.Generic_class;
import generic.Switch;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pom.Cartpage;
import pom.Homepage;
import pom.Productpage;
import pom.loginpage;

public class addToCart extends Generic_class  
{
	@Test
	public void addProduct() throws InterruptedException
	{
		String un = Excel_read.readCellValue("Loginlogout", 1, 0);
		String pwd = Excel_read.readCellValue("Loginlogout", 1, 1);
		loginpage lp=new loginpage(driver);
		lp.singIn(un, pwd);
		Thread.sleep(8000);
		Homepage hp=new Homepage(driver);
	    hp.addtoCart();
		Switch s=new Switch();
		s.switchToNextTab(driver);
		Thread.sleep(5000);
		Productpage pp=new Productpage(driver);
		pp.addProduct();
		Cartpage cp=new Cartpage(driver);
		cp.verifyProduct();
		
		
		
		
	}

}
