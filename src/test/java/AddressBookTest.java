import base.AddressBookPage;
import base.BasePage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddressBookTest extends BasePage {
    AddressBookPage addressBookPage;

    public AddressBookTest() {
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        addressBookPage = new AddressBookPage();
    }

    @Test
    public void addAddress() throws InterruptedException {
        addressBookPage.initialAddress(prop.getProperty("phoneNumber"),
                prop.getProperty("addressOne"),
                prop.getProperty("addressTwo"),
                prop.getProperty("addressThree"),
                prop.getProperty("city"),
                prop.getProperty("zipCode"));
        addressBookPage.clickStateDropdown();
        addressBookPage.clickCityDropdown();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
