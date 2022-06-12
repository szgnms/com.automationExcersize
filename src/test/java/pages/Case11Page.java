package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class Case10Page {
    public Case10Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//h2[normalize-space()='Subscription']")
    public WebElement subscription;

    @FindBy(xpath = "//input[@id='susbscribe_email']")
    public WebElement inputEmail;

    @FindBy(xpath = "//i[@class='fa fa-arrow-circle-o-right']")
    public WebElement arrowButton;

    @FindBy(xpath = "//*[@id='success-subscribe']")
    public  WebElement subsSuccess;

}