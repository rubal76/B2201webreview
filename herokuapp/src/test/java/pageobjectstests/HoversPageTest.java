package pageobjectstests;

import browserdriver.BrowserDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobjects.HomePage;
import pageobjects.HoversPage;

public class HoversPageTest extends BrowserDriver {
    HomePage homePage = null;
    HoversPage hoversPage = null;

    @BeforeMethod
    public void initializeElements() {
        homePage = PageFactory.initElements(driver, HomePage.class);
        hoversPage = PageFactory.initElements(driver, HoversPage.class);
    }
    @Test
    public void hoverOverProfileAndClickTest() {
        homePage.goToHoversPage();
//        hoversPage.hoverAndClick();                               //Is this necessary??
        Assert.assertEquals(hoversPage.hoverAndClick(), "Not Found");
    }
}
