package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class MenuPage {

    public WebDriver driver;

    public MenuPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public void clickMenuOption(String menuOption)
    {
        driver.findElement(By.xpath("//a[text()='"+menuOption+"']")).click();
    }


}
