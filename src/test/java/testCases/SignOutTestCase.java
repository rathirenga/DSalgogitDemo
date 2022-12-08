package testCases;

import org.testng.annotations.Test;
import base.baseClass;
import pageObjects.LoginPageObject;
import pageObjects.SignOutPO;


public class SignOutTestCase extends baseClass {

	@Test
	public void signout()
	{
				//TC_LoginTest signin=new TC_LoginTest();
		//signin.Login();
		
		SignOutPO SO=new SignOutPO(driver);
		SO.clicksignout();
	}
}
