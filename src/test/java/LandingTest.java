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
            sb.append((char)('a' + rand.nextInt(25)));
            i++;
        }
        sb.append("@yopmail.com");
        return sb.toString();
    }
}
