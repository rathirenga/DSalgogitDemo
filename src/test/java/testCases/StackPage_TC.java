package testCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

//import PageObjects.SigninPage;
import PageObjects.StackPage;

public class StackPage_TC extends BaseClass{
	
	@Test
	
	public void stackpagetest() throws InterruptedException 
	{
		StackPage SPT=new StackPage(driver);
		SigninPage_TC sgn = new SigninPage_TC();
	    sgn.signinTest();

		SPT.getstarted();
		SPT.OPStack();
		
		List<WebElement> links = driver.findElements(By.xpath("//li[@class='list-group-item list-group-item-light ']"));
		System.out.println("Total number of Links "+ links.size());
		
		for(int i=1;i<=links.size();i++) {
			driver.findElement(By.xpath("//li["+i+"][@class='list-group-item list-group-item-light ']")).click();
			System.out.println(i);
			Thread.sleep(1000);
			SPT.TryHere();
			SPT.print();			
			SPT.runH();
			driver.navigate().back();
		}
		Thread.sleep(1000);
		SPT.PQ();
	}
			
	}
