package testScript;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baseClass.BaseClass;
import pageObject.FlightSearchMMT;

public class FlightSearchMMT_test extends BaseClass {
	FlightSearchMMT flightSearchpage;	
	

	@Test(priority = 1)
	@Parameters(value = {"browser","url"})
	public void searcghFlight() throws InterruptedException {
		
		flightSearchpage = new FlightSearchMMT();
		flightSearchpage.SearchFlight();//searching method to select flight from Delhi to Mumbai
		flightSearchpage.sortByDetarture();// method for selecting date from Departure date menu
		flightSearchpage.getFlightPrice();//// method for getting the 2 lowest price of flight with name after the search
	}

}
