package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DB_loginPage {

    public DB_loginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@id=\"inputEmail\"]")
    public WebElement username;

    @FindBy (xpath = "//*[@id=\"inputPassword\"]")
    public WebElement password;

    @FindBy (xpath = "//*[@id=\"login-form\"]/button")
    public WebElement signIn;

    public void login(String username, String password) {
        this.username.sendKeys(username);
        this.password.sendKeys(password);
        signIn.click();
    }


}
