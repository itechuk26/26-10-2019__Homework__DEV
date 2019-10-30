package org.nobelprize.pages;

import org.nobelprize.utility.Util;
import org.openqa.selenium.By;

/**
 * Created by : Divyesh Patel
 * since : Wednesday  30/10/2019
 * Time  : 22:48
 **/

public class HomePage extends Util {

    By welcometext = By.xpath("//body[@class='home page-template-default page page-id-86705 tribe-js']/header[@class='site-header']/div[@class='site-banner']/div[@class='site-banner-logo']/h1[@class='site-logo']/a[@name='top']/*[1]");

    public String homepageWelcomeText()
    {
        return getTextFromElement(welcometext);
    }
}


