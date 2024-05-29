package step_definitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;
import pages.TaskPage;
import utilities.Driver;

public class TaskSteps {

    WebDriver driver= Driver.getDriver();
    LoginPage loginPage=new LoginPage();
    TaskPage taskPage=new TaskPage();
    @Given("user on {string} page")
    public void user_on_page(String url) {

        driver.get(url);
    }
    @Given("user logs in with valid {string} {string} credentials")
    public void user_logs_in_with_valid_credentials(String username, String password) throws InterruptedException {
        loginPage.userName.sendKeys(username);
        Thread.sleep(2000);
        loginPage.password.sendKeys(password);
        Thread.sleep(2000);
        loginPage.submitButton.click();
    }
    @Given("user goes to Task page")
    public void user_goes_to_task_page() {
        taskPage.sdet_nurz.click();
        taskPage.lesson.click();
        taskPage.task.click();
        taskPage.homeAssignment.click();
    }
    @Given("user clicks on update button")
    public void user_clicks_on_update_button() {
        taskPage.updateButton.click();
    }
    @Given("user provides input {string}")
    public void user_provides_input(String input) {
        taskPage.inputField.sendKeys(input);
    }
    @Given("user clicks on submit button")
    public void user_clicks_on_submit_button() {
        taskPage.submitButton.click();
    }
    @Then("verify user was able to update Task")
    public void verify_user_was_able_to_update_task() {

        WebElement message = driver.findElement(By.xpath("//div[@class='sc-hjsNop eydhlT']"));
        Assert.assertTrue(message.isDisplayed());
    }

}
