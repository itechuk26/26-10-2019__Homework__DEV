package com.nocommerce.demo.testbase;

import com.nocommerce.demo.basepage.BasePage;
import com.nocommerce.demo.browserselector.BrowserSelector;
import com.nocommerce.demo.loadproperty.LoadProperty;
import com.nocommerce.demo.pages.ComputersPage;
import com.nocommerce.demo.pages.HomePage;
import com.nocommerce.demo.pages.LoginPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class TestBase extends BasePage {
    HomePage homePage;
    LoginPage loginPage;
    ComputersPage computersPage;

    String browser = new LoadProperty().getProperty("browser");
    BrowserSelector browserSelector = new BrowserSelector();

    @BeforeMethod (alwaysRun = true)
    public void setUp() {
        System.out.println("I am from before method");
        browserSelector.selectBrowser(browser);
    }

    @AfterMethod (alwaysRun = true)
    public void closeDown() {
        driver.quit();
    }
}
