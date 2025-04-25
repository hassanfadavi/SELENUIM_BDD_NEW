//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package stepdefinations.google;

import base.BaseTest;
import config.DriverFactory;
import enums.WaitStrategy;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.google.GoogleLandingPage;
import pages.google.SignInPage;
import utils.WaitUtils;

public class NavigateToGoogleSignInPage extends BaseTest {
    public GoogleLandingPage googleLandingPage;
    public SignInPage signInPage;

    public NavigateToGoogleSignInPage() {
    }

    @Before
    public void prepare() {
        this.googleLandingPage = new GoogleLandingPage(DriverFactory.getDriver());
    }

    public void setUp() {
        this.setup();
        this.signInPage = new SignInPage(this.driver);
    }

    @Given("user is on google dash board")
    public void user_is_on_google_dash_board() {
    }

    @When("I will click on signIn button")
    public void i_will_click_on_sign_in_button() {
        WaitUtils.applyGlobalWait();
        WaitUtils.applyWait(this.driver, this.googleLandingPage.signInButton, WaitStrategy.CLICKABLE);
        WaitUtils.applyGlobalWait();
        this.googleLandingPage.clickOnSignIn();
        WaitUtils.applyGlobalWait();
    }

    @Then("I should see Use your Google Account text on signin page")
    public void I_should_see_Use_your_Google_Account_text_on_signin_page() {
        this.signInPage = new SignInPage(DriverFactory.getDriver());
        WaitUtils.applyGlobalWait();
        String actualText = this.signInPage.UseyorGoogleAccount.getText();
        WaitUtils.applyGlobalWait();
        String expectText = "Use your Google Account";
        WaitUtils.applyGlobalWait();
        Assert.assertEquals("text does not matched", expectText, actualText);
    }
}
