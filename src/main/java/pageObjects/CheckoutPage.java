package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.sql.Driver;

public class CheckoutPage {

    public WebDriver driver;

    public CheckoutPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id="")
    public WebElement checkoutPageHeading;

    @FindBy(id="")
    public WebElement  firstNameTxtFld;

    //diver.findElement(By.id(""));

    @FindBy(id="")
    public WebElement lastNameTxtFld;

    @FindBy(id="")
    public WebElement postcodeTxtFld;

    @FindBy(id="")
    public WebElement cancelBtn;

    @FindBy(id="")
    public WebElement continueButton;

    public void verifyCheckoutPageLanding(String expectedCheckoutPageHeading)
    {
        Assert.assertEquals(expectedCheckoutPageHeading, checkoutPageHeading.getText());
    }

    public void enterFirstname(String firstname)
    {
        firstNameTxtFld.sendKeys(firstname);
    }

    public void enterLastname(String lastname)
    {
        lastNameTxtFld.sendKeys(lastname);
    }

    public void enterPostcode(String postcode)
    {
        postcodeTxtFld.sendKeys(postcode);
    }

    public void clickContinueBtn()
    {
        continueButton.click();
    }

}
