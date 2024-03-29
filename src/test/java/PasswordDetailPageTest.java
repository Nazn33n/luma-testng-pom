import base.BasePage;
import base.PasswordDetailPage;
import base.LoginPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PasswordDetailPageTest extends BasePage {

    PasswordDetailPage passwordDetailPage;
    LoginPage loginPage;

    public PasswordDetailPageTest() {
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        passwordDetailPage = new PasswordDetailPage();
        loginPage = new LoginPage();
    }

    @Test
    public void ChangePasswordDetailTest() {
        passwordDetailPage.changePassword(prop.getProperty("currentPassword"),
                prop.getProperty("newPassword"),
                prop.getProperty("newPasswordConfirmation"));

    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }


}
