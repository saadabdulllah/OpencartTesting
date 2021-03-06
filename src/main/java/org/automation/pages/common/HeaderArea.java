package org.automation.pages.common;

import org.automation.core.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by shantonu on 12/14/16.
 * todo => get all the link locators
 */
public class HeaderArea extends PageBase {

    public WebElement checkoutLink;
    public WebElement shoppingCartLink;
    public WebElement Link;
    public WebElement siteMapLink;
    public WebElement brandsLink;
    public WebElement giftVoucersLink;
    public WebElement affiliatesLink;
    public WebElement specialsLink;
    public WebElement myAccountLink;
    public WebElement OrderHistoryLink;

    public WebElement wishListLink;
    public WebElement newsLetterLink;


    public HeaderArea(WebDriver aDriver) {
        super(aDriver);
    }
}
