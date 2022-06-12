package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Case8Page {
    public Case8Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy (xpath = "//a[@href='/products']")
    public WebElement productsButton;

    @FindBy (xpath = "//h2[@class='title text-center']")
    public WebElement productsPage;

    @FindBy (xpath = "//div[@class='features_items']")
    public WebElement productsList;

    @FindBy (xpath = "(//i[@class='fa fa-plus-square'])[1]")
    public WebElement firstProduct;

    @FindBy (xpath = "//*[@class='product-details']")
    public WebElement productDetailpage;

    @FindBy (xpath = "//h2[normalize-space()='Blue Top']")
    public WebElement productName;

    @FindBy (xpath = "//p[normalize-space()='Category: Women > Tops']")
    public WebElement productCategory;

    @FindBy (xpath = "//span[normalize-space()='Rs. 500']")
    public WebElement productPrice;

    @FindBy (xpath = "//b[normalize-space()='Availability:']")
    public WebElement productAvailibity;

    @FindBy (xpath = "//b[normalize-space()='Condition:']")
    public WebElement productCondition;

    @FindBy (xpath = "//b[normalize-space()='Brand:']")
    public WebElement productBrand;

}
