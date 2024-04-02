package base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddressBookPage extends BasePage {

    @FindBy(xpath = "//input[@id='telephone']")
    WebElement phoneNumber;

    @FindBy(xpath = "//input[@id='street_1']")
    WebElement addressOne;

    @FindBy(xpath = "//input[@id='street_2']")
    WebElement addressTwo;

    @FindBy(xpath = "//input[@id='street_3']")
    WebElement addressThree;

    @FindBy(xpath = "//input[@id='city']")
    WebElement city;

    public AddressBookPage() {
        PageFactory.initElements(driver, this);
    }

    public void initialAddress(String phoneNumber, String addressOne, String addressTwo, String addressThree, String city) {

        this.phoneNumber.sendKeys(phoneNumber);
        this.addressOne.sendKeys(addressOne);
        this.addressTwo.sendKeys(addressTwo);
        this.addressThree.sendKeys(addressThree);
        this.city.sendKeys(city);

    }

}
