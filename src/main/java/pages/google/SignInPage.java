//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package pages.google;

import enums.WaitStrategy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WaitUtils;

public class SignInPage {
    public final WebDriver driver;
    public final WebElement UseyorGoogleAccount;
    public final WebElement emailOrPhone;
    public final WebElement nextButton;

    public SignInPage(WebDriver driver) {
        this.driver = driver;
        this.UseyorGoogleAccount = driver.findElement(By.xpath("//span[text()='Use your Google Account']"));
        this.emailOrPhone = driver.findElement(By.xpath("//input[@type='email']"));
        this.nextButton = driver.findElement(By.xpath("//span[normalize-space()='Next']"));
    }

    public void enterEmailOrPhone(String email) {
        this.emailOrPhone.sendKeys(email);
    }

    public void clickOnNextButton() {
        WaitUtils.applyWait(this.driver, this.nextButton, WaitStrategy.CLICKABLE);
        this.nextButton.click();
    }
}
