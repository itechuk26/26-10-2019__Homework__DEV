package uk.co.amazon.testsuite;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import uk.co.amazon.loadproperty.LoadProperty;
import uk.co.amazon.pages.HomePage;
import uk.co.amazon.testbase.TestBase;

/**
 * Created by : Divyesh Patel
 * since : Wednesday  30/10/2019
 * Time  : 16:51
 **/

public class HomePageTest extends TestBase {

    HomePage homepage;
    LoadProperty loadproperty = new LoadProperty();


    @Test
    public void userShoudNavigateToHomePageSuccessfully() {
        homepage = new HomePage();
        String actualText = driver.getTitle();

        Assert.assertEquals("Amazon.co.uk: Low Prices in Electronics, Books, Sports Equipment & more", actualText);
    }


}


