package utilities;

import browserfactory.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Utility extends BaseTest {
    //This method will click on method

    public void clickOnElements(By by) {
        WebElement loginLink = driver.findElement(by);
        loginLink.click();
    }

    public void sendTextToElements(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }

    public String getTextFromElement(By by) {
        WebElement actualTextMessageElement = driver.findElement(by);
        return actualTextMessageElement.getText();
    }
}
