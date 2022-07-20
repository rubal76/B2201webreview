package pageobjectstests;

import browserdriver.BrowserDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobjects.CheckboxesPage;
import pageobjects.HomePage;

public class CheckboxesPageTest extends BrowserDriver {
    HomePage homePage = null;
    CheckboxesPage checkboxesPage = null;

    @BeforeMethod
    public void initializeElements() {
        homePage = PageFactory.initElements(driver, HomePage.class);
        checkboxesPage = PageFactory.initElements(driver, CheckboxesPage.class);
    }

    @Test
    public void clickUnclickCheckboxesTest() {
        homePage.goToCheckBoxPage();
        Assert.assertEquals(checkboxesPage.clickCheckbox1(), true);
        Assert.assertEquals(checkboxesPage.clickCheckbox2(), false);
    }
}
