package base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddressBookPage extends BasePage{

    @FindBy(xpath = "//*[@id=\"telephone\"]")
    WebElement phoneNumber;

    @FindBy(xpath = "//*[@id=\"street_1\"]")
    WebElement addressOne;

    @FindBy(xpath = "//*[@id=\"street_2\"]")
    WebElement addressTwo;

    @FindBy(xpath = "//*[@id=\"street_3\"]")
    WebElement addressThree;

    @FindBy(xpath = "//*[@id=\"city\"] ")
    WebElement city;

    public AddressBookPage()
    {
        PageFactory.initElements(driver,this);
    }
    public void initialAddress(){
        phoneNumber.sendKeys(prop.getProperty("phoneNumber"));
        addressOne.sendKeys(prop.getProperty("addressOne"));
        addressTwo.sendKeys(prop.getProperty("addressTwo"));
        addressThree.sendKeys(prop.getProperty("addressThree"));
        city.sendKeys(prop.getProperty("city"));

    }

}
