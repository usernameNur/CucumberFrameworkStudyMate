package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TestPage {
    public TestPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(xpath = "//div[text()='SDET_BAKU']")
    public WebElement sdet_baku;
    @FindBy(xpath = "//p[@class='sc-uokDu bjaFwe']") ////p[@class='sc-uokDu bjaFwe']
    public WebElement lesson;
    @FindBy(xpath = "//a[@href='/student/courses/14/materials/35/test']")
    public WebElement test;

    @FindBy(xpath = "//div[@class='sc-ckLdoV fyDGRe']")
    public WebElement startTest;

    @FindBy(xpath = "//button[text()='Results']")
    public WebElement results;

    @FindBy(xpath = "(//div[@role='radiogroup'])[1]")
    public WebElement questionOne;

    @FindBy(xpath = "(//div[@role='radiogroup'])[2]")
    public WebElement questionTwo;


}
