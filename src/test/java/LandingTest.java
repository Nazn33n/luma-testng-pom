import base.BasePage;
import base.HomePage;
import base.LandingPage;
import base.NewAccount;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LandingTest extends BasePage {
    LandingPage landingPage;
    NewAccount newAccount;

    HomePage homePage;

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
        //call the method
        newAccount = landingPage.clickNewAccountLink();
        homePage = newAccount.createNewAccount(prop.getProperty("firstName"),
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
