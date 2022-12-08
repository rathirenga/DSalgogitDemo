package testCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.baseClass;
import pageObjects.QueuePage;


public class QueuePage_TC extends baseClass {
@Test	
	public void Queuepagetest() throws InterruptedException
	
	{
		QueuePage QPT=new QueuePage(driver);
		//SigninPage_TC sgn = new SigninPage_TC();
	    //sgn.signinTest();
	    QPT.getstarted();
	    QPT.QueuePyt();
	    
	List<WebElement> links = driver.findElements(By.xpath("//li[@class='list-group-item list-group-item-light ']"));
	System.out.println("Total number of Links "+ links.size());
	
	for(int i=1;i<=links.size();i++) {
		driver.findElement(By.xpath("//li["+i+"][@class='list-group-item list-group-item-light ']//a")).click();
		System.out.println(i);	
		String title = driver.getTitle();
		System.out.println(title);
		 Thread.sleep(1000); 
		QPT.TryHere();
		QPT.print();
		QPT.runH();
		driver.navigate().back();
	}
	 Thread.sleep(3000);
	  QPT.PQ();	    
	    
}

}
