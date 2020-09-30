package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends pages.BasePage {

    //*********Constructor*********
    public HomePage (WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    //********* Home page url *********
    String baseURL = "https://www.thuisbezorgd.nl/";

    //*********Page Methods*********

    //Go to Homepage
    public void goToHomePage (){
        driver.get(baseURL);
        //driver.navigate().to(baseURL)
    }

}