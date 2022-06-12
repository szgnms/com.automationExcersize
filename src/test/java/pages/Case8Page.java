package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Case7Page {
    public Case7Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy (xpath = "//a[contains(text(),'Test Cases')]")
    public WebElement testCasesButton;

    @FindBy (xpath = "//b[normalize-space()='Test Cases']")
    public WebElement testcasesPage;

}
