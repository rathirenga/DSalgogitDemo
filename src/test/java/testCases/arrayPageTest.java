package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import base.baseClass;
import pageObjects.arrayPages;


public class arrayPageTest extends baseClass
{
	@Test
	public void arrayBtn() throws InterruptedException 
	{
		//signInPageTest signObj=new signInPageTest();
		//signObj.signInClick();
		arrayPages arrObject=new arrayPages(driver);
		arrObject.itemClick();
		arrObject.arrEltClick();
		arrObject.practiceQues();
		arrObject.goBack();
	}
}
