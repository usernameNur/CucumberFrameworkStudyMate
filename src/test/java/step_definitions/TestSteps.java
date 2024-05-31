package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import pages.TaskPage;
import pages.TestPage;
import utilities.Driver;

public class TestSteps {

    WebDriver driver= Driver.getDriver();
    LoginPage loginPage=new LoginPage();
    TestPage testPage = new TestPage();

    @Given("user is on page {string}")
    public void user_is_on_page(String URL) {
        driver.get(URL);
    }
    @Given("user is logged in with valid credentials {string} {string}")
    public void user_is_logged_in_with_valid_credentials(String userName, String password) throws InterruptedException {
        loginPage.userName.sendKeys(userName);
            Thread.sleep(2000);
            loginPage.password.sendKeys(password);
            Thread.sleep(2000);
            loginPage.submitButton.click();
    }
    @When("user navigates to the Test page")
    public void user_navigates_to_the_test_page() {
        testPage.sdet_baku.click();
        testPage.lesson.click();
        testPage.test.click();
    }
    @Then("verify that the Test page is displayed")
    public void verify_that_the_test_page_is_displayed() {
        boolean isTestPageDisplayed = testPage.results.isDisplayed();
        Assert.assertTrue("Test page is not displayed correctly", isTestPageDisplayed);
    }
}
