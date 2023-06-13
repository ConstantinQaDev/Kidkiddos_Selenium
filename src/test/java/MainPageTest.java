import Pages.ContactUsPage;
import Pages.LogInPage;
import Pages.MainPage;
import org.openqa.selenium.WebElement;
import utils.BaseTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainPageTest extends BaseTest {
    private static MainPage mainPage;
    private static LogInPage logInPage;

    @BeforeAll
    public static void classSetup() {
        mainPage = new MainPage();
    }

    @BeforeEach
    public void beforeTest() {
        mainPage.navigateToMainPage();
    }

    @Test
    public void mainPageLoadTest() {
        //logger.info("Main page load test");
        boolean success = mainPage.isLogoVisible();
        //mainPage.takeScreenshot("MainPageTest");
        assertTrue(success);
    }

    @Test
    public void openContactUsPage() {
        ContactUsPage contactUsPage = mainPage.openContactUsTab();
        boolean isLoaded = contactUsPage.isPageTitleVisible();
        assertTrue(isLoaded);

    }

    @Test
    public void openLogInPageTest()  {

    }

}
