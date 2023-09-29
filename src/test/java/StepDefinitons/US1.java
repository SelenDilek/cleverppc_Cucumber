package StepDefinitons;

import Pages.Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US1 {
    DialogContent dc=new DialogContent();

    @Given("Navigate to cleverppc")
    public void navigateToCleverppc() {
        GWD.getDriver().get("https://cleverppc.com/prestashop4/");
    }

    @When("User clicks sign in button")
    public void userClicksSignInButton() {
        dc.myClick(dc.singInButton);
    }

    @And("Enters a valid email address")
    public void entersAValidEmailAddress() {
        dc.mySendKeys(dc.emailAddress, "randomuser@gmail.com");
    }

    @And("Clicks on the Create an account button")
    public void clicksOnTheCreateAnAccountButton() {
        dc.myClick(dc.createAnAccountButton);
    }

    @And("Fill in all mandatory information and click on the register button")
    public void fillInAllMandatoryInformationAndClickOnTheRegisterButton() {
        dc.mySendKeys(dc.firstName, "random");
        dc.mySendKeys(dc.lastName, "user");
        dc.mySendKeys(dc.password, "randompasword");
        dc.myClick(dc.registerButton);
    }

    @Then("The user has been successfully redirected to the system")
    public void theUserHasBeenSuccessfullyRedirectedToTheSystem() {
        dc.verifyContainsText(dc.myAccount,"MY ACCOUNT");
    }
}
