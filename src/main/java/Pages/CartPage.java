package Pages;

import consts.Consts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import static Pages.BasePage.webDriver;

public class CartPage extends BasePage {

    public CartPage() {
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(how = How.XPATH, using = "//button[@id='AddToCart-product-template']")
    public WebElement addToCartButtonElement;

    @FindBy(how = How.XPATH, using = "//input[@type='number']")
    public WebElement numOfBooksYourCartPage;

    @FindBy(how = How.XPATH, using = "//input[@class='btn btn--secondary cart__update cart__update--large small--hide']")
    public WebElement updateButtonElement;

    private static final String YOUR_CART_HEADER = "//h1[contains(text(), 'Your cart')]";

    public static void navigateToYourCartPage(){
        webDriver.get(Consts.YOUR_CART_PAGE_URL);
    }

    public boolean isYourCartHeaderVisible() {
        boolean yourCartIsVisible = elementExists(YOUR_CART_HEADER);
        return yourCartIsVisible;
    }
}
