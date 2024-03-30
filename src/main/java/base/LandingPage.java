package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage extends BasePage {

    @FindBy(linkText = "Create an Account")
    WebElement clickNewAccountCreateLink;

    public LandingPage() {
        PageFactory.initElements(driver, this);
    }

    public NewAccount clickNewAccountLink() throws InterruptedException {
        clickNewAccountCreateLink.click();
        return new NewAccount();
    }
}
