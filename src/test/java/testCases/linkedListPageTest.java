package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import base.baseClass;
import pageObjects.linkedListPage;


public class linkedListPageTest extends baseClass
{
	@Test
	public void LList() throws InterruptedException
	{
//		signInPageTest signObj=new signInPageTest();
//		signObj.signInClick();
		//WebDriver driver=null;
		linkedListPage listObject= new linkedListPage(driver);
		listObject.LLClick();
		listObject.listEltsClick();
		listObject.practiceQues();
	}

}
