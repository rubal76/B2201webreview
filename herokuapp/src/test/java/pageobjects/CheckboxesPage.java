package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class CheckboxesPage {
    WebDriver driver = null;
    @FindBy (how = How.XPATH, using = "//*[@id=\"checkboxes\"]/input[1]")
    WebElement checkBox1;
    @FindBy (how = How.XPATH, using = "//*[@id=\"checkboxes\"]/input[2]")
    WebElement checkBox2;

    public boolean clickCheckbox1() {
        checkBox1.click();
        boolean actualValue = checkBox1.isSelected();
        return actualValue;
    }
    public boolean clickCheckbox2() {
        checkBox2.click();
        boolean actualValue = checkBox2.isSelected();
        return actualValue;
    }
}
