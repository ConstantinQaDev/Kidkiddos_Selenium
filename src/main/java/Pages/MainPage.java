package Pages;

import consts.Consts;

public class MainPage extends BasePage{

    private static final String LOGO_IMG = "//img[@itemprop='logo']";
    private static final String CONTACT_US_OPTION = "//a[text()='Contact us']";
    private static final String LOG_IN_OPTION = "//a[@class='site-header__account']";

    public void navigateToMainPage(){
        webDriver.get(Consts.MAIN_URL);
    }

    public boolean isLogoVisible(){
       boolean isVisible =  elementExists(LOGO_IMG);
       return isVisible;
    }

    public ContactUsPage openContactUsTab(){
        clickElementByXpath(CONTACT_US_OPTION);
        return new ContactUsPage();
    }

}
