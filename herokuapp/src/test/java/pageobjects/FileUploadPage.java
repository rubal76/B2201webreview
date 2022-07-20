package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class FileUploadPage {
    @FindBy (how = How.ID, using = "file-upload")
    WebElement chooseFileButton;
    @FindBy (how = How.ID, using = "file-submit")
    WebElement uploadButton;
    @FindBy (how = How.XPATH, using = "//*[@id=\"content\"]/div/h3")//*[@id="content"]/div[1]/h3
    WebElement uploadConfirmation;

    public void uploadFile() {
        chooseFileButton.sendKeys("C:\\Users\\rubal\\IdeaProjects\\B2201WebAutomationFrameworkReview-main\\herokuapp\\data\\1440465604800.jpg");
        uploadButton.click();
    }
    public String fileUploadConfirmation() {
        String actualValue = uploadConfirmation.getText();
        return actualValue;
    }
}
