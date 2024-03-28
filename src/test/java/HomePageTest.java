import base.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends BasePage {


    NewAccount newAccount;
    HomePage homePage;
//    ChangePasswordDetail changePasswordDetail;


    @BeforeMethod
    public void setUp() {
        initialization();
        newAccount = new NewAccount();
        homePage = newAccount.createNewAccount(prop.getProperty("firstName"), prop.getProperty("lastName"), prop.getProperty("email"), prop.getProperty("password"), prop.getProperty("passwordConfirmation"));

    }

//    @Test(priority = 1)
//    public void HomePageTest() {
//        homePage.changePasswordLink();
//    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }


}