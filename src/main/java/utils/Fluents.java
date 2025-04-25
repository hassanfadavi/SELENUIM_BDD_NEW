package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Fluents {

        public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();

        //explicit wait
//        WebDriverWait exwaits=new WebDriverWait(driver,Duration.ofSeconds(10));
//       WebElement about =driver.findElement(By.xpath("//a[text()='About']"));
//        exwaits.until(ExpectedConditions.elementToBeClickable(about));

        //fluentWait
        Wait<WebDriver> wait=new FluentWait<>(driver )

                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(StaleElementReferenceException.class);


        WebElement googleabout =driver.findElement(By.xpath("//a[text()='About']"));
        wait.until(ExpectedConditions.elementToBeClickable(googleabout));
        //or
        WebElement googleaboutTwo =wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[text()='About']")));


    }

}
