
import Pages.LogInPage;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;
import utils.BaseTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class LogInPageTest extends BaseTest {
    public static LogInPage logInPage;

    @BeforeAll
    public static void classSetUp(){
        logInPage = new LogInPage();
    }

    @BeforeEach
    public void beforeTest(){
        LogInPage.navigateToLogInPage();
    }

    @Test
    public void emptyUserNameAndPasswordTest() {

        WebElement emailBox = logInPage.emailField;
        emailBox.sendKeys("");

        WebElement passwordBox = logInPage.passwordField;
        passwordBox.sendKeys("");

        WebElement signInButton = logInPage.signInButtonElement;
        signInButton.click();

        WebElement incorrectEmailOrPasswordBox = logInPage.incorrectEmailOrPasswordField;
        assertNotNull(incorrectEmailOrPasswordBox, "Incorrect email or password.");
    }

    @Test
    public void wrongUserNameAndPasswordTest() {

        WebElement emailBox = logInPage.emailField;
        emailBox.sendKeys("example@example.com");

        WebElement passwordBox = logInPage.passwordField;
        passwordBox.sendKeys("123456");

        WebElement signInButton = logInPage.signInButtonElement;
        signInButton.click();

        WebElement incorrectEmailOrPasswordBox = logInPage.incorrectEmailOrPasswordField;
        assertNotNull(incorrectEmailOrPasswordBox, "Incorrect email or password.");
    }


}
