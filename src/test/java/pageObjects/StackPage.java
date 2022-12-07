package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StackPage {
WebDriver ldriver;
	
	public StackPage(WebDriver rdriver) 
	
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);		
	}
	@FindBy(xpath="//div[@class='col'][4]//a[@class='align-self-end btn btn-lg btn-block btn-primary']") 
	WebElement getstarted;
	
	@FindBy(linkText="Operations in Stack")
	WebElement OPStack;
	
	@FindBy(xpath="//a[@class='btn btn-info']")
	WebElement TryHere;	

	@FindBy(xpath="//form[@id='answer_form']/div/div/div/textarea")
	WebElement print; 
	
	@FindBy(xpath="//button[@type='button']")
	WebElement runH;
	
	@FindBy(linkText="Practice Questions")
	WebElement PQ;
	
	public void getstarted()
	{
	getstarted.click();
	}
	
	public void OPStack()
	{
	OPStack.click();
	}
	
	public void TryHere()
	{ 
	TryHere.click();	
	}
	
	public void print()
	{ 
	print.sendKeys("print('Hello World')");	
	}
	public void runH()
	{ 
	runH.click();
	}	
	public void PQ()
	{ 
	PQ.click();
	}	
	

}
