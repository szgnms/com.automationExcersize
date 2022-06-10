package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import pages.Case1Page;
import utilities.ConfigReader;
import utilities.Driver;

public class Case1StepDefs {
    Case1Page csp1 = new Case1Page();

    Actions act = new Actions(Driver.getDriver());
    Faker fk= new Faker();
    @Given("Navigate to url {string}")
    public void navigateToUrl(String url) {
        Driver.getDriver().get(ConfigReader.getProperty(url));

    }

    @Then("Verify that home page is visible successfully")
    public void verifyThatHomePageIsVisibleSuccessfully() {
        Assert.assertTrue(csp1.homePage.isDisplayed());
    }

    @Then("Click on Signup Login button")
    public void clickOnSignupLoginButton() {
        csp1.singUploginButton.click();
    }

    @Then("Verify New User Signup! is visible")
    public void verifyNewUserSignupIsVisible() {
        Assert.assertTrue(csp1.newUserSignup.isDisplayed());
    }

    @Then("Enter name and email address")
    public void enterNameAndEmailAddress() throws InterruptedException {
        csp1.nameInput.sendKeys(fk.name().name());
        act.sendKeys(Keys.TAB);
        Thread.sleep(2000);
        act.sendKeys(fk.internet().emailAddress()).perform();

    }

    @Then("Click Signup button")
    public void clickSignupButton() {
        csp1.signupButton.click();
    }

    @Then("Verify that ENTER ACCOUNT INFORMATION is visible")
    public void verifyThatENTERACCOUNTINFORMATIONIsVisible() {
        Assert.assertTrue(csp1.accInformation.isDisplayed());
    }

    @Then("Fill details: Title, Name, Email, Password, Date of birth")
    public void fillDetailsTitleNameEmailPasswordDateOfBirth() {
        csp1.title.click();
        act.sendKeys(Keys.TAB).sendKeys(Keys.TAB).
                sendKeys(fk.internet().password()).
                sendKeys(Keys.TAB).sendKeys("5").
                sendKeys(Keys.TAB).sendKeys("nov").
                sendKeys(Keys.TAB).sendKeys("1980").perform();
    }

    @Then("Select checkbox Sign up for our newsletter!")
    public void selectCheckboxSignUpForOurNewsletter() {
        csp1.newsLetterButton.click();

    }

    @Then("Select checkbox Receive special offers from our partners!")
    public void selectCheckboxReceiveSpecialOffersFromOurPartners() {
        csp1.receiveOffers.click();
        act.sendKeys(Keys.TAB).perform();
    }

    @Then("Fill details: First name, Last name, Company, Address, Address, Country, State, City, Zipcode, Mobile Number")
    public void fillDetailsFirstNameLastNameCompanyAddressAddressCountryStateCityZipcodeMobileNumber( ) {

       csp1.firstName.sendKeys(fk.name().firstName());

               act.sendKeys(Keys.TAB).sendKeys(fk.name().lastName()).
                sendKeys(Keys.TAB).sendKeys(fk.company().name()).
                sendKeys(Keys.TAB).sendKeys(fk.address().streetAddress()).
                sendKeys(Keys.TAB).sendKeys(fk.address().countryCode()).
                sendKeys(Keys.TAB).sendKeys("u").
                sendKeys(Keys.TAB).sendKeys(fk.address().state()).
                sendKeys(Keys.TAB).sendKeys(fk.address().city()).
                sendKeys(Keys.TAB).sendKeys(fk.address().zipCode()).
                sendKeys(Keys.TAB).sendKeys(fk.phoneNumber().cellPhone()).perform();
    }

    @Then("Click Create Account button")
    public void clickCreateAccountButton() {
        csp1.createAccountButton.click();
    }

    @Then("Verify that ACCOUNT CREATED! is visible")
    public void verifyThatACCOUNTCREATEDIsVisible() {
        Assert.assertTrue(csp1.accountCreated.isDisplayed());
    }

    @Then("Click Continue button")
    public void clickContinueButton() {
        csp1.continueButton.click();
    }

    @Then("Verify that Logged in as username is visible")
    public void verifyThatLoggedInAsUsernameIsVisible() {
        Assert.assertTrue(csp1.userLogged.isDisplayed());
    }

    @Then("Click Delete Account button")
    public void clickDeleteAccountButton() {
        csp1.deleteAccountButton.click();
    }

    @Then("Verify that ACCOUNT DELETED! is visible and click Continue button")
    public void verifyThatACCOUNTDELETEDIsVisibleAndClickContinueButton() {
        Assert.assertTrue(csp1.accountDeleted.isDisplayed());
    }

}
