package ru.rencredit.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {

    public WebDriver driver;
    public MainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "/html/body/div[4]/div[1]/div[2]/div/div[2]/div[3]/div[1]")
    private WebElement contributions;

    @FindBy(xpath = "/html/body/div[4]/div[1]/div[2]/div/div[2]/div[1]/div[1]")
    private WebElement cards;

    public void clickOnContributions() {
        contributions.click();
    }

    public void clickOnCards() {
        cards.click();
    }


}
