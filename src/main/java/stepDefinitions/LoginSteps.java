package stepDefinitions;

import functionLibrary.CommonFunctions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.CheckoutPage;
import pageObjects.HomePage;
import pageObjects.ProductsPage;

public class LoginSteps extends CommonFunctions {

    HomePage homePage = new HomePage(driver);
    ProductsPage productsPage = new ProductsPage(driver);
    CheckoutPage checkoutPage = new CheckoutPage(driver);

    @Given("I am on HomePage {string} with title {string}")
    public void openHomePage(String url, String expectedHomePageTitle)
    {
        driver.get(url);
        homePage.verifyHomePageLanding(expectedHomePageTitle);
    }

    @When("I do login with username {string} and password {string}")
    public void doLogin(String username, String password)
    {
        homePage.enterUsername(username);
        homePage.enterPassword(password);
        homePage.clickLoginButton();
    }

    @Then("I should land on products page with heading {string}")
    public void verifyProductsPageLanding(String expectedProductsPageHeading)
    {
        productsPage.verifyProductPageLanding(expectedProductsPageHeading);
    }

    public void doCheckout(String firstname, String lastname, String postcode)
    {
        checkoutPage.enterFirstname(firstname);
        checkoutPage.enterLastname(lastname);
        checkoutPage.enterPostcode(postcode);
        checkoutPage.clickContinueBtn();
    }
}
