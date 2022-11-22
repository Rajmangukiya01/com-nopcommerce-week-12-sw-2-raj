package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class LoginTest extends Utility {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateLoginPageSuccessfully() {
        //Find the login link and click on the login
        clickOnElements(By.linkText("Log in"));

        //Verify the Text
        String expectedMessage = "Welcome, Please Sign In!";

        //Find the welcome text elements and get text
        String actualMessage = getTextFromElement(By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]"));

        //Compare actual and expected result
        Assert.assertEquals("Not navigate to login page", expectedMessage, actualMessage);
    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        //click on login link
        clickOnElements(By.linkText("Log in"));

        //Enter valid username and password
        sendTextToElements(By.id("Email"), "rajmangukiya111@gmail.com");
        sendTextToElements(By.name("Password"), "Raj@100");

        //click on login button
        clickOnElements(By.xpath("//button[contains(text(),'Log in')]"));

        //Verify the logout text is display
        //Expected text
        String expectedText = "Log out";

        //Find the text and get the text
        String actualText = getTextFromElement(By.linkText("Log out"));

        //Compare the actual text and expected text
        Assert.assertEquals(expectedText, actualText);
    }

    @Test
    public void verifyTheErrorMessage() {
        //click on login link
        clickOnElements(By.linkText("Log in"));

        //Enter valid username and password
        sendTextToElements(By.id("Email"), "abc123@gmail.com");
        sendTextToElements(By.name("Password"), "abc123");

        //click on login button
        clickOnElements(By.xpath("//button[contains(text(),'Log in')]"));

        //verify the error message
        String expectedMessage = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";

        String actualMessage = getTextFromElement(By.xpath("//div[contains(text(), 'Login was unsuccessful.')]"));

        Assert.assertEquals(expectedMessage, actualMessage);
    }

    @After
    public void testDown() {
        //closeBrowser();
    }
}
