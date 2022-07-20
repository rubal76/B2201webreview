package pageobjectstests;

import browserdriver.BrowserDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobjects.ContextMenuPage;
import pageobjects.HomePage;

public class ContextMenuPageTest extends BrowserDriver {
    HomePage homePage = null;
    ContextMenuPage contextMenuPage = null;

    @BeforeMethod
    public void initializeElements() {
        homePage = PageFactory.initElements(driver, HomePage.class);
        contextMenuPage = PageFactory.initElements(driver, ContextMenuPage.class);
    }

    @Test
    public void contextClickTest() {
        homePage.goToContextMenuPage();
        Assert.assertTrue(contextMenuPage.rightClickHotSpot());
    }
}
