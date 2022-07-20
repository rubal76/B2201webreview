package pageobjectstests;

import browserdriver.BrowserDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobjects.FileUploadPage;
import pageobjects.HomePage;

public class FileUploadPageTest extends BrowserDriver {
    HomePage homePage = null;
    FileUploadPage fileUploadPage = null;

    @BeforeMethod
    public void initializeElements() {
        homePage = PageFactory.initElements(driver, HomePage.class);
        fileUploadPage = PageFactory.initElements(driver, FileUploadPage.class);
    }
    @Test
    public void isFileUploadingTest() {
        homePage.goToFileUploadPage();
        fileUploadPage.uploadFile();
        Assert.assertEquals(fileUploadPage.fileUploadConfirmation(), "File Uploaded!");
    }
}
