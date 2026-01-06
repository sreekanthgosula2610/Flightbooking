package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class OriginDestinationCity {

	public WebDriver fdriver;
	public OriginDestinationCity(WebDriver driver) {
		
	}

	public void OringinDestinationCity(WebDriver rdriver)
	{
		fdriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	public By oCity =By.id("id_stationFrom");
	public By dCity =By.id("stationTo");
	public By date =By.id("id_originDate");
	public By MsgTxt =By.id("message");
	public By sendBtn =By.id("submitMessage"); //After click search button get msg
	public By SuccessMsg = By.xpath("//p[@class='alert alert-success']");
	
	@FindBy(xpath="/html/body/app-root/app-index/div[2]/div/div[1]/div/div/div[2]/form/div[1]/input")
	@CacheLookup
	WebElement originDDB;
	
	@FindBy(xpath="/html/body/app-root/app-index/div[2]/div/div[1]/div/div/div[2]/to/div[2]/input")
	@CacheLookup
	WebElement destinationDDB;
	
	@FindBy(xpath="//*[@id=\\\"stationFrom\\\"]")
	@CacheLookup
	WebElement oc;
	
	@FindBy(xpath="//*[@id=\\\"stationTo\\\"]")
	@CacheLookup
	WebElement dc;
		
	By originCity = By.xpath("/html/body/app-root/app-index/div[2]/div/div[1]/div/div/div[2]/form/div[1]/input");
	
	By destinationCity = By.xpath("/html/body/app-root/app-index/div[2]/div/div[1]/div/div/div[2]/to/div[1]/input");
	
	//Action Methods
	public void clickOriginCity()
	{
		originDDB.click();
	}
	
	public void clickDestinationCity()
	{
		destinationDDB.click();
	}
	
	public void setOriginCity(String ocity) throws Exception
	{
		
		fdriver.findElement(originCity).sendKeys("mumbai");
		Thread.sleep(5000);
		oc.click();
	}
	
	public void setDestinationCity(String dcity) throws Exception 
	{		
		try {
		fdriver.findElement(destinationCity).sendKeys("banglore");
		Thread.sleep(5000);
		dc.click();
		}
		catch(Exception e)
		{
			System.out.print("Destination city can't be selected!");
			throw(e);
		}
	}
	

	public void displayOriginCity()
	{
		originDDB.getText();
	}
	
	public void displayDestinationCity()
	{
		destinationDDB.getText();
	}
	

	public void setDestinationCitySame(String scity) throws Exception 
	{
		fdriver.findElement(destinationCity).sendKeys("mumbai");
		Thread.sleep(5000);
		dc.click();
	}
	
	public void checkMessageSameCity(String msg) throws Exception
	{

	if(fdriver.getPageSource().contains(msg))
	{
		Assert.assertTrue(true);
		Thread.sleep(5000);
	}
	else
	{
		Assert.fail("You cannot select same city");
	}
	}

	
	
}