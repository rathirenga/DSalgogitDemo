package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;

import Configuration.Config;
import base.baseClass;
import pageObjects.LoginPageObject;


public class loginTestCase extends baseClass {

	@BeforeSuite
	public void Login() {

		LoginPageObject lp = new LoginPageObject(driver);
		System.out.println(driver.getTitle());
		lp.clicksign();
		lp.setUserName(Config.username);
		lp.setPassword(Config.password);
		lp.clickbtn();
		
		

	}
}
