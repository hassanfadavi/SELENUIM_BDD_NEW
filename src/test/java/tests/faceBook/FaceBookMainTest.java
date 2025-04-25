//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package tests.faceBook;

import base.BaseTest;
import enums.WaitStrategy;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Fcebook.FaceBookMain_PF;
import utils.WaitUtils;

public class FaceBookMainTest extends BaseTest {
    public FaceBookMainTest() {
    }

    @Test
    public void loginTest() {
        String expectedUrl = "https://www.facebook.com/";
        String actualUrl = this.driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl, "Failed");
        logger.info("Verifying that the browser is opened and we are navigating to correct URL.");
        FaceBookMain_PF faceBookMainPf = new FaceBookMain_PF(this.driver);
        faceBookMainPf.inputUserName("hassan");
        WaitUtils.applyWait(this.driver, faceBookMainPf.userName, WaitStrategy.CLICKABLE);
        logger.info("Verifying that the userName passe");
        WaitUtils.applyGlobalWait();
        faceBookMainPf.inputPassWord("123456789");
        WaitUtils.applyWait(this.driver, faceBookMainPf.passWord, WaitStrategy.CLICKABLE);
        logger.info("Verifying that the password passed");
        WaitUtils.applyGlobalWait();
        faceBookMainPf.loginButton();
        WaitUtils.applyWait(this.driver, faceBookMainPf.loginButton, WaitStrategy.CLICKABLE);
        WaitUtils.applyGlobalWait();
    }
}
