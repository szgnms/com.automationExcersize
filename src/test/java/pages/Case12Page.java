package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Case11Page {
    public Case11Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "(//i[@class='fa fa-shopping-cart'])[1]")
    public WebElement cartButton;

}