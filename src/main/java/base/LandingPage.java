package base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage extends BasePage {
    @FindBy(linkText = "Create an Account")
    WebElement clickNewAccountCreateLink;

    public LandingPage() {
        PageFactory.initElements(driver, this);
    }

    public NewAccount clickNewAccountLink() throws InterruptedException {
        Thread.sleep(3000);
        clickNewAccountCreateLink.click();
        Thread.sleep(3000);
        return new NewAccount();
    }
}
