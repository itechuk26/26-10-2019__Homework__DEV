package uk.co.amazon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uk.co.amazon.utility.Util;

/**
 * Created by : Divyesh Patel
 * since : Wednesday  30/10/2019
 * Time  : 15:24
 **/

public class HomePage extends Util {

    String homepagetext = "Amazon.co.uk: Low Prices in Electronics, Books, Sports Equipment & more";
    @FindBy(xpath = "//span[contains(text(),'Hello, Sign in')]")
    WebElement _signinlink;

    public void clickOnSignIn()
    {
        clickOnElement(_signinlink);
    }

}
