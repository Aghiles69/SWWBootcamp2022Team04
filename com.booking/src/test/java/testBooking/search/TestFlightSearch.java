package testBooking.search;

import base.BasePage;
import booking.pom.Flights;
import booking.pom.HomePage;
import org.testng.annotations.Test;

public class TestFlightSearch extends BasePage {


    @Test
    public void testSearchForFlight(){
        HomePage homePage = new HomePage();
         Flights flights = homePage.clickFlightsButton();


    }
}
