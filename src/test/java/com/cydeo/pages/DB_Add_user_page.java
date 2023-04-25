package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DB_Add_user_page {

    public DB_Add_user_page (){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//*[@id=\"add_user_form\"]/div[1]/div/div[1]/div/div/label")
    public WebElement fullName;

    @FindBy(xpath = "//*[@id=\"add_user_form\"]/div[1]/div/div[2]/div[1]/div/label")
    public WebElement password;

    @FindBy(xpath = "//*[@id=\"add_user_form\"]/div[1]/div/div[2]/div[2]/div/label" )
    public WebElement email;

    @FindBy(xpath = "//*[@id=\"add_user_form\"]/div[1]/div/div[3]/div[1]/div/label" )
    public WebElement userGroup;

    @FindBy(xpath = "//*[@id=\"add_user_form\"]/div[1]/div/div[3]/div[2]/div/label")
    public WebElement status;

    @FindBy(xpath = "//*[@id=\"add_user_form\"]/div[1]/div/div[4]/div[1]/div/label" )
    public WebElement startDate;

    @FindBy(xpath = "//*[@id=\"add_user_form\"]/div[1]/div/div[4]/div[2]/div/label" )
    public WebElement endDate;

    @FindBy(xpath = "//*[@id=\"add_user_form\"]/div[1]/div/div[5]/div/div/label" )
    public WebElement address;

    @FindBy(xpath = "//*[@id=\"add_user_form\"]/div[1]/div/div[1]/div/div/input" )
    public WebElement boxFullName;

    @FindBy(xpath = "//*[@id=\"add_user_form\"]/div[1]/div/div[2]/div[1]/div/input" )
    public WebElement boxPassword;

    @FindBy(xpath = "//*[@id=\"add_user_form\"]/div[1]/div/div[2]/div[2]/div/input" )
    public WebElement boxEmail;

    @FindBy(xpath = "//*[@id=\"user_group_id\"]")
    public WebElement boxUserGroup;

    @FindBy(xpath = "//*[@id=\"status\"]" )
    public WebElement boxStatus;

    @FindBy(xpath = "//*[@id=\"start_date\"]/input" )
    public WebElement boxStartDate;

    @FindBy(xpath = "//*[@id=\"end_date\"]/input" )
    public WebElement boxEndDate;

    @FindBy(xpath = "//*[@id=\"address\"]" )
    public WebElement boxAddress;

   @FindBy(css = "#add_user_form > div.modal-footer > button.btn.btn-primary")
    public WebElement saveChangesBtn;






}
