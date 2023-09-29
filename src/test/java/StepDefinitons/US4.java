package StepDefinitons;

import Pages.Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;

public class US4 {


    DialogContent dc = new DialogContent();

    SoftAssert _softAssert = new SoftAssert();

    @Then("User should verify summer dresses message")
    public void userShouldVerifySummerDressesMessage() {
        dc.verifyContainsText(dc.txtSummerDresses, "Summer Dresses");
    }

    @And("User randomly mouseover one of the products and clicks add to cart button")
    public void userRandomlyMouseoverOneOfTheProductsAndClicksAddToCartButton() {
        int randomSecim = (int) (Math.random() * dc.summerDressesList.size());
        new Actions(GWD.getDriver()).moveToElement(dc.summerDressesList.get(randomSecim)).build().perform();
        dc.myJsClick(dc.addToCartButton.get(randomSecim));
    }

    @Then("User gets product successfully added to your shopping cart message")
    public void userGetsProductSuccessfullyAddedToYourShoppingCartMessage() {
        dc.verifyContainsText(dc.addedToCartMessage, "Product successfully added to your shopping cart");
    }
}
