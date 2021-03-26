package ru.rencredit.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContributionsPage {

    public WebDriver driver;

    public ContributionsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//*[@id=\"section_1\"]/div/div/form/div[1]/div[2]/div/div[1]/label/span[1]")
    private WebElement inBankCheckBox;

    @FindBy(xpath = "//*[@id=\"section_1\"]/div/div/form/div[1]/div[3]/div[1]/div/label/input")
    private WebElement contributionAmountInput;

    @FindBy(xpath = "//*[@id=\"section_1\"]/div/div/form/div[1]/div[4]/div[3]/div[1]/span")
    private WebElement onPeriodSpan;

    public void clickOnInBankCheckBox() {
        inBankCheckBox.click();
    }

    public void inputContributionAmount(String amount) {
        contributionAmountInput.sendKeys(amount);
    }

    public void moveOnPeriodSpan(int shift) {
        Actions moveSpan = new Actions(driver);
        Action action = moveSpan.dragAndDropBy(onPeriodSpan, shift, 0).build();
        action.perform();
    }

}
