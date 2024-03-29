package base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PasswordDetailPage extends BasePage {
    @FindBy(xpath = "//*[@id=\"current-password\"]")
    WebElement currentPassword;
    @FindBy(xpath = "//*[@id=\"password\"]")
    WebElement newPassword;

    @FindBy(xpath = "//*[@id=\"password-confirmation\"]")
    WebElement newPasswordConfirmation;

    @FindBy(xpath = "/html/body/div[2]/main/div[2]/div[1]/form/div/div[1]/button/span")
    WebElement saveButton;

    public PasswordDetailPage() {
        PageFactory.initElements(driver, this);
    }

    public LoginPage changePassword(String currentPassword, String newPassword, String newPasswordConfirmation) {
        this.currentPassword.sendKeys(currentPassword);
        this.newPassword.sendKeys(newPassword);
        this.newPasswordConfirmation.sendKeys(newPasswordConfirmation);
        saveButton.click();
        return new LoginPage();

    }
}
