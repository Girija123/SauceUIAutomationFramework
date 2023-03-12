package stepDefinitions;

import functionLibrary.CommonFunctions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class MenuTestSteps extends CommonFunctions {

    @Given("I am on Home Page {string} with title {string}")
    public void openHomePage(String url, String expectedPageTitle)
    {
        driver.get(url);
        driver.findElement(By.xpath("//button[@data-test='allow-all']")).click();
    }

    @When("I click Menu option {string}")
    public void clickMenuOption(String menuOption)
    {
        driver.findElement(By.xpath("//a[text()='"+menuOption+"']")).click();
    }

    @Then("I should get redirected to appropriate product page with heading {string}")
    public void verifyPageRedirection(String expectedPageHeading)
    {
        Assert.assertTrue(!driver.findElement(By.xpath("//h1[text()='"+expectedPageHeading+"']")).getText().isEmpty());
    }

    @When("I click mouseover menu {string}")
    public void mouseOverMenu(String menuOption)
    {
        mouseOver(driver.findElement(By.xpath("//a[text()='"+menuOption+"']")));
    }

    @When("I click on Submenu option {string}")
    public void clickSubMenuOption(String subMenuOption)
    {
        driver.findElement(By.xpath("//a[normalize-space()='"+subMenuOption+"']")).click();
    }
}

