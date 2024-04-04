package base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage extends BasePage {

    @FindBy(linkText = "Change Password")
    WebElement changePassword;

    @FindBy(xpath = "/html/body/div[2]/main/div[2]/div[1]/div[5]/div[2]/div[1]/div[2]/a/span")
    WebElement editAddress;

    public MyAccountPage() {
        PageFactory.initElements(driver, this);
    }

    public PasswordDetailPage changePasswordLink() {
        changePassword.click();
        return new PasswordDetailPage();
    }

    public AddressBookPage clickEditAddress() {
        editAddress.click();
        return new AddressBookPage();
    }

}
