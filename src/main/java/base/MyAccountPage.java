package base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage extends BasePage {

    @FindBy(linkText = "Change Password")
    WebElement changePassword;

    public MyAccountPage() {
        PageFactory.initElements(driver, this);
    }

    public PasswordDetailPage changePasswordLink() {
        changePassword.click();
        return new PasswordDetailPage();
    }
}