package booking.pom;

import base.BasePage;
import booking.shared.SystemBar;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Flights extends BasePage {

    @FindBy(xpath = " //div[@data-testid='searchbox origin']//div[@role='button]")
    public WebElement whereFromButton;

    @FindBy(xpath = "//input[@data-testid='searchbox origin_input']")
    public WebElement whereFromInputField;

    @FindBy( xpath = " //div[@class='css-1eii3rg']")
    public WebElement selectedAirportClearButton;

     public Flights(){
      PageFactory.initElements(driver,this);  }

      public void clickWhereFromButton(){
         clickOnElement(whereFromButton);
      }

     // public void

      public void clearSelectedAirport(){
         clickOnElement(selectedAirportClearButton);
      }
    }



