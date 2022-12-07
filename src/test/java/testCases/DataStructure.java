package testCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Configuration.Config;
import base.baseClass;
import pageObjects.DataStructurePO;




public class DataStructure extends baseClass {
	@Test
	public static void ds() throws InterruptedException
	{
		
		
		
		loginTestCase signin=new loginTestCase(); 
		 signin.Login();
		 
		DataStructurePO DSP= new DataStructurePO(driver);
		DSP.GetStart();
		DSP.Time();
		DSP.clickTry();
		Thread.sleep(1000);
		DSP.text();
		Thread.sleep(2000);
		DSP.run();
		Thread.sleep(1000);
		driver.navigate().back();
		
		
		
	
	}
	
	
}
