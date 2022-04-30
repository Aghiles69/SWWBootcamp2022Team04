package booking.pom;

import booking.shared.SystemBar;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FlightsHomePage extends SystemBar {

       //test 1 RoundTrip from IAD to JFK
    @FindBy(xpath = "//*[@id=//a[@href='?flightType=roundtrip']")
    public WebElement roundtripTap;

    @FindBy(xpath = "//*[@id=\"location-field-leg1-origin\"]")
    public WebElement LeavingFrom;

    @FindBy(xpath = "//button[@aria-label='Leaving from Washington (IAD - Washington Dulles Intl.)']")
    public WebElement LeavingFromText;// IAD - Washington Dulles Int

    @FindBy(xpath = "//*[@id=\"location-field-leg1-origin-menu\"]/div[2]/ul/li[1]/button")
    public WebElement firstResult;

    @FindBy(xpath = "//button[@aria-label='Going to']")
    public WebElement GoingTo;

    @FindBy(xpath="//*[@id=\"wizard-flight-tab-roundtrip\"]/div[2]/div[1]/div/div[2]/div/div/div/div[1]/button")
    public WebElement GoingToText;  //nyc

    @FindBy(xpath = "//button[@aria-label='Going to New York (JFK - John F. Kennedy Intl.)']")
    public WebElement firstResult2; // JFK - John F. Kennedy Int

    @FindBy(xpath = "//button[normalize-space()='Search']")
    public WebElement searchButton;

     // test 2 round trip with set date and none stop flight

    @FindBy(xpath = "//*[@id=//a[@href='?flightType=roundtrip']")
    public WebElement roundtripTap2;

    @FindBy(xpath = "//*[@id=\"location-field-leg1-origin\"]")
    public WebElement LeavingFrom2;

    @FindBy(xpath = "//button[@aria-label='Leaving from Washington (IAD - Washington Dulles Intl.)']")
    public WebElement LeavingFromText2;// IAD - Washington Dulles Int

    @FindBy(xpath = "//*[@id=\"location-field-leg1-origin-menu\"]/div[2]/ul/li[1]/button")
    public WebElement firstResult22;

    @FindBy(xpath = "//button[@aria-label='Going to']")
    public WebElement GoingTo2;

    @FindBy(xpath="//*[@id=\"wizard-flight-tab-roundtrip\"]/div[2]/div[1]/div/div[2]/div/div/div/div[1]/button")
    public WebElement GoingToText2;  //nyc

    @FindBy(xpath = "//button[@aria-label='Going to New York (JFK - John F. Kennedy Intl.)']")
    public WebElement firstResult222; // JFK - John F. Kennedy Int

    @FindBy(xpath = "//button[normalize-space()='Search']")
    public WebElement searchButton2;

    @FindBy(xpath="//*[@id=\"d1-btn\"]")
    public WebElement dateButton;

    @FindBy(id="//*[@id=\"wizard-flight-tab-roundtrip\"]/div[2]/div[2]/div/div/div[1]/div")
    public WebElement pickMay28;

    @FindBy(id = "//*[@id=\"d2-btn\"]")
    public WebElement dataButton2;

    @FindBy(id = " //*[@id=\"wizard-flight-tab-roundtrip\"]/div[2]/div[2]/div/div/div[2]")
    public WebElement pickJune12;

    @FindBy(xpath="//*[@data-stid=\"apply-date-picker\"]")
    public WebElement doneButton;

    @FindBy(id = " //*[@id=\"app-layer-base\"]/div[3]/div[3]/div[1]/aside/fieldset/fieldset[1]/div[2]/div[1]/div[1]")
    public WebElement filterByNonStop;

    @FindBy(id= ("//*[@id=\"app-layer-base\"]/div[3]/div[3]/div[1]/aside/fieldset/fieldset[4]/div/div[1]/label"))
    public WebElement MorningScheduleCheckBox;

    @FindBy(id=" //*[@id=\"listings-sort\"]")
    public WebElement SortBy;

    @FindBy( id="//*[@id=\"app-layer-base\"]/div[3]/div[3]/div[1]/section/main/div[3]/div[2]/section ")
    public WebElement DurationShort;



}
