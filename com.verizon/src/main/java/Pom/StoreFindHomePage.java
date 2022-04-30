package Pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import shared.SystemBar;

public class StoreFindHomePage extends SystemBar {

    @FindBy(id =" //*[@id=\"vz-gh20\"]/div/div[1]/div/div[1]/div[2]/div/div[1]/div[1]/div[2]/div[1]/div/div/a" )
    public WebElement StoreFind;

    @FindBy(id = "\"storesData\"] ")
    public WebElement LocationFindSearch;

    @FindBy(id = " content\"]/main/div/div[2]/div[1]/div/div/div[1]/div/div")
    public WebElement SearchFirstResult;  //SearchFirstResult

    @FindBy(id = " storeDetailsContainer\"]/div[2]/div/div[1]/div/div/div/div/div[2]/h3")
    public WebElement TargetLocation;

//    @FindBy(id = " ")
//    public WebElement ;








}
