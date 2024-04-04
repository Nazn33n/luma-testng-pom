package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

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

    @FindBy(xpath = "/html/body/div[2]/main/div[2]/div[1]/form/fieldset[2]/div[4]/div/input")
    WebElement zipCode;

    @FindBy(xpath = "/html/body/div[2]/main/div[2]/div[1]/form/div/div[1]/button/span")
    WebElement addressSubmitButton;

    public AddressBookPage() {
        PageFactory.initElements(driver, this);
    }

    public void initialAddress(String phoneNumber, String addressOne, String addressTwo, String addressThree, String city, String zipCode) {

        this.phoneNumber.sendKeys(phoneNumber);
        this.addressOne.sendKeys(addressOne);
        this.addressTwo.sendKeys(addressTwo);
        this.addressThree.sendKeys(addressThree);
        this.city.sendKeys(city);
        this.zipCode.sendKeys(zipCode);
    }

    public AddressBookPage clickStateDropdown() throws InterruptedException {
        WebElement stateDropdown = driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div[1]/form/fieldset[2]/div[3]/div/select"));
        Select select = new Select(stateDropdown);
        select.selectByVisibleText("Alaska");
        Thread.sleep(3000);
        return new AddressBookPage();
    }

    public AddressBookPage clickCityDropdown() {
        WebElement cityDropdown = driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div[1]/form/fieldset[2]/div[5]/div/select"));
        Select select1 = new Select(cityDropdown);
        select1.selectByValue("DZ");
        addressSubmitButton.click();
        return new AddressBookPage();
    }
}
