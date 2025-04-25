//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package pages.Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Dashboard_MainPage {
    public WebDriver driver;
    public final WebElement signIn;
    public final WebElement holiday;

    public Dashboard_MainPage(WebDriver driver) {
        this.driver = driver;
        this.signIn = driver.findElement(By.xpath("//span[text()='Hello, sign in']"));
        this.holiday = driver.findElement(By.xpath("//a[@id='nav-holiday']"));
    }

    public void clickOnSignIn() {
        this.signIn.click();
    }

    public void clickOnHoliday() {
        this.holiday.click();
    }
}
