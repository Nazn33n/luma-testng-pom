import base.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Random;

public class LandingTest extends BasePage {

    LandingPage landingPage;
    NewAccount newAccount;
    MyAccountPage myAccountPage;
    PasswordDetailPage passwordDetailPage;
    LoginPage loginPage;
    AddressBookPage addressBookPage;

    public LandingTest() {
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        landingPage = new LandingPage();
    }

    @Test
    public void landingPageLinkClick() throws InterruptedException {
        String email = generateRandomEmail();

        //call the method
        newAccount = landingPage.clickNewAccountLink();
        myAccountPage = newAccount.createNewAccount(
                prop.getProperty("firstName"),
                prop.getProperty("lastName"),
                email,
                prop.getProperty("password"),
                prop.getProperty("passwordConfirmation"));
        passwordDetailPage = myAccountPage.changePasswordLink();
        Thread.sleep(3000);

        loginPage = passwordDetailPage.changePassword(
                prop.getProperty("currentPassword"),
                prop.getProperty("newPassword"),
                prop.getProperty("newPasswordConfirmation"));

        Thread.sleep(3000);

        loginPage.signIn(
                email,
                prop.getProperty("loginPassword"));

        addressBookPage = myAccountPage.clickMenu();

        Thread.sleep(3000);

        addressBookPage.initialAddress(
                prop.getProperty("phoneNumber"),
                prop.getProperty("addressOne"),
                prop.getProperty("addressTwo"),
                prop.getProperty("addressThree"),
                prop.getProperty("city"),
                prop.getProperty("zipCode"));
        Thread.sleep(3000);
        addressBookPage.clickStateDropdown();
        addressBookPage.clickCityDropdown();
        Thread.sleep(3000);

    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }


    private String generateRandomEmail() {
        Random rand = new Random();
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < 5) {
            sb.append((char) ('a' + rand.nextInt(25)));
            i++;
        }
        sb.append("@yopmail.com");
        return sb.toString();
    }
}


/*
    AnyPage anyPage;
    anyPage = new AnyPage();
    anyPage.anyMethod();
 */