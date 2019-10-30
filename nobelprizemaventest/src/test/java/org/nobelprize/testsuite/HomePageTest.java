package org.nobelprize.testsuite;

import org.nobelprize.loadproperty.LoadProperty;
import org.nobelprize.pages.HomePage;
import org.nobelprize.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by : Divyesh Patel
 * since : Wednesday  30/10/2019
 * Time  : 22:47
 **/

public class HomePageTest extends TestBase {

    HomePage homePage = new HomePage();
    LoadProperty loadProperty = new LoadProperty();

    @Test
    public void userShouldNavigateToHomepageSuccessfully() {

        String actualtext = "THE NOBEL PRIZE THE NOBEL PRIZE LOGO";

        Assert.assertEquals(homePage.homepageWelcomeText(),actualtext);

    }
}
