//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package pages.google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WaitUtils;

public class GoogleLandingPage {
    public final WebDriver driver;
    public final WebElement signInButton;
    public final WebElement aboutButton;

    public GoogleLandingPage(WebDriver driver) {
        this.driver = driver;
        this.signInButton = driver.findElement(By.xpath("//a[@aria-label='Sign in']"));
        this.aboutButton = driver.findElement(By.xpath("//a[text()='About']"));
    }

    public void clickOnSignIn() {
        this.signInButton.click();
    }

    public void clickOnAboutButton() {
        WaitUtils.applyGlobalWait();
        System.out.println("Is About button displayed? " + this.aboutButton.isDisplayed());
        this.aboutButton.click();
    }
}
