Feature: Flight Booking

Scenario: Book Flight with Oneway flight option
	Given user launch chrome browser
	When user open with URL "https://www.air.irctc.co.in/"
  And click on allow notification
	And click on flightsLogo
	And close the browser
	Then page title should be "Air Ticket Booking | Book Flight Tickets | Cheap Air Fare - IRCTC Air"
	And close the browser
	
	Scenario Outline: Book flight with different Origin/Destination city
		Given user launch chrome browser
		When user open with URL "https://www.air.irctc.co.in/"
		And  click on allow notification
		And click on Oneway button
		When user click on origin dropdown box
		And select Origin city "<OriginCity>" mumbai
		Then user can view Mumbai in ORIGIN field
		When user click on destination dropdown box
		And select Destination city "<DestinationCity>" banglore
		Then user can view Bnglore in Destination field
		And close the browser
		
		Examples:
			| OriginCity  | |DestinationCity  |
			| mumbai      | | banglore        |
			| banglore    | | mumbai          |
			| kolkata     | |pune             |
	
Scenario: Book flight with same Origin/Destination city
	Given user launch chrome browser
	When user open with URL "https://www.air.irctc.co.in/"
	And  click on allow notification
	And click on flightsLogo
	And click on Oneway button
	When user click on origin dropdown box 
	And select origin city "Mumbai, India" mumbai
	Then user can view Mumbai in Origin field
	When user click on destination dropdown box
	And select same destination city "Mumbai, India" mumbai
	Then user can view Mumbai in DESTINATION field with error message "Origin & Destination airports cannot be same"
	And click on search button
	And close the browser

Scenario: Book flight with 1 Adult, 1 Children and 1 Infant
	Given user launch chrome browser
	When user open with URL "https://www.air.irctc.co.in/"
	And  click on allow notification
	And click on flightsLogo
	And click on Oneway button
	When user click on travellers & economy dropdown box   
	And select one adult and one children and one infant
	Then user can view three travellers in TRAVELLERS & ECONOMY field
	And click on search button
	And close the browser

Scenario: Book flight with 1 Adult, 1 Children and 2 Infant
	Given user launch chrome browser
	When user open with URL "https://www.air.irctc.co.in/"
	And  click on allow notification
	And click on flightsLogo
	And click on Oneway button
	When  user click on travellers & economy dropdown box 
	And select one adult and one children and two infant
	Then user view error message "Number of infants cannot be more than adults"
	And click on search button
	And close the browser
	
Scenario: Successful login with valid credentials
	    Given user launch chrome browser
	    When user open url "https://www.air.irctc.co.in/"
	    And  click on allow notification
	    And click on flightsLogo
	    And click on Oneway button
	    And click on search button
	    And user click on Book button
	    And user click on Guest User Login
	    And user enters user email as"cvsreevani@gmail.com"
	    And user enters Mobile Number as"7671050418"
	    Then page title should be "Booking Detail | preview | Make Payment"
	    And close the browser
	    
	
	

	