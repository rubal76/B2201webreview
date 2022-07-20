package pageobjects;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static browserdriver.BrowserDriver.driver;

public class HorizontalSliderPage {
    @FindBy (how = How.XPATH, using = "//*[@id=\"content\"]/div/div/input")
    WebElement slider;
    @FindBy (how = How.ID, using = "range")
    WebElement sliderRange;

    public String moveSliderHorizontally() {
        Actions a = new Actions(driver);
        a.dragAndDropBy(slider, 50,0).build().perform();
        String sliderRangeActual = sliderRange.getText();
        return sliderRangeActual;
    }
}
