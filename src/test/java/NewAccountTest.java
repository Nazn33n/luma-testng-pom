import base.BasePage;
import base.HomePage;
import base.LandingPage;
import base.NewAccount;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewAccountTest extends BasePage {

    NewAccount newAccount;

    HomePage homePage;

    public NewAccountTest() {
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        newAccount = new NewAccount();

    }

    @Test(priority = 1)
    public void CreateNewAccountTest() {
        newAccount.createNewAccount(prop.getProperty("firstName"),
                prop.getProperty("lastName"),
                prop.getProperty("email"),
                prop.getProperty("password"),
                prop.getProperty("passwordConfirmation"));
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }


}
