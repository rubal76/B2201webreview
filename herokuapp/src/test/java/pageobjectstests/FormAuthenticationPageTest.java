package pageobjectstests;

import browserdriver.BrowserDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobjects.FormAuthenticationPage;
import pageobjects.HomePage;

public class FormAuthenticationPageTest extends BrowserDriver {
    HomePage homePage = null;
    FormAuthenticationPage formAuthenticationPage = null;

    @BeforeMethod
    public void initializeElements() {
        homePage = PageFactory.initElements(driver, HomePage.class);
        formAuthenticationPage = PageFactory.initElements(driver, FormAuthenticationPage.class);
    }
    @Test
    public void formAuthenticationLoginTest() {
        homePage.goToFormAuthenticationPage();
        formAuthenticationPage.enterUserName();
        formAuthenticationPage.enterPassword();
        Assert.assertEquals(formAuthenticationPage.attemptToLogin(), "You logged into a secure area!\n" +
                "×");
    }
}
