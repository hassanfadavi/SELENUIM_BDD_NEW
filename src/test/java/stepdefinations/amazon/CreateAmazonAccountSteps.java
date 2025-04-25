//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package stepdefinations.amazon;

import base.BaseTest;
import enums.WaitStrategy;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.Amazon.CreatYourAccount_PF;
import pages.Amazon.Dashboard_MainPage;
import pages.Amazon.SignInPage_PF;
import utils.WaitUtils;

public class CreateAmazonAccountSteps extends BaseTest {
    SignInPage_PF amazonSignInPage;
    CreatYourAccount_PF amazonCreateAccountPage;
    Dashboard_MainPage amazonDashboardPage;

    public CreateAmazonAccountSteps() {
    }

    @Before
    public void setupDriver() {
        this.setup();
        this.amazonDashboardPage = new Dashboard_MainPage(this.driver);
        this.amazonSignInPage = new SignInPage_PF(this.driver);
        this.amazonCreateAccountPage = new CreatYourAccount_PF(this.driver);
    }

    @Given("I am on the amazon web page")
    public void i_am_on_the_amazon_web_page() {
        Assert.assertEquals("failed", "https://www.amazon.com/", this.driver.getCurrentUrl());
        logger.info("I am on the amazon web page");
    }

    @When("I click on signIn button")
    public void i_click_on_sign_in_button() {
        WaitUtils.applyWait(this.driver, this.amazonDashboardPage.signIn, WaitStrategy.VISIBLE);
        WaitUtils.applyWait(this.driver, this.amazonDashboardPage.signIn, WaitStrategy.CLICKABLE);
        this.amazonDashboardPage.clickOnSignIn();
        logger.info("I click on signIn button");
    }

    @Then("I click on Create amazon account button")
    public void i_click_on_create_amazon_account_button() {
        this.amazonSignInPage.clickOnCreateAccount();
        logger.info("I click on Create amazon account button");
    }

    @Then("I will enter username as value for your name field")
    public void i_will_enter_username_as_value_for_your_name_field() {
        this.amazonCreateAccountPage.enterfullName("John Doe");
        logger.info("I will enter username as value for your name field");
    }

    @Then("I will enter valid {string} as input")
    public void I_will_enter_valid_input(String inputType) {
        this.amazonCreateAccountPage.enterEmailOrPhone(inputType);
        logger.info("I will enter valid {string} as input");
    }

    @Then("I will enter password as a valid password value for password field")
    public void i_will_enter_password_as_a_valid_password_value_for_password_field() {
        this.amazonCreateAccountPage.enterPassword("JohnDoe!@#123");
        logger.info("I will enter password as a valid password value for password field");
    }

    @Then("I will  re-enter-password as a valid password value")
    public void i_will_re_enter_password_as_a_valid_password_value() {
        this.amazonCreateAccountPage.enterReEnterPassword("JohnDoe!@#123");
        logger.info("I will  re-enter-password as a valid password value");
    }

    @Then("I click on continue button")
    public void i_click_on_continue_button() {
        this.amazonCreateAccountPage.clickOnSubmitButton();
        logger.info("I click on continue button");
    }
}
