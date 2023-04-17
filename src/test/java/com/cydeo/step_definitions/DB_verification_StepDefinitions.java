package com.cydeo.step_definitions;

import com.cydeo.pages.DB_BooksPage;
import com.cydeo.pages.DB_DashBoardPage;
import com.cydeo.pages.DB_UsersPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.DBUtils;
import com.cydeo.utilities.LibraryDB;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Map;

public class DB_verification_StepDefinitions {

    DB_DashBoardPage dashBoardPage = new DB_DashBoardPage();
    DB_UsersPage usersPage = new DB_UsersPage();
    DB_BooksPage booksPage = new DB_BooksPage();

    @Given("Users should be able to navigate to {string} page")
    public void users_should_be_able_to_navigate_to_page(String page) {

        System.out.println("Going to page " + page);
        switch (page.toLowerCase()) {
            case LibraryDB.DASHBOARD:
                dashBoardPage.dashboard.click();
                break;
            case LibraryDB.USERS:
                dashBoardPage.users.click();
                break;
            case LibraryDB.BOOKS:
                dashBoardPage.books.click();
                break;
        }

    }

    @When("Users should be able to open book {string}")
    public void users_should_be_able_to_open_book(String book) {

        System.out.println("book = " + book);
        BrowserUtils.waitForClickablility(booksPage.search, 5).sendKeys(book);
        BrowserUtils.waitForClickablility(booksPage.editBook(book), 5).click();

    }


    @Then("UI book information should match the DB book information for book {string}")
    public void uiBookInformationShouldMatchTheDBBookInformationForBook(String bookName) {
        BrowserUtils.waitFor(3);

        //get information from UI
        String actualName = booksPage.bookName.getAttribute("value");
        String actualAuthor = booksPage.author.getAttribute("value");
        String actualISBN = booksPage.isbn.getAttribute("value");
        String actualYear = booksPage.year.getAttribute("value");
        String actualDesc = booksPage.description.getAttribute("value");

        System.out.println("actualName = " + actualName);
        System.out.println("actualAuthor = " + actualAuthor);

        //get information from database
        String query = "select name, isbn,year,author,description from books\n" +
                "where name = '"+bookName+"'";

        Map<String, Object> dbData = DBUtils.getRowMap(query);

        System.out.println(dbData.toString());

        String expectedName = dbData.get("name").toString();
        String expectedISBN = dbData.get("isbn").toString();
        String expectedYear = dbData.get("year").toString();
        String expectedAuthor = dbData.get("author").toString();
        String expectedDesc = dbData.get("description").toString();


        Assert.assertEquals("did not match name",expectedName,actualName);
        Assert.assertEquals("did not match Author",expectedAuthor,actualAuthor);
        Assert.assertEquals("did not match Year",expectedYear,actualYear);
        Assert.assertEquals("did not match ISBN",expectedISBN,actualISBN);
        Assert.assertEquals("did not match Description",expectedDesc,actualDesc);


        Assert.assertEquals(booksPage.bookName.getAttribute("value"),dbData.get("name").toString());

    }


}
