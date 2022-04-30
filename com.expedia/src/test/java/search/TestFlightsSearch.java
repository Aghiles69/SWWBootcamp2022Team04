package search;

import base.BasePage;
import booking.pom.FlightsHomePage;
import booking.pom.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class TestFlightsSearch extends BasePage {


    @Test     (groups = {"functional","search"}, priority = 1)//1
    public void testSearchForFlight() {
        HomePage homepage = new HomePage();
        FlightsHomePage flights = homepage.clickOnElement();
        waitForElementToBeVisible(flights.roundtripTap);
        homepage.clickOnElement(flights.LeavingFrom, flights.LeavingFromText, "IAD", flights.firstResult);
        homepage.clickOnElement(flights.GoingTo, flights.LeavingFromText, "NYC", flights.firstResult2);
         clickOnElement(flights.searchButton);
         waitForElementToBeVisible(flights.confirmWEBElement);
        String actualText = flights.confirmWEBElement.getText();
        String expectedText = "Filter by";
        Assert.assertEquals(actualText, expectedText);


    }

    @Test(groups = {"functional", "search", "TestFlightSearch"}, priority = 2)//2


    public void testSearchForFlight2() {

        HomePage homepage = new HomePage();
        FlightsHomePage flights = homepage.clickOnElement();
        clickOnElement(flights.dateButton);
        clickOnElement(flights.pickMay28);
        clickOnElement(flights.pickJune12);
        clickOnElement(flights.doneButton);
        homepage.safeClickOnElement(flights.LeavingFrom2, flights.LeavingFromText2, "IAD", flights.firstResult);
        homepage.safeClickOnElement(flights.GoingTo2, flights.LeavingFromText2, "NYC", flights.firstResult2);
        clickOnElement(flights.searchButton);
        clickOnElement(flights.filterByNonStop);
        clickOnElement(flights.MorningScheduleCheckBox);
        clickOnElement(flights.SortBy);
        clickOnElement(flights.DurationShort);
        waitForElementsToBeVisible(flights.LocationsOfAirlines);
        List<String> test = oneDList(flights.LocationsOfAirlines);
        homepage.assertOneDList(test, "flightsSortBy")


    }

}

