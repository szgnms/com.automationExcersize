package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Case6Page {
    public Case6Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy (xpath = "//a[normalize-space()='Contact us']")
    public WebElement contactUsButton;

    @FindBy (xpath = "//h2[normalize-space()='Get In Touch']")
    public WebElement getInTouch;

    @FindBy (xpath = "//input[@name='upload_file']")
    public WebElement uploadFile;

    @FindBy (xpath = "//input[@placeholder='Name']")
    public WebElement name;

    @FindBy (xpath = "//input[@name='submit']")
    public WebElement submitButton;

    @FindBy (xpath = "//div[@class='status alert alert-success']")
    public WebElement verifysuccess;

    @FindBy (xpath = "//span[normalize-space()='Home']")
    public WebElement homeButton;

}
