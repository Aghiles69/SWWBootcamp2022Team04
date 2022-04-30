package pom;

import app.shared.SystemBar;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Search extends SystemBar {


    @FindBy(id = "search_query_top")
    public WebElement searchBar;

    @FindBy(name = "submit_search")
    public WebElement searchButton;

   // public Search doSearch(String searchTerm) {
    //    typeOnSearchBar(searchTerm);
     //   clickSearchButton();
     //   return new Search();
    }


    //public void typeOnSearchBar(String input) {
       // searchBar.sendKeys(input);
  //  }

   // public void clickSearchButton() {
      //  searchButton.click();

      //  @FindBy(id = " bigpic")
      //  public WebElement searchTerm;


   // public Search() {
       //     PageFactory.initElements(driver, this);
      //  }


        //public String getSearchTerm () {
         //   String searchTermString = searchTerm.getText().toLowerCase();
         //   return searchTermString.substring(1, searchTermString.length() - 1);
       // }


