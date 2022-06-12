package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.ArrayList;
import java.util.List;

public class Case9Page {
    public Case9Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//*[@id='search_product']")
    public WebElement searchBox;

    @FindBy(xpath = "//i[@class='fa fa-search']")
    public WebElement searchButton;

    @FindBy(xpath = "//*[@class='productinfo text-center']/p")
    public  List<WebElement> productsList;

}