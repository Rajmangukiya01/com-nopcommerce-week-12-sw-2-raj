package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class RegisterTest extends Utility {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void UserShouldNavigateToRegisterPageSuccessfully() {
        //Click on the register link
        clickOnElements(By.linkText("Register"));

        //Verify the Register text
        //Expected message
        String expectedMessage = "Register";

        //Find text and get text
        String actualMessage = getTextFromElement(By.xpath("//h1"));

        //Compare expected message and actual message
        Assert.assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void userShouldRegisterAccountSuccessfully() {
        //Click on the register link
        clickOnElements(By.linkText("Register"));

        //Select gender radio button
        clickOnElements(By.id("gender-male"));

        //Enter first name
        sendTextToElements(By.id("FirstName"), "abc");

        //Enter last name
        sendTextToElements(By.name("LastName"), "ABC");

        //Select Day, Month and year
        sendTextToElements(By.name("DateOfBirthDay"), "1");
        sendTextToElements(By.name("DateOfBirthMonth"),"May");
        sendTextToElements(By.name("DateOfBirthYear"),"1999");

        //Enter email id
        sendTextToElements(By.id("Email"), "test105@gmail.com");

        //Enter password
        sendTextToElements(By.name("Password"), "test100");

        //Enter confirm password
        sendTextToElements(By.name("ConfirmPassword"), "test100");

        //Click on the register button
        clickOnElements(By.id("register-button"));

        //Verify the text 'Your registration completed'
        //Expected result
        String expectedResult = "Your registration completed";

        //Find the text and get the text
        String actualResult = getTextFromElement(By.xpath("//div[starts-with(@class, 'result')]"));

        //Compare expected and actual result
        Assert.assertEquals(expectedResult, actualResult);
    }

    @After
    public void testDown() {
        closeBrowser();
    }
}
