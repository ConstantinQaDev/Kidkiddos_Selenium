import Pages.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.BaseTest;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

public class BooksByLanguageTest extends BaseTest {

    protected static BookResultPage bookResultPage;
    protected static BasePage basePage;
    private static MainPage mainPage;

    protected static CartPage cartPage;

    private static WebDriverWait wait;

    @BeforeAll
    public static void classSetUp(){
        mainPage = new MainPage();
        bookResultPage = new BookResultPage();
        basePage = new BasePage();
        cartPage = new CartPage();
        wait = new WebDriverWait(webDriver, 5);
    }

    @BeforeEach
    public void beforeTest() {
        mainPage.navigateToMainPage();

    }

    @Test
    public void booksByLanguageMenuTest() throws InterruptedException {

        BookResultPage bookResultPage = new BookResultPage();

        WebElement booksByLanguageDropMenu = bookResultPage.booksByLanguageMenu;
        wait.until(ExpectedConditions.visibilityOf(booksByLanguageDropMenu));
        booksByLanguageDropMenu.click();
        assertNotNull(booksByLanguageDropMenu);
        Thread.sleep(2000);

        WebElement englishOnly = bookResultPage.englishOnlyElement;
        wait.until(ExpectedConditions.visibilityOf(englishOnly));
        englishOnly.click();
        Thread.sleep(1000);

        WebElement chooseBook = bookResultPage.chooseAnyBookElement;
        wait.until(ExpectedConditions.visibilityOf(chooseBook));
        chooseBook.click();
        Thread.sleep(2000);

        WebElement selectHardCover = bookResultPage.hardCoverElement;
        wait.until(ExpectedConditions.visibilityOf(selectHardCover));

        Select dropdown = new Select(selectHardCover);
        dropdown.selectByVisibleText("Hardcover");

        WebElement selectedOption = dropdown.getFirstSelectedOption();
        assertEquals("Hardcover", selectedOption.getText());
        Thread.sleep(2000);

        WebElement numOfBooks = bookResultPage.numOfBooksElement;
        wait.until(ExpectedConditions.visibilityOf(numOfBooks));

        numOfBooks.clear();
        numOfBooks.sendKeys("5");

        String selectedValue = numOfBooks.getAttribute("value");
        assertEquals("5", selectedValue);
        Thread.sleep(2000);

        WebElement addToCart = bookResultPage.addToCartButtonElement;
        wait.until(ExpectedConditions.visibilityOf(addToCart));
        addToCart.click();
        boolean success = bookResultPage.isYourCartHeaderVisible();
        assertTrue(success);

        WebElement numOfBooksInYourCart = cartPage.numOfBooksYourCartPage;
        wait.until(ExpectedConditions.visibilityOf(numOfBooksInYourCart));

        numOfBooksInYourCart.clear();
        numOfBooksInYourCart.sendKeys("6");

        String selectedValueYourCart = numOfBooksInYourCart.getAttribute("value");
        assertEquals("6", selectedValueYourCart);
        Thread.sleep(2000);

        WebElement updateButton = cartPage.updateButtonElement;
        wait.until(ExpectedConditions.visibilityOf(updateButton));
        updateButton.click();
        Thread.sleep(2000);

        String selectedValueInYourCart = numOfBooksInYourCart.getAttribute("value");
        assertEquals("6", selectedValueInYourCart);
        Thread.sleep(2000);
    }
}
