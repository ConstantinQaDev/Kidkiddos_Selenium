//import Pages.*;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import utils.BaseTest;
//
//import java.time.Duration;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//public class CartPageTest extends BaseTest {
//
//    protected static CartPage cartPage;
//
//    private static WebDriverWait wait;
//
//
//    @BeforeAll
//    public static void classSetUp() {
//        cartPage = new CartPage();
//        wait = new WebDriverWait(webDriver, 5);
//    }
//
//    @BeforeEach
//    public void beforeTest() {
//        CartPage.navigateToYourCartPage();
//    }
//
//    @Test
//    public void yourCartPageTest() throws InterruptedException {
//
//        WebElement numOfBooksInYourCart = cartPage.numOfBooksYourCartPage;
//        wait.until(ExpectedConditions.visibilityOf(numOfBooksInYourCart));
//
//        numOfBooksInYourCart.clear();
//        numOfBooksInYourCart.sendKeys("6");
//
//        String selectedValueYourCart = numOfBooksInYourCart.getAttribute("value");
//        assertEquals("6", selectedValueYourCart);
//        Thread.sleep(2000);
//
//        WebElement updateButton = cartPage.updateButtonElement;
//        wait.until(ExpectedConditions.visibilityOf(updateButton));
//        updateButton.click();
//    }
//}
