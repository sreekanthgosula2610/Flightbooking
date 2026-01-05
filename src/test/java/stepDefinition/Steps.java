package stepDefinition;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.FlightBooking;
import pageObjects.OriginDestinationCity;
import pageObjects.WithTravellers;
import utitlities.ReusableMethods;


public class Steps {

	private static final String url = null;
	public WebDriver driver;
	public FlightBooking fb;
	public OriginDestinationCity fbdc;
	public WithTravellers wt;
	public ReusableMethods rms;
	public File f;
	public FileInputStream fis;
	public Properties props;

	

		@Given("user launch chrome browser")
		public void user_launch_chrome_browser() {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers/chromedriver.exe");
			driver= new ChromeDriver();
		    fb = new FlightBooking(driver);
		    fbdc = new OriginDestinationCity(driver);
		    wt = new WithTravellers();
		    rms = new ReusableMethods(driver);
		    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		}
		
		@When("user open with URL {string}")
		public void user_open_with_url(String url) throws Exception {
			driver.get(url);
		    driver.manage().window().maximize();
		    Thread.sleep(5000);
		}
		
		@When("click on flights")
		public void click_on_flights1() throws Exception {
			driver.switchTo().defaultContent();
			fb.ClicKFlight();
			Thread.sleep(5000);
		}
		    
		

		
		
		@And("click on allow notification")
		public void click_on_Allow_in_notification() throws Exception
		{
			/**
			Alert al=null;
			try
			{
				 al = driver.switchTo().alert();
			}
			catch(Exception e)
			{
				System.out.println(" No Alert present");
			}
		    if(al!=null)
		    	al.accept();
		    
		    Thread.sleep(5000);
		    **/
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-notifications");
		}
		    
		    @When("user click on origin dropdown box")
			public void user_click_on_origin_dropdown_box() throws InterruptedException {
				fbdc.clickOriginCity();
			    Thread.sleep(5000);
			}

			@When("select Origin city {string} mumbai")
			public void select_origin_city_mumbai(String fcity) throws Exception {
				fbdc.setOriginCity(fcity);
				Thread.sleep(5000);
			}

			@Then("user can view Mumbai in ORIGIN field")
			public void user_can_view_mumbai_in_origin_field() throws Exception {
				fbdc.clickOriginCity();
				Thread.sleep(5000);
			}	

			@When("user click on destination dropdown box")
			public void user_click_on_Destination_dropdown_box() throws Exception {
			    fbdc.clickOriginCity();
			    Thread.sleep(5000);
			}

			@When("select Destination city {string} banglore")
			public void select_destination_city_bangalore(String dcity) throws Exception {
				fbdc.setDestinationCity(dcity);
				Thread.sleep(5000);
			}

			@Then("user can view Bnglore in Destination field")
			public void user_can_view_banglore_in_destination_field() throws Exception {
				fbdc.displayDestinationCity();
			    Thread.sleep(5000);
			}

			@When("select same destination city {string} mumbai")
			public void select_same_destination_city_mumbai(String scity) throws Exception {
			    fbdc.setDestinationCity(scity);
			    Thread.sleep(5000);
			}
			
			
			@When("select origin city {string} mumbai")
			public void select_Origin_city_mumbai1(String fcity) throws Exception {
				fbdc.setDestinationCity(fcity);
				Thread.sleep(5000);
			}
			
			@Then("user can view Mumbai in Origin field")
			public void user_can_view_mumbai_in_origin_field1() throws Exception {
				fbdc.clickOriginCity();
				Thread.sleep(5000);
			}	
			

			@Then("user can view Mumbai in DESTINATION field with error message {string}")
			public void user_can_view_mumbai_in_destination_field_with_error_message(String msg) throws Exception {
			    fbdc.checkMessageSameCity(msg);
			    Thread.sleep(5000);
			}

			@When("user click on travellers & economy dropdown box")
			public void user_click_on_travellers_economy_dropdown_box() throws Exception {
			    wt.clickTravellers();
			    Thread.sleep(5000);
			}

			@When("select one adult and one children and one infant")
			public void select_one_adult_and_one_children_and_one_infant() throws Exception {
			    wt.clickACI();
			    Thread.sleep(5000);
			}

			

			@Then("user can view three travellers in TRAVELLERS & ECONOMY field")
			public void user_can_view_three_travellers_in_travellers_economy_field() throws Exception {
			    wt.clickTravellers();
			    Thread.sleep(5000);
			}


			@When("select one adult and one children and two infant")
			public void select_one_adult_and_one_children_and_two_infant() throws Exception {
			    wt.clickACI();
			    Thread.sleep(5000);
			}
			
			
			@Then("user view error message {string}")
			public void user_view_error_message(String errmsg) throws Exception {
			    wt.getErrormsg(errmsg);
			}
			

			
			      
			
			
			@When("click on flightsLogo")
			public void click_on_flights() throws Exception {
			
				driver.switchTo().defaultContent();
				fb.ClicKFlightLogo();
				Thread.sleep(5000);
			}
			
			@When("click on Oneway button")
			public void click_on_oneway_button() throws Exception {
				fb.clickOneway();
				Thread.sleep(5000);
				
			}

			@When("click on search button")
			public void click_on_search_button() throws Exception {
				fb.clickSearch();
				rms.getPageScreenShot(); 
			    Thread.sleep(5000);
			}
			
			@Then("page title should be {string}")
			public void page_title_should_be(String string) throws Exception {
				Object title = null;
				Assert.assertEquals(title, driver.getTitle());
			    Thread.sleep(5000);


			}

			@Then("close the browser")
			public void close_the_browser() throws Exception {
				driver.quit();
			}

			@When("user open url {string}")
			public void user_open_url(String string)throws Exception {
				driver.get(url);
			    driver.manage().window().maximize();
			    Thread.sleep(5000);
			}
			    
			

			@When("user click on Book button")
			public void user_click_on_book_button() throws Exception {
				fb.ClickBook();
				Thread.sleep(5000);
			}

			@When("user click on Guest User Login")
			public void user_click_on_guest_user_login() throws Exception {
				fb.clickGuestuserlogin();
				Thread.sleep(5000);
			    
			}

			@When("user enters user email as\"cvsreevani@gmail.com\"")
			public void user_enters_user_email_as_cvsreevani_gmail_com() throws Exception {
				fb.clickEmail();
				Thread.sleep(5000);
			    
			}

			@When("user enters Mobile Number as\"{int}\"")
			public void user_enters_mobile_number_as(Integer int1) throws Exception {
				fb.clickMobilenumber();
				Thread.sleep(5000);
			    
			}
			
			
		}
