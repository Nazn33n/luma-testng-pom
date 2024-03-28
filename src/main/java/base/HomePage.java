package base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

    @FindBy(linkText = "Change Password")
    WebElement changePassword;

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

//    public ChangePasswordDetail changePasswordLink() {
//        changePassword.click();
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        return new ChangePasswordDetail();
//    }
}
