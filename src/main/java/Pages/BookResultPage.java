package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class BookResultPage extends BasePage {

    public BookResultPage() {
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(how = How.XPATH, using = "//a[@aria-controls='SiteNavLabel-books-by-language']")
    public WebElement booksByLanguageMenu;

    @FindBy(how = How.XPATH, using = "//*[text()='English Only']")
    public WebElement englishOnlyElement;

    @FindBy(how = How.XPATH, using = "//*[@id='Collection']//following-sibling::*[contains(text(), 'Vegetables')]")
    public WebElement chooseAnyBookElement;

    @FindBy(how = How.XPATH, using = "//*[@data-index='option1']")
    public WebElement hardCoverElement;

    @FindBy(how = How.XPATH, using = "//*[@type='number']")
    public WebElement numOfBooksElement;

    @FindBy(how = How.XPATH, using = "//button[@id='AddToCart-product-template']")
    public WebElement addToCartButtonElement;

//    @FindBy(how = How.XPATH, using = "//input[@type='number']")
//    public WebElement numOfBooksYourCartPage;
//
//    @FindBy(how = How.XPATH, using = "//input[@name='update']")
//    public WebElement updateButtonElement;

    private static final String YOUR_CART_HEADER = "//h1[contains(text(), 'Your cart')]";

    public boolean isYourCartHeaderVisible() {
        boolean yourCartIsVisible = elementExists(YOUR_CART_HEADER);
        return yourCartIsVisible;
  }
}
