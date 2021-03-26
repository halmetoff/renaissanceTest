package ru.rencredit.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CardRegistrationPage {

    public WebDriver driver;

    public CardRegistrationPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//*[@id=\"t1\"]")
    private WebElement sonameInput;

    @FindBy(xpath = "//*[@id=\"t2\"]")
    private WebElement nameInput;

    @FindBy(xpath = "//*[@id=\"t4\"]")
    private WebElement mobileNumberInput;

    @FindBy(xpath = "//*[@id=\"t38\"]")
    private WebElement emailInput;

    @FindBy(xpath = "//*[@id=\"section_1\"]/div[2]/div/form/div[1]/div[4]/div/label/div")
    private WebElement noMiddleNameCheckBox;

    @FindBy(xpath = "//*[@id=\"s2-styler\"]/div[1]")
    private WebElement region;

    @FindBy(xpath = "//*[@id=\"s2-styler\"]/div[2]/ul/li[36]")
    private WebElement currentRegion;

    public void InputSoname(String soname) {
        sonameInput.sendKeys(soname);
    }

    public void InputName(String name) {
        nameInput.sendKeys(name);
    }

    public void InputMobileNumber(String number) {
        mobileNumberInput.sendKeys(number);
    }

    public void InputEmail(String email) {
        emailInput.sendKeys(email);
    }

    public void clickNoMiddleNameCheckBox() {
        noMiddleNameCheckBox.click();
    }

    public void selectRegion() {
        region.click();
        currentRegion.click();
    }

}
