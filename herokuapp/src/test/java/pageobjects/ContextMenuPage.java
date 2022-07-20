package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import static browserdriver.BrowserDriver.driver;

public class ContextMenuPage {
    @FindBy (how = How.ID, using = "hot-spot")
    WebElement contextClickHotSpot;

    public boolean rightClickHotSpot() {
        Actions a = new Actions(driver);
        a.contextClick(contextClickHotSpot).perform();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.alertIsPresent());
        try{
            driver.switchTo().alert();
            return true;
        }catch (Exception e) {
            return false;
        }
    }
}
