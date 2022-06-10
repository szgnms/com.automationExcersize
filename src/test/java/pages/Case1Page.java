package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Case1Page {

    public Case1Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//*[@src='/static/images/home/logo.png']")
    public WebElement homePage;

    @FindBy (xpath = "//a[normalize-space()='Signup / Login']")
    public WebElement singUploginButton;

    @FindBy (css = "div[class='signup-form'] h2")
    public WebElement newUserSignup;

    @FindBy (xpath = "//input[@placeholder='Name']")
    public WebElement nameInput;

    @FindBy (xpath = "//button[normalize-space()='Signup']")
    public WebElement signupButton;

    @FindBy (xpath = "//b[normalize-space()='Enter Account Information']")
    public WebElement accInformation;

    @FindBy (xpath = "//input[@id='id_gender1']")
    public WebElement title;

    @FindBy (xpath = "//input[@id='newsletter']")
    public WebElement newsLetterButton;

    @FindBy (xpath = "//label[@for='optin']")
    public WebElement receiveOffers;


    @FindBy (xpath = "//input[@id='first_name']")
    public WebElement firstName;

    @FindBy (xpath = "//button[normalize-space()='Create Account']")
    public WebElement createAccountButton;

    @FindBy (xpath = "//a[@class='btn btn-primary']")
    public WebElement continueButton;

    @FindBy (xpath = "//li[9]//a[1]")
    public WebElement userLogged;
    @FindBy (xpath = "//b[normalize-space()='Account Created!']")
    public WebElement accountCreated;

    @FindBy (xpath = "//*[@href='/delete_account']")
    public WebElement deleteAccountButton;

    @FindBy (xpath = "//a[normalize-space()='Delete Account']")
    public WebElement accountDeleted;

}
