package base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage{
    @FindBy(id="email")
    WebElement loginEmail;

    @FindBy(id = "pass")
    WebElement loginPassword;

    @FindBy(xpath = "/html/body/div[2]/main/div[3]/div/div[3]/div[1]/div[2]/form/fieldset/div[4]/div[1]/button")
    WebElement loginSubmitButton;

    public LoginPage(){
        PageFactory.initElements(driver,this);
    }
    public void signIn(String loginEmail, String loginPassword){
        this.loginEmail.sendKeys(loginEmail);
        this.loginPassword.sendKeys(loginPassword);
        loginSubmitButton.click();
    }
    public void tearDown() {
        driver.quit();
    }


}
