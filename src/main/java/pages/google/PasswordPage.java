

package pages.google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PasswordPage {
    public final WebDriver driver;
    public final WebElement welcomeText;

    public PasswordPage(WebDriver driver) {
        this.driver = driver;
        this.welcomeText = driver.findElement(By.xpath("//h1[@id='headingText']"));
    }
}
