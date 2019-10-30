package uk.co.amazon.basepage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by : Divyesh Patel
 * since : Wednesday  30/10/2019
 * Time  : 15:09
 **/

public class BasePage {
    public static WebDriver driver;

    public BasePage() {
        PageFactory.initElements(driver,this);
    }
}
