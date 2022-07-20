package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;



public class DropDownPage {
    @FindBy (how = How.ID, using = "dropdown")
    WebElement dropDownButton;

    public String selectDropDown() {
        Select s = new Select(dropDownButton);
        s.selectByVisibleText("Option 2");
        return s.getFirstSelectedOption().getText();
    }
}
