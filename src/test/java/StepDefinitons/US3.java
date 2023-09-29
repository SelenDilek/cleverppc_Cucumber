package StepDefinitons;

import Pages.Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class US3 {


    DialogContent dc = new DialogContent();

    SoftAssert _softAssert = new SoftAssert();

    @Given("Navigate to Homepage")
    public void navigate_to_homepage() {
        GWD.getDriver().navigate().to("https://cleverppc.com/prestashop4/");
    }

    @When("Click on the element in the DialogContent")
    public void clickOnTheElementInDialogContent(DataTable buttons) {
        List<String> strButtonsList = buttons.asList(String.class);

        for (int i = 0; i < strButtonsList.size(); i++) {
            WebElement buttonWebElement = dc.getWebElement(strButtonsList.get(i));
            dc.myClick(buttonWebElement);
        }
    }

    @And("Enter e-mail {string} and password {string} then click sign in button")
    public void enter_email_and_password_then_click_sign_in_button(String email, String password) {

        dc.mySendKeys(dc.eMail,email );
        dc.mySendKeys(dc.password, password);
        dc.myClick(dc.signInButton);
    }

    @Then("User should login successfully")
    public void user_should_login_successfully() {
        dc.verifyContainsText(dc.txtMyAccount, "MY ACCOUNT");
    }

    @And("User sends the keys into the dialog box")
    public void userSendsTheKeysIntoTheDialogBox(DataTable data) {
        List<List<String>> items = data.asLists(String.class);

        for (int i = 0; i < items.size(); i++) {
            WebElement element = dc.getWebElement(items.get(i).get(0));
            String text = items.get(i).get(1);//Önce 1.elementin texti, daha sonra 2.elementin texti

            dc.mySendKeys(element, text);
        }
    }

    @Then("User should verify add a new address message")
    public void userShouldVerifyAddAnewAddressesMessage() {
        dc.verifyContainsText(dc.addAnewAddressMessage, "Add a new address");
    }

    @Then("User should verify fill out form message")
    public void userShouldVerifyFillOutFormMessage() {
        dc.verifyContainsText(dc.fillOutFormMessage, "please fill out the form below.");
    }

    @Then("User gets address error message")
    public void userGetsAddressErrorMessage() {
        dc.verifyContainsText(dc.addressErrorMessage, "error");
    }

    @And("Select state for address in the DialogContent")
    public void selectStateForAddressInTheDialogContent() {
        Select state = new Select(dc.state);
        state.selectByIndex(1);
    }
}
