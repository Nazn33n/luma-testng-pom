import base.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MyAccountTest extends BasePage {


    NewAccount newAccount;
    MyAccountPage myAccountPage;
    PasswordDetailPage passwordDetailPage;


    @BeforeMethod
    public void setUp() {
        initialization();
        myAccountPage = new MyAccountPage();
    }

    @Test(priority = 1)
    public void MyAccountTest() {
        myAccountPage.changePasswordLink();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }


}