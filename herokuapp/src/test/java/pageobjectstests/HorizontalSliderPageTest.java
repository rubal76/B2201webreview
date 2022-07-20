package pageobjectstests;

import browserdriver.BrowserDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobjects.HomePage;
import pageobjects.HorizontalSliderPage;

public class HorizontalSliderPageTest extends BrowserDriver {
    HomePage homePage = null;
    HorizontalSliderPage horizontalSliderPage = null;

    @BeforeMethod
    public void initializeElements() {
        homePage = PageFactory.initElements(driver, HomePage.class);
        horizontalSliderPage = PageFactory.initElements(driver, HorizontalSliderPage.class);
    }
    @Test
    public void moveSliderHorizontallyTest() {
        homePage.goToHorizontalSliderPage();
        Assert.assertEquals(horizontalSliderPage.moveSliderHorizontally(), "4.5");
    }
}
