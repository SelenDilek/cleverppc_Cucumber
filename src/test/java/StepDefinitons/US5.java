package StepDefinitons;

import Pages.Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class US5 {
    DialogContent dc = new DialogContent();

    @Given("Enter to cleverppc and click SigniN")
    public void enterToCleverppc () {
        GWD.getDriver().get("https://cleverppc.com/prestashop4/");
    }

    @When("Login and Password and Click to Button")
    public void loginAndPasswordAndClickToButton () {
        dc.myClick(dc.signIN);
        dc.mySendKeys(dc.username, "alicebbar1234@gmail.com");
        dc.mySendKeys(dc.password1, "Alicebbar1234");
        dc.myClick(dc.loginButton);
    }

    @And("Click to Dresses Category")
    public void clickToDressesCategory () {
        dc.myClick(dc.dresses);

    }

    @And("Assert five is absent")
    public void assertIsAbsent () {
        String text = dc.containText.getText();
        String s = text.replaceAll("[^4-6]", "");
        Assert.assertTrue(s.contains("5"));

    }

    @And("verify five product")
    public void verifyFromList () {
        String text = dc.fiveProduct.getText();
        String digit = text.replaceAll("[^4-6]", "");

        System.out.println("Total product = " + digit);
        Assert.assertTrue(digit.contains("5"));
    }

    @Then("User mission have to be Succesfully")
    public void verifeAddToCart () {
        for (int i = 0; i < dc.items.size(); i++) {
            WebElement e = dc.items.get(i);
            String getTextItems = e.getText();
            System.out.println("Dresses in the Shop  = " + (i + 1) + getTextItems);
            String text = dc.fiveProduct.getText();
            String digit = text.replaceAll("[^4-6]", "");
            int sayi = Integer.parseInt(digit);
            Assert.assertTrue(dc.items.size() == sayi, "The number of products shared and the number of products written do not match");
        }
    }

}