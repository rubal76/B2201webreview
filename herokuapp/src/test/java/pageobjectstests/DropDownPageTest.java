package pageobjectstests;

import browserdriver.BrowserDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobjects.DropDownPage;
import pageobjects.HomePage;

public class DropDownPageTest extends BrowserDriver {
    HomePage homePage = null;
    DropDownPage dropDownPage = null;

    @BeforeMethod
    public void InitializeElements() {
        homePage = PageFactory.initElements(driver, HomePage.class);
        dropDownPage = PageFactory.initElements(driver, DropDownPage.class);
    }
    @Test
    public void dropDownPageTest() {
        homePage.goToDropDownPage();
        Assert.assertEquals("Option 2", dropDownPage.selectDropDown());
    }
}
