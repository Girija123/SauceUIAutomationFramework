package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PDPage {

    public WebDriver driver;

    public PDPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//button[text()='Add to cart']")
    public WebElement addToCartBtnPDP;

    @FindBy(name="back-to-products")
    public WebElement backToProductsBtn;

    public void  clickAddToCartBtn()
    {
        addToCartBtnPDP.click();
    }

    public void clickBackToProductsBtn()
    {
        backToProductsBtn.click();
    }

    public void assertPDPageLanding()
    {
        Assert.assertTrue(backToProductsBtn.isDisplayed());
    }

}
