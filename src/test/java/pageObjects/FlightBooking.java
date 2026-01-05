package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlightBooking {
	
	public WebDriver ldriver;
	
	public FlightBooking(WebDriver driver) {
		ldriver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id=\"divMain\"]/div/app-main-page/div/div/div[1]/div[1]/div[1]/app-jp-input/div/form/div[5]/div/button")
	@CacheLookup
	WebElement serchbtn;

	public void clickSearch() throws Exception {
		// TODO Auto-generated method stub
		serchbtn.click();
		Thread.sleep(1000);
		
	}

	@SuppressWarnings("null")
	public void ClickTitle() throws Exception {
		WebElement titlebtn = null;
		// TODO Auto-generated method stub
		titlebtn.click();
		Thread.sleep(1000);
		
	}
	
	@SuppressWarnings("null")
	public void Clickbrowser() throws Exception {
		WebElement browserbtn = null;
		// TODO Auto-generated method stub
		browserbtn.click();
		Thread.sleep(1000);
		
	}
	
	@FindBy(xpath = "//*[@id=\"stationFrom\"]")
	@CacheLookup
	WebElement OriginCitybtn;
	
	public void ClicKOriginCity() throws Exception {
		// TODO Auto-generated method stub
		OriginCitybtn.sendKeys("mumbai");
		Thread.sleep(1000);
	}
	
	@FindBy(xpath = "//*[@id=\"stationTo\"]")
	@CacheLookup
	WebElement DestinationCitybtn;
	
	public void ClickDestinationCity() throws Exception {
		// TODO Auto-generated method stub
		DestinationCitybtn.sendKeys("banglore");
		Thread.sleep(1000);
	}

	
	
	// .....................Flight.............................................................

	
	@FindBy(xpath = "//*[@id=\"flight\"]/a/span")
	@CacheLookup
	WebElement flightbtn;

	public void ClicKFlightLogo() throws Exception {
		// TODO Auto-generated method stub
		flightbtn.click();
		Thread.sleep(1000);
	}

	@FindBy(xpath = "//*[@id=\"carouselExampleInterval\"]/div[1]/div/div/div[1]/div[1]/div[1]/label")
	@CacheLookup
	WebElement onewaybtn;

	

	@SuppressWarnings("null")
	public void clickOneway() throws Exception {
		WebElement onewaybtn = null;
		// TODO Auto-generated method stub
		onewaybtn.click();
		Thread.sleep(1000);
		
	}
	
	@FindBy(xpath = "//*[@id=\"flight\"]/a/span")
	@CacheLookup
	WebElement flightbtn1;

	public void ClicKFlight() throws Exception {
		// TODO Auto-generated method stub
		flightbtn.click();
		Thread.sleep(1000);
	}
	
	// .....................Sign in.............................................................
      
	@FindBy(xpath = "//*[@id=\"profile\"]/div/form/div[3]/button")
	@CacheLookup
	WebElement signinbtn;

	public void ClickLogin() throws Exception {
		// TODO Auto-generated method stub
		signinbtn.click();
		Thread.sleep(1000);
		
	}
	
	@FindBy(xpath = "//*[@id=\"profile-tab\"]")
	@CacheLookup
	WebElement guestuserloginbtn;
	

	@SuppressWarnings("null")
	public void clickGuestuserlogin() throws Exception {
		WebElement guestuserloginbtn = null;
		// TODO Auto-generated method stub
		guestuserloginbtn.click();
		Thread.sleep(1000);
		
	}
	
	@FindBy(xpath = "//*[@id=\"profile\"]/div/form/div[1]/input")
	@CacheLookup
	WebElement emailbtn;

	@SuppressWarnings("null")
	public void clickEmail() throws Exception {
		WebElement emailbtn = null;
		// TODO Auto-generated method stub
		emailbtn.click();
		Thread.sleep(1000);
		
	}
	
	@FindBy(xpath = "//*[@id=\"profile\"]/div/form/div[2]/input")
	@CacheLookup
	WebElement mobilebtn;
	

	@SuppressWarnings("null")
	public void clickMobilenumber() throws Exception {
		WebElement mobilebtn = null;
		// TODO Auto-generated method stub
		mobilebtn.click();
		Thread.sleep(1000);
		
	}
	
	
	@FindBy(xpath = "/html/body/app-root/app-oneway/div/main/div/div/div[2]/div[3]/div/div[6]/button")
	@CacheLookup
	WebElement bookbtn;

	public void ClickBook() throws Exception {
		// TODO Auto-generated method stub
		bookbtn.click();
		Thread.sleep(1000);
		
		
	}
	
	
	
	
	}

	

	
	
	
