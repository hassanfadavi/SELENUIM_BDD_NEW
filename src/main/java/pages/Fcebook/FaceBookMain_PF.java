package pages.Fcebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;

public class FaceBookMain_PF {



    public WebDriver driver;


  //elements
    @FindBy(xpath ="//input[@name='email']" )
    public WebElement userName;

    @FindBy(xpath ="//input[@name='pass']")
    public WebElement passWord;

    @FindBy(xpath ="//button[@name='login']")
    public WebElement loginButton;

    //constructor
    public FaceBookMain_PF(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);

    }

    //userName
    public void inputUserName(String userName){
        this.userName.sendKeys(userName);

    }
    //password
    public void inputPassWord(String passWord){
        this.passWord.sendKeys(passWord);
    }
    //click on Login
    public void loginButton(){
        loginButton.click();
    }




}
