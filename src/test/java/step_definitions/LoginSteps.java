package step_definitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import utilities.Driver;

public class LoginSteps {

    WebDriver driver= Driver.getDriver();
    LoginPage loginPage=new LoginPage();
    @Given("User is on the login page")
    public void user_is_on_login_page(){
        driver.get("https://codewise.studymate.us/student");
    }
    @When("User enters {string}")
    public void user_enters(String userName){
        loginPage.userName.sendKeys(userName);
    }
    @When("User provides {string}")
    public void user_provides(String password) {
        loginPage.password.sendKeys(password);
    }
    @Then("User clicks on the login button")
    public void user_click_on_login_button() {
        loginPage.submitButton.click();
    }
    @Then("Verify user is redirected to the home page")
    public void verify_user_is_redirected_to_the_home_page() throws InterruptedException {
        Thread.sleep(3000);
        String expectedUrl = "https://codewise.studymate.us/student/courses?size=10&page=1";
        Assert.assertEquals(expectedUrl, Driver.getDriver().getCurrentUrl());
    }
}
