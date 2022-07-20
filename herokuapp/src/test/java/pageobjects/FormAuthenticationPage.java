package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FormAuthenticationPage {
    @FindBy (how = How.ID, using = "username")
    WebElement userNameBox;
    @FindBy (how = How.ID, using = "password")
    WebElement passwordBox;
    @FindBy (how = How.XPATH, using = "//*[@id=\"login\"]/button/i")
    WebElement loginButton;
    @FindBy (how = How.ID, using = "flash")
    WebElement secureLoginConfirmation;

    public void enterUserName() {
        userNameBox.sendKeys("tomsmith");
    }
    public void enterPassword() {
        passwordBox.sendKeys("SuperSecretPassword!");
    }
    public String attemptToLogin() {
        loginButton.click();
        String actualText = secureLoginConfirmation.getText();
        return actualText;
    }
}
