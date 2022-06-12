package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Case3Page {
    public Case3Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy (xpath = "//input[@data-qa='login-email']")
    public WebElement loginEmail;


    @FindBy (xpath = "//p[normalize-space()='Your email or password is incorrect!']")
    public WebElement incorrect;

}
