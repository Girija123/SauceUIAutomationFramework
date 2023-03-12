package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    public WebDriver driver;

    public HomePage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    @FindBy(id="user-name")
    public WebElement usernameTxtFld;

    @FindBy(id="password")
    public WebElement passwordTxtFld;

    @FindBy(name="login-button")
    public WebElement loginBtn;

    @FindBy(className = "login_logo")
    public WebElement logoImg;


    public void enterUsername(String username)
    {
        usernameTxtFld.sendKeys(username);
    }

    public void enterPassword(String password)
    {
        passwordTxtFld.sendKeys(password);
    }

    public void clickLoginButton()
    {
        loginBtn.click();
    }

    public void verifyHomePageLanding(String expectedHomePageTitle)
    {
        Assert.assertTrue(logoImg.isDisplayed());
        Assert.assertEquals(expectedHomePageTitle, driver.getTitle());
    }
}
