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
import pages.google.GoogleLandingPage;
import utils.WaitUtils;

public class NavigateToGoogleAboutPage extends BaseTest {
    GoogleLandingPage googleLandingPage;

    public NavigateToGoogleAboutPage() {
    }

    @Before
    public void setupp() {
        super.setup();
        this.googleLandingPage = new GoogleLandingPage(DriverFactory.getDriver());
    }

    @Given("I am on the google web page")
    public void i_am_on_the_google_web_page() {
    }

    @When("I click on about button")
    public void i_click_on_about_button() {
        WaitUtils.applyGlobalWait();
        WaitUtils.applyWait(this.driver, this.googleLandingPage.aboutButton, WaitStrategy.CLICKABLE);
        this.googleLandingPage.clickOnAboutButton();
        WaitUtils.applyGlobalWait();
    }

    @Then("I should see the about page")
    public void i_should_see_the_about_page() throws InterruptedException {
        Thread.sleep(2000L);
    }
}
