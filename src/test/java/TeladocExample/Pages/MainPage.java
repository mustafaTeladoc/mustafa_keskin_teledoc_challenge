package TeladocExample.Pages;

import TeladocExample.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends BasePage{

    @FindBy(xpath = "(//*[@data-test-id='ChatWidgetWindow'])")
    public WebElement zendeskChat;

    @FindBy(xpath = "(//*[@type='add'])")
    public WebElement addButton;

    @FindBy(xpath = "(//*[@name='FirstName'])")
    public WebElement firstNameInput;

    @FindBy(xpath = "(//*[@name='LastName'])")
    public WebElement lastNameInput;

    @FindBy(xpath = "(//*[@name='UserName'])")
    public WebElement userNameInput;

    @FindBy(xpath = "(//*[@name='Password'])")
    public WebElement passwordInput;

    @FindBy(xpath = "(//*[@name='optionsRadios'])[1]")
    public WebElement companyAAARadio;

    @FindBy(xpath = "(//*[@name='RoleId'])[1]")
    public WebElement roleIdSelector;

    @FindBy(xpath = "(//*[@value='1'])[1]")
    public WebElement customerRole;

    @FindBy(xpath = "(//*[@name='Email'])[1]")
    public WebElement emailInput;

    @FindBy(xpath = "(//*[@name='Mobilephone'])[1]")
    public WebElement cellPhoneInput;

    @FindBy(xpath = "//*[contains(text(),'Save')]")
    public WebElement saveButton;

    @FindBy(xpath = "(//*[@ng-click='delUser()'])[4]")
    public WebElement deleteUserNovak;

    @FindBy(xpath = "//button[contains(text(),'OK')]")
    public WebElement confirmDelete;

    @FindBy(xpath = "//td[contains(text(),'mustafa@teladoc.com')]")
    public WebElement emailConfirmation;

    @FindBy(xpath = "//tbody//tr[1]//td[@class='smart-table-data-cell'][3]")
    public WebElement tomExample;




    /**
     * reusable login method
     * just call this method to login
     * provide username and password as parameters
     *
     * @param username
      @param password
     */




}
