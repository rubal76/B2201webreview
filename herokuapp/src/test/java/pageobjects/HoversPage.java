package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static browserdriver.BrowserDriver.driver;

public class HoversPage {
    @FindBy (how = How.XPATH, using = "//*[@id=\"content\"]/div/div[1]/img")
    WebElement user1;
    @FindBy (how = How.LINK_TEXT, using = "View profile")
    WebElement profileLink;
    @FindBy (how = How.XPATH, using = "/html/body/h1")
    WebElement header;

    public String hoverAndClick() {
        Actions a = new Actions(driver);
        a.moveToElement(user1).perform();
        profileLink.click();
        String actualHeader = header.getText();
        return actualHeader;
    }
}
