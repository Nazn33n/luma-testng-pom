package base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewAccount extends BasePage {
    @FindBy(id = "firstname")
    WebElement firstName;

    @FindBy(id = "lastname")
    WebElement lastName;

    @FindBy(name = "email")
    WebElement email;

    @FindBy(id = "password")
    WebElement password;

    @FindBy(id = "password-confirmation")
    WebElement passwordConfirmation;

    @FindBy(xpath = "//button[@title='Create an Account']//span[contains(text(),'Create an Account')]")
    WebElement submitButton;

    public NewAccount() {
        PageFactory.initElements(driver, this);
    }

    public void createNewAccount(String firstName, String lastName, String email, String password, String passwordConfirmation) {
        this.firstName.sendKeys(firstName);
        this.lastName.sendKeys(lastName);
        this.email.sendKeys(email);
        this.password.sendKeys(password);
        this.passwordConfirmation.sendKeys(passwordConfirmation);
        submitButton.click();
    }
}
