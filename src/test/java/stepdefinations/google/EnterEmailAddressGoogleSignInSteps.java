package stepdefinations.google;

import base.BaseTest;
import config.ConfigManager;
import config.DriverFactory;
import constansts.ApplicationsConstants;
import enums.WaitStrategy;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.google.GoogleLandingPage;
import pages.google.PasswordPage;
import pages.google.SignInPage;

import utils.WaitUtils;


public class EnterEmailAddressGoogleSignInSteps extends BaseTest {

    public GoogleLandingPage googleLandingPage;
    public SignInPage googleSignInPage;

    @Given("user is on google dash boards")
    public void user_is_on_google_dashboard() {}

    @When("I will click on signIn buttons")
    public void i_will_click_on_google_sign_in_button() {
        this.googleLandingPage = new GoogleLandingPage(DriverFactory.getDriver());
        WaitUtils.applyWait(driver, googleLandingPage.signInButton, WaitStrategy.CLICKABLE);
        googleLandingPage.clickOnSignIn();
    }

    @Then("I should see Use your Google Account text on signin pages")
    public void i_should_see_use_your_google_account_text_on_sign_in_page() {
        this.googleSignInPage = new SignInPage(DriverFactory.getDriver());
        String actualText = googleSignInPage.UseyorGoogleAccount.getText();
        String expectedText = "Use your Google Account";
        Assert.assertEquals(actualText, expectedText, "The text dose not match.");
    }

    @When("I input email adress")
    public void i_enter_an_email_address() {
        googleSignInPage.enterEmailOrPhone("someone123@gmail.com");
    }

    @And("I click on next button")
    public void i_click_on_next_button() {
        googleSignInPage.clickOnNextButton();
        WaitUtils.applyGlobalWait();
    }

    @Then("I should see Welcome text")
    public void i_should_see_welcome_text() {
        PasswordPage googlePasswordPage = new PasswordPage(DriverFactory.getDriver());
        String expectedText = ApplicationsConstants.GOOGLE_SIGN_IN_WELCOME_TEXT;
        String actualText = googlePasswordPage.welcomeText.getText();
        Assert.assertEquals(actualText, expectedText,"NO_MATCH_ERROR");
        WaitUtils.applyGlobalWait();
    }


}