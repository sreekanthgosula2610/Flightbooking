package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class WithTravellers {

public WebDriver fdriver;
	
	public WithTravellers()
	{
		WebDriver rdriver = null;
		fdriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//*[@id=\"noOfpaxEtc\"]")
	@CacheLookup
	WebElement travellersDDB;
	
	@FindBy(xpath="//*[@id=\"TravellerEconomydropdown\"]/div[1]/div[1]")
	@CacheLookup
	WebElement adult;
	
	@FindBy(xpath="//*[@id=\"TravellerEconomydropdown\"]/div[1]/div[2]")
	@CacheLookup
	WebElement children;
	
	@FindBy(xpath="//*[@id=\"TravellerEconomydropdown\"]/div[1]/div[3]")
	@CacheLookup
	WebElement oneinfant;
	
	@FindBy(xpath="//button[contains(text(),'APPLY')]")
	@CacheLookup
	WebElement btnApply;
	
	@FindBy(xpath="//*[@id=\"TravellerEconomydropdown\"]/div[2]")
	@CacheLookup
	WebElement twoinfant;
	
	@FindBy(xpath="//p[@id='smallErrorMessage']")
	@CacheLookup
	WebElement errmsg;
	
	//Action Methods
	public void clickTravellers()
	{
		travellersDDB.click();
	}
	
	public void clickACI()
	{
		adult.click();
		children.click();
		oneinfant.click();
	}
	
	public void clickACI2()
	{
		adult.click();
		children.click();
		twoinfant.click();
	}
	
	public void clickApply()
	{
		btnApply.click();
	}
	
	public void displayTravellers()
	{
		travellersDDB.getText();
	}
	
	public void getErrormsg(String msg) throws Exception
	{
		if(fdriver.getPageSource().contains(msg))
		{
			Assert.assertTrue(true);
			Thread.sleep(5000);
		}
		else
		{
			Assert.fail("NO");
		}
			
		
	}
}

	