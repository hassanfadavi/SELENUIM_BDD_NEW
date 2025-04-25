//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package tests.Amazon;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.Amazon.CreatYourAccount_PF;
import pages.Amazon.Dashboard_MainPage;
import pages.Amazon.SignInPage_PF;
import utils.WaitUtils;

public class CreatAmazonAccount extends BaseTest {
    public CreatAmazonAccount() {
    }

    @Test(
            priority = 1
    )
    public void CreateAccount() {
        Dashboard_MainPage dashboard_mainPage = new Dashboard_MainPage(this.driver);
        SignInPage_PF signInPage_PF = new SignInPage_PF(this.driver);
        CreatYourAccount_PF creatYourAccount_PF = new CreatYourAccount_PF(this.driver);
        dashboard_mainPage.clickOnSignIn();
        WaitUtils.applyGlobalWait();
        signInPage_PF.clickOnCreateAccount();
        WaitUtils.applyGlobalWait();
        creatYourAccount_PF.enterfullName("hassanFadavi");
        creatYourAccount_PF.enterEmailOrPhone("s.hasanfadavi3223@gmail.com");
        creatYourAccount_PF.enterPassword("123456@asd");
        creatYourAccount_PF.enterReEnterPassword("123456@asd");
        creatYourAccount_PF.clickOnSubmitButton();
    }

    @Test(
            priority = 2
    )
    public void holiday() {
        Dashboard_MainPage dashboard_mainPage = new Dashboard_MainPage(this.driver);
        dashboard_mainPage.clickOnHoliday();
    }
}
