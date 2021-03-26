package ru.rencredit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.rencredit.page.CardRegistrationPage;
import ru.rencredit.page.CardsPage;
import ru.rencredit.page.ContributionsPage;
import ru.rencredit.page.MainPage;

import java.util.concurrent.TimeUnit;

import static ru.rencredit.ConfProperties.CHROMEDRIVER;
import static ru.rencredit.ConfProperties.PAGE_URL;

public class TestTask {

    public static MainPage mainPage;
    public static ContributionsPage contributionsPage;
    public static CardsPage cardsPage;
    public static CardRegistrationPage cardRegistrationPage;
    public static WebDriver driver;

    @BeforeClass
    public static void setup() {

        System.setProperty("webdriver.chrome.driver", CHROMEDRIVER);

        driver = new ChromeDriver();
        mainPage = new MainPage(driver);
        contributionsPage = new ContributionsPage(driver);
        cardsPage = new CardsPage(driver);
        cardRegistrationPage = new CardRegistrationPage(driver);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test
    public void Test1() {
        //Открыть сайт rencredit.ru
        driver.get(PAGE_URL);
        //Перейти на страницу "Вклад"
        mainPage.clickOnContributions();
        //Выбрать чекбокс "В отделении банка"
        contributionsPage.clickOnInBankCheckBox();
        //Ввести сумму вклада
        contributionsPage.inputContributionAmount("2000000");
        //Передвинуть ползунок "На срок"
        contributionsPage.moveOnPeriodSpan(-300);

    }

    @Test
    public void Test2() {
        //Открыть сайт rencredit.ru
        driver.get(PAGE_URL);
        //Перейти на страницу "Карта"
        mainPage.clickOnCards();

        cardsPage.clickRegButton();
        //Ввести в поля "Фамилия", "Имя", "Мобильный телефон", "e-mail" значения
        cardRegistrationPage.InputSoname("Халметов");
        cardRegistrationPage.InputName("Владислав");
        cardRegistrationPage.InputMobileNumber("4951234567");
        cardRegistrationPage.InputEmail("name@domain.ru");
        //Выбрать чекбокс "Нет отчества"
        cardRegistrationPage.clickNoMiddleNameCheckBox();
        //Выбрать значение из выпадающего списка "Где вы желаете получить карту"
        cardRegistrationPage.selectRegion();

    }

    @AfterClass
    public static void termination() {
        driver.quit();
    }

}
