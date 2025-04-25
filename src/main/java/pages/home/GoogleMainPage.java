package pages.home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleMainPage {

    public WebDriver driver;

    // WebElements
    public WebElement aboutButton;
    public WebElement storeButton;



    public GoogleMainPage(WebDriver driver) {
        this.driver = driver;
        this.aboutButton = driver.findElement(By.xpath("//a[text()='About']"));
        this.storeButton = driver.findElement(By.xpath("//a[text()='Store']"));
    }

    public void clickOnAboutButton() {
        this.aboutButton.click();
    }
    public void clickOnstoreButton() {
        this.storeButton.click();
    }

}