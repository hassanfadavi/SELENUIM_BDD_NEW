//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package tests.base;

import base.BaseTest;
import enums.WaitStrategy;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.home.GoogleMainPage;
import pages.home.GoogleMainPage_PF;
import utils.WaitUtils;

public class BrowserTest extends BaseTest {
    public BrowserTest() {
    }

    @Test
    public void myBrowserTest() {
        String expectedUrl = "https://www.google.com/";
        String actualUrl = this.driver.getCurrentUrl();
        logger.info("Verifying that the browser is opened and we are navigating to correct URL.");
        WaitUtils.applyGlobalWait();
    }

    @Test
    public void myBrowserTestTwo() throws InterruptedException {
        new GoogleMainPage(this.driver);
        GoogleMainPage_PF googleMainPageFactory = new GoogleMainPage_PF(this.driver);
        String expectedUrl = "https://www.google.com/";
        String actualUrl = this.driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl, "Failed");
        logger.info("Verifying that the browser is opened and we are navigating to correct URL.");
        WaitUtils.applyWait(this.driver, googleMainPageFactory.aboutButton, WaitStrategy.CLICKABLE);
        googleMainPageFactory.clickOnAboutButton();
        WaitUtils.applyGlobalWait();
    }
}
