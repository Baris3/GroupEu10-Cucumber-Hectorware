package com.cydeo.step_definitions;
import com.cydeo.pages.DB_Add_user_page;
import com.cydeo.pages.DB_PagesBase;
import com.cydeo.pages.DB_UsersPage;
import com.cydeo.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

public class DB_Add_new_user {

    DB_PagesBase DB_PagesBase = new DB_PagesBase();
    DB_UsersPage DB_UsersPage = new DB_UsersPage();
    DB_Add_user_page DB_Add_user_page = new DB_Add_user_page();


    @When("Librarian select Users from Navigation bar")
    public void librarian_select_users_from_navigation_bar() {

        DB_PagesBase.users.click();

    }


    @Then("Librarian should be able to click Add user button")
    public void librarian_should_be_able_to_click_add_user_button() {

        DB_UsersPage.addUser.click();
    }


    @Then("Librarian should be able to see Full Name box in pop up window")
    public void librarian_should_be_able_to_see_full_name_box_in_pop_up_window() {

        DB_Add_user_page.fullName.isDisplayed();

        String actualBoxTextFN = DB_Add_user_page.fullName.getText();
        String expectedBoxTextFN = "Full Name";
        Assert.assertEquals(expectedBoxTextFN, actualBoxTextFN);

    }

    @Then("Librarian should be able to see Password box in pop up window")
    public void librarian_should_be_able_to_see_password_box_in_pop_up_window() {

        DB_Add_user_page.password.isDisplayed();

        String actualBoxTextPASS = DB_Add_user_page.password.getText();
        String expectedBoxTextPASS = "Password";
        Assert.assertEquals(expectedBoxTextPASS, actualBoxTextPASS);

    }
    @Then("Librarian should be able to see Email box in pop up window")
    public void librarian_should_be_able_to_see_email_box_in_pop_up_window() {

        DB_Add_user_page.email.isDisplayed();

        String actualBoxTextEM = DB_Add_user_page.email.getText();
        String expectedBoxTextEM = "Email";
        Assert.assertEquals(expectedBoxTextEM, actualBoxTextEM);
    }
    @Then("Librarian should be able to see User Group box in pop up window")
    public void librarian_should_be_able_to_see_user_group_box_in_pop_up_window() {

        DB_Add_user_page.userGroup.isDisplayed();

        String actualBoxTextUG = DB_Add_user_page.userGroup.getText();
        String expectedBoxTextUG = "User Group";
        Assert.assertEquals(expectedBoxTextUG, actualBoxTextUG);

    }
    @Then("Librarian should be able to see Status box in pop up window")
    public void librarian_should_be_able_to_see_status_box_in_pop_up_window() {

        DB_Add_user_page.status.isDisplayed();

        String actualBoxTextST = DB_Add_user_page.status.getText();
        String expectedBoxTextST = "Status";
        Assert.assertEquals(expectedBoxTextST, actualBoxTextST);
    }
    @Then("Librarian should be able to see Start Date box in pop up window")
    public void librarian_should_be_able_to_see_start_date_box_in_pop_up_window() {

        DB_Add_user_page.startDate.isDisplayed();

        String actualBoxTextSD = DB_Add_user_page.startDate.getText();
        String expectedBoxTextSD = "Start Date";
        Assert.assertEquals(expectedBoxTextSD, actualBoxTextSD);

    }

    @Then("Librarian should be able to see End Date box in pop up window")
    public void librarian_should_be_able_to_see_end_date_box_in_pop_up_window() {

        DB_Add_user_page.endDate.isDisplayed();

        String actualBoxTextED = DB_Add_user_page.endDate.getText();
        String expectedBoxTextED = "End Date";
        Assert.assertEquals(expectedBoxTextED, actualBoxTextED);
    }

    @Then("Librarian should be able to see Address box in pop up window")
    public void librarian_should_be_able_to_see_address_box_in_pop_up_window() {

        DB_Add_user_page.address.isDisplayed();

        String actualBoxTextAD = DB_Add_user_page.address.getText();
        String expectedBoxTextAD = "Address";
        Assert.assertEquals(expectedBoxTextAD, actualBoxTextAD);

    }

    @Then("Librarian should be able to enter {string} as Full Name")
    public void librarian_should_be_able_to_enter_as_full_name(String string) {
        DB_Add_user_page.boxFullName.sendKeys(string);
    }
    @Then("Librarian should be able to enter {string} as Password")
    public void librarian_should_be_able_to_enter_as_password(String string) {
       DB_Add_user_page.boxPassword.sendKeys(string);
    }
    @Then("Librarian should be able to enter {string} as Email")
    public void librarian_should_be_able_to_enter_as_email(String string) {
        DB_Add_user_page.boxEmail.sendKeys(string);
    }
    @Then("Librarian should be able to chose {string} from User Group")
    public void librarian_should_be_able_to_chose_from_user_group(String string) {

        Select selectUserGroup = new Select(DB_Add_user_page.boxUserGroup);
        selectUserGroup.selectByVisibleText(string);

    }

    @Then("Librarian should be able to chose {string} as Status")
    public void librarian_should_be_able_to_chose_as_status(String string) {

        Select selectStatus = new Select(DB_Add_user_page.boxStatus);
        selectStatus.selectByVisibleText(string);

    }

    @Then("Librarian should be able to enter {string} as Start Date box")
    public void librarian_should_be_able_to_enter_as_start_date_box(String string) {

        DB_Add_user_page.boxStartDate.clear();
        DB_Add_user_page.boxStartDate.sendKeys(string);


    }

    @Then("Librarian should be able to enter {string} as End Date")
    public void librarian_should_be_able_to_enter_as_end_date(String string) {

        DB_Add_user_page.boxEndDate.clear();
        DB_Add_user_page.boxEndDate.sendKeys(string);

    }

    @Then("Librarian should be able to enter {string} as Address")
    public void librarian_should_be_able_to_enter_as_address(String string) {

        DB_Add_user_page.boxAddress.sendKeys(string);

    }


    @Then("Librarian should be able add new user by clicking to Save changes button")
    public void librarian_should_be_able_add_new_user_by_clicking_to_save_changes_button() {

        DB_Add_user_page.saveChangesBtn.click();


    }


}
