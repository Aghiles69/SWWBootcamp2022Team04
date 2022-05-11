package pom;


import org.openqa.selenium.support.PageFactory;

public class AboutUs extends HomePage{

    public final String URL = "https://www.mbusa.com/en/about-us";

    public AboutUs(){PageFactory.initElements(driver,this);}




}
