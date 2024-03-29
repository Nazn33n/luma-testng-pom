import base.BasePage;
import base.LoginPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends BasePage {
    LoginPage loginpage;
    public LoginTest(){
        super();
    }
   @BeforeMethod
    public void setUp(){
        initialization();
        loginpage = new LoginPage();
    }
    @Test
    public void LoginTest(){
        loginpage.signIn(prop.getProperty("loginEmail"), prop.getProperty("loginPassword") );
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

}
