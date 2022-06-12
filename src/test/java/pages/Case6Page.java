package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Case5Page {
    public Case5Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy (xpath = "//p[normalize-space()='Email Address already exist!']")
    public WebElement verifyAlreadyExists;
    @FindBy (xpath = "//input[@placeholder='Name']")
    public WebElement nameInput;


}
