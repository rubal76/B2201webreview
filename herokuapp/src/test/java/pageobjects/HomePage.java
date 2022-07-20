package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {
    @FindBy (how = How.LINK_TEXT, using = "Checkboxes")
    WebElement checkBoxes;
    @FindBy (how = How.LINK_TEXT, using = "Context Menu")
    WebElement contextMenu;
    @FindBy (how = How.LINK_TEXT, using = "Drag and Drop")
    WebElement dragAndDrop;
    @FindBy (how = How.LINK_TEXT, using = "Dropdown")
    WebElement dropDown;
    @FindBy (how = How.LINK_TEXT, using = "File Download")
    WebElement downloadFile;
    @FindBy (how = How.LINK_TEXT, using = "File Upload")
    WebElement uploadFile;
    @FindBy (how = How.LINK_TEXT, using = "Forgot Password")
    WebElement retrievePassword;
    @FindBy (how = How.LINK_TEXT, using = "Horizontal Slider")
    WebElement slideHorizontally;
    @FindBy (how = How.LINK_TEXT, using = "Infinite Scroll")
    WebElement scrollToInfinity;
    @FindBy (how = How.LINK_TEXT, using = "Hovers")
    WebElement hoverOverImage;
    @FindBy (how = How.LINK_TEXT, using = "Inputs")
    WebElement inputIncrDecr;
    @FindBy (how = How.LINK_TEXT, using = "Key Presses")
    WebElement lastKeyPressed;
    @FindBy (how = How.LINK_TEXT, using = "Multiple Windows")
    WebElement handlingNewWindow;
    @FindBy (how = How.LINK_TEXT, using = "Form Authentication")
    WebElement formAuthentication;

    public void goToCheckBoxPage() {
        checkBoxes.click();
    }
    public void goToContextMenuPage() {
        contextMenu.click();
    }
    public void goToDragAndDropPage() {
        dragAndDrop.click();
    }
    public void goToDropDownPage() {
        dropDown.click();
    }
    public void goToDownloadFilePage() {
        downloadFile.click();
    }
    public void goToFileUploadPage() {
        uploadFile.click();
    }
    public void goToForgotPasswordPage() {
        retrievePassword.click();
    }
    public void goToHorizontalSliderPage() {
        slideHorizontally.click();
    }
    public void goToInfiniteScrollPage() {
        scrollToInfinity.click();
    }
    public void goToHoversPage() {
        hoverOverImage.click();
    }
    public void goToInputsPage() {
        inputIncrDecr.click();
    }
    public void goToKeyPressesPage() {
        lastKeyPressed.click();
    }
    public void goToMultipleWindowsPage() {
        handlingNewWindow.click();
    }
    public void goToFormAuthenticationPage() {
        formAuthentication.click();
    }
}
