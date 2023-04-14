package com.cydeo.step_definitions;

import com.cydeo.pages.DB_loginPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import com.cydeo.utilities.LibraryDB;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class DB_loginStepDefinition {

    DB_loginPage DB_loginPage = new DB_loginPage();

    @Given("Navigate to DB URL")
    public void navigate_to_db_url() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url2"));
    }


    @When("Enter valid DB username in Email address field")
    public void enter_valid_db_username_in_email_address_field() {

        String username = ConfigurationReader.get("userNameLibrarian");
        DB_loginPage.username.sendKeys(username);

    }


    @When("Enter valid DB password in password field")
    public void enter_valid_db_password_in_password_field() {

        String password = ConfigurationReader.get("passwordLibrarian");
        DB_loginPage.password.sendKeys(password);

    }


    @When("Click on Sign in button")
    public void click_on_sign_in_button() {

        DB_loginPage.signIn.click();

    }


    @Then("Verify the library2 main page")
    public void verify_the_library2_main_page() {
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Login - Library";
        Assert.assertEquals(expectedTitle,actualTitle);


    }


    @Given("User should be able to login to DB as a {string}")
    public void user_should_be_able_to_login_to_db_as_a(String user) throws Exception {

        String username = null, password = null;
        switch (user.toLowerCase()) {
            case LibraryDB.LIBRARIAN:
                username = ConfigurationReader.get("userNameLibrarian");
                password = ConfigurationReader.get("passwordLibrarian");
                break;
            case LibraryDB.STUDENT:
                username = ConfigurationReader.get("userNameStudent");
                password = ConfigurationReader.get("passwordStudent");
                break;
            default:
                throw new Exception("Wrong user type is provided: "+user);
        }
        DB_loginPage.login(username, password);
    }


}
