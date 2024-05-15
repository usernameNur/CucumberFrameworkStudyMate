package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;



public class LoginPage {
    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(css = "input[id=':r0:']")
    public WebElement login;

    @FindBy(css = "input[id=':r1:']")
    public WebElement password;

    @FindBy(css = "button[type='submit']")
    public WebElement submitButton;


    @FindBy (xpath = "//p[text()='User with email kalambekova@gmail.com not found']")
    public WebElement invalidUserName;

    @FindBy (xpath = "(//span[@class='sc-ipEyDJ jBKvvv'])[2]")
    public WebElement passwordIsRequired;
}
