package utils;

import Pages.BasePage;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BaseTest {

    protected static WebDriver webDriver;
    protected static BasePage page;

    @BeforeAll
    public static void setupMain() {
        page = new BasePage();
        webDriver = SharedDriver.getWebDriver(SharedDriver.Broswer.CHROME);
        page.setWebDriver(webDriver);
    }

    @AfterAll
    public static void tearDownMain() {
        SharedDriver.closeDriver();
        webDriver = null;
    }

}
