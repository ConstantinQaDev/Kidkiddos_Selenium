package Pages;

import consts.Consts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class LogInPage extends BasePage{

    public LogInPage(){
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(how = How.XPATH, using = "//a[@class='site-header__account']")
    public WebElement logInButton;

    @FindBy(how = How.XPATH, using = "//h1[text()='Login']")
    public WebElement logInLogo;

    @FindBy(how = How.XPATH, using = "//input[@name='customer[email]']")
    public WebElement emailField;

    @FindBy(how = How.XPATH, using = "//input[@name='customer[password]']")
    public WebElement passwordField;

    @FindBy(how = How.XPATH, using = "//input[@value='Sign In']")
    public WebElement signInButtonElement;

    @FindBy(how = How.XPATH, using = "//*[text()='Incorrect email or password.']")
    public WebElement incorrectEmailOrPasswordField;

    public static void navigateToLogInPage(){
        webDriver.get(Consts.LOG_IN_URL);
    }

    public boolean isLogInLogoVisible(){
        boolean isLogInVisible = elementExists(logInLogo.getText());
        assertNotNull(isLogInVisible, "Login element is not visible");
        return logInLogo.isDisplayed();
    }
}
