package pom;

//import app.shared.SystemBar;
import org.openqa.selenium.support.PageFactory;
import org.w3c.dom.html.HTMLInputElement;
import shared.SystemBar;

public class Homepage extends app.shared.SystemBar {

    //public HTMLInputElement TShirtTab;

    public Homepage() {
        PageFactory.initElements(driver, this);
    }


}
