package TeladocExample.StepDefinitions;

import TeladocExample.Pages.MainPage;
import TeladocExample.Utilities.BrowserUtils;
import TeladocExample.Utilities.ConfigurationReader;
import TeladocExample.Utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.List;

public class AddAndDeleteUserStepDefs {


    MainPage mainPage=new MainPage();
    @When("user should be able to go main page")
    public void user_should_be_able_to_go_main_page() {
        BrowserUtils.wait(4);
        Assert.assertNotNull(mainPage.zendeskChat);

    }

    @Then("user should be able to add new user with {string}{string}{string}{string}{string}{string}")
    public void userShouldBeAbleToAddNewUserWith(String firstName, String lastName, String username, String password, String email, String cellPhone) {

        mainPage.addButton.click();
        BrowserUtils.wait(2);
        mainPage.firstNameInput.sendKeys(firstName);
        mainPage.lastNameInput.sendKeys(lastName);
        mainPage.userNameInput.sendKeys(username);
        mainPage.passwordInput.sendKeys(password);
        mainPage.companyAAARadio.click();
        mainPage.roleIdSelector.click();
        mainPage.customerRole.click();
        mainPage.emailInput.sendKeys(email);
        mainPage.cellPhoneInput.sendKeys(cellPhone);
        mainPage.saveButton.click();
        BrowserUtils.wait(5);
        Assert.assertTrue("mustafa@teladoc.com".equals(mainPage.emailConfirmation.getText()));
    }

    @Then("user should be able to delete existing user")
    public void user_should_be_able_to_delete_existing_user() {
        mainPage.deleteUserNovak.click();
        BrowserUtils.wait(1);
        BrowserUtils.clickWithJS(mainPage.confirmDelete);
        BrowserUtils.wait(5);

        List <String> users = new ArrayList<>();

        for (int i=1; i< 8; i++) {

            String xPathStr = "//tbody//tr[" + i + "]//td[@class='smart-table-data-cell'][3]";
            String userName= Driver.get().findElement(By.xpath(xPathStr)).getText();
            users.add(userName);
        }
        System.out.println(users);
        for (String each : users) {
            Assert.assertFalse(each.equals("novak"));
        }








    }



}
