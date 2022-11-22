package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class TopMenuTest extends Utility {
    String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToComputerPageSuccessfully() {
        //Click on the computer tab
        clickOnElements(By.partialLinkText("Computers"));

        //Verify the text Computers
        //Expected message
        String expectedMessage = "Computers";

        //Find the text and get the text
        String actualMessage = getTextFromElement(By.xpath("//h1[contains(text(), 'Computers')]"));

        //Compare actual and expected result
        Assert.assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully() {
        //Click on the electronics tab
        clickOnElements(By.linkText("Electronics"));

        //Verify the text Electronics
        //Expected message
        String expectedMessage = "Electronics";

        //Find the text and get the text
        String actualMessage = getTextFromElement(By.xpath("//h1[contains(text(), 'Electronics')]"));

        //Compare expected and actual message
        Assert.assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void userShouldNavigateToApparelPageSuccessfully() {
        //Click on the apparel tab
        clickOnElements(By.linkText("Apparel"));

        //Verify the text Electronics
        //Expected message
        String expectedMessage = "Apparel";

        //Find the text and get the text
        String actualMessage = getTextFromElement(By.xpath("//h1[contains(text(), 'Apparel')]"));

        //Compare expected and actual message
        Assert.assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully() {
        //Click on the apparel tab
        clickOnElements(By.linkText("Digital downloads"));

        //Verify the text Electronics
        //Expected message
        String expectedMessage = "Digital downloads";

        //Find the text and get the text
        String actualMessage = getTextFromElement(By.xpath("//h1[contains(text(), 'Digital downloads')]"));

        //Compare expected and actual message
        Assert.assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void userShouldNavigateToBooksPageSuccessfully() {
        //Click on the apparel tab
        clickOnElements(By.linkText("Books"));

        //Verify the text Electronics
        //Expected message
        String expectedMessage = "Books";

        //Find the text and get the text
        String actualMessage = getTextFromElement(By.xpath("//h1[contains(text(), 'Books')]"));

        //Compare expected and actual message
        Assert.assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void userShouldNavigateToJewelryPageSuccessfully() {
        //Click on the apparel tab
        clickOnElements(By.linkText("Jewelry"));

        //Verify the text Electronics
        //Expected message
        String expectedMessage = "Jewelry";

        //Find the text and get the text
        String actualMessage = getTextFromElement(By.xpath("//h1[contains(text(), 'Jewelry')]"));

        //Compare expected and actual message
        Assert.assertEquals(expectedMessage, actualMessage);

    }

    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully() {
        //Click on the apparel tab
        clickOnElements(By.linkText("Gift Cards"));

        //Verify the text Electronics
        //Expected message
        String expectedMessage = "Gift Cards";

        //Find the text and get the text
        String actualMessage = getTextFromElement(By.xpath("//h1[contains(text(), 'Gift Cards')]"));

        //Compare expected and actual message
        Assert.assertEquals(expectedMessage, actualMessage);
    }

    @After
    public void testDown() {
        closeBrowser();
    }
}