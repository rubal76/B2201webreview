package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static browserdriver.BrowserDriver.driver;

public class DragAndDropPage {
    @FindBy (how = How.ID, using = "column-a")
    WebElement sourceLocation;
    @FindBy (how = How.ID, using = "column-b")
    WebElement targetLocation;
    Actions builder = new Actions(driver);



}
