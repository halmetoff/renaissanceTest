package ru.rencredit.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CardsPage {

    public WebDriver driver;

    public CardsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "/html/body/div[4]/div/div[2]/div[1]/div/div[2]/a")
    private WebElement regButton;

    public void clickRegButton() {
        regButton.click();
    }

}
