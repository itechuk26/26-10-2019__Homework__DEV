package org.nobelprize.testbase;

import org.nobelprize.basepage.BasePage;
import org.nobelprize.browserselector.BrowserSelector;
import org.nobelprize.loadproperty.LoadProperty;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

/**
 * Created by : Divyesh Patel
 * since : Wednesday  30/10/2019
 * Time  : 22:45
 **/

public class TestBase extends BasePage {

    String browser = new LoadProperty().getProperty("browser");
    BrowserSelector browserSelector = new BrowserSelector();

    @BeforeMethod
    public void setup()
    {
        System.out.println(browser);
        browserSelector.selectBrowser(browser);
    }

    @AfterMethod
    public void tearDown()
    {
        driver.quit();

    }
}
