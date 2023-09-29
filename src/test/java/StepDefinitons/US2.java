package StepDefinitons;

import Pages.Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

import java.util.List;

public class US2 {
    DialogContent dc = new DialogContent();

    @Then("There is an error")
    public void thereIsAnError() {

        dc.verifyContainsText(dc.error,"error");

    }

    @When("Enter email and password  Cleveppc  email as{string} password as {string}")
    public void enterEmailAndPasswordCleveppcEmailAsPasswordAs(String email, String password) {

        dc.mySendKeys(dc.LoginEmail,email);
        dc.mySendKeys(dc.LoginPasswrd,password);


    }

    @Then("Home page  login")
    public void homePageLogin() {
        dc.verifyContainsText(dc.myHomepage,"freeman");

    }

    @Given("Navigate to Cleverppc")
    public void navigateToCleverppc() {
        GWD.getDriver().get("https://cleverppc.com/prestashop4/");

    }

    @When("Click on the element in Dialog")
    public void clickOnTheElementInDialog(DataTable buttons) {
        List<String> strButtonsList = buttons.asList(String.class);

        for (int i = 0; i < strButtonsList.size(); i++) {
            WebElement linkWebElement = dc.getWebElement(strButtonsList.get(i));
            dc.myClick(linkWebElement);
        }

    }

    @And("User sending the keys in Dialog")
    public void userSendingTheKeysInDialog(DataTable keys) {

        List<List<String>> items = keys.asLists(String.class);

        for (int i = 0; i < items.size(); i++) {
            WebElement e = dc.getWebElement(items.get(i).get(0));
            String yazi = items.get(i).get(1);

            dc.mySendKeys(e, yazi);

        }

    }
}
