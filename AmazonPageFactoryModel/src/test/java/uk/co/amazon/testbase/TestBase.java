package uk.co.amazon.testbase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import uk.co.amazon.basepage.BasePage;
import uk.co.amazon.browserselector.BrowserSelector;
import uk.co.amazon.loadproperty.LoadProperty;

/**
 * Created by : Divyesh Patel
 * since : Wednesday  30/10/2019
 * Time  : 15:22
 **/

public class TestBase extends BasePage {


    String browser = new LoadProperty().getProperty("browser");
    BrowserSelector browserSelector = new BrowserSelector();

    @BeforeMethod
    public void setUp() {

        System.out.println("I am from before method");
        browserSelector.selectBrowser(browser);
    }

    @AfterMethod
    public void closeDown() {
        //driver.quit();
    }
}
