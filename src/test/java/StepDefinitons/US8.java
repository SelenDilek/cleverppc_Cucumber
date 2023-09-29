package StepDefinitons;

import Pages.Pages.DialogContent;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class US8 {
    DialogContent dc = new DialogContent();

    SoftAssert _softAssert = new SoftAssert();

    @Then("User should verify contact-us message")
    public void userShouldVerifyContactUsMessage() {
        dc.verifyContainsText(dc.contactUsMessage, "CONTACT US");
    }

    @And("Select as {string} from the Subject Heading dropbox")
    public void selectAsFromTheSubjectHeadingDropbox(String selection) {
        dc.scrollToElement(dc.subjectHeadingButton);
        new Select(dc.subjectHeadingButton).selectByVisibleText(selection);
    }

    @And("Sends email as {string} and order reference as {string} and message as {string}")
    public void sendsEmailAsAndOrderReferenceAsAndMessageAs(String email, String orderReference, String message) {
        dc.mySendKeys(dc.emailInput, email);
        dc.mySendKeys(dc.orderReferenceInput, orderReference);
        dc.mySendKeys(dc.messageTextArea, message);
    }

    @And("Attach a file")
    public void attachAFile() throws AWTException {
        StringSelection filePath = new StringSelection("C:\\Users\\user\\Desktop\\fish.jpg");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filePath, null);

        // sendKeys("C:\\Users\\user\\Desktop\\fish.jpg") fonksiyonu kullan�larak ta dosya yolu g�nderip sonras�nda enter tu�una basabiliriz.

        new Robot().keyPress(KeyEvent.VK_CONTROL); // bu iki tu� �u anda bas�lm�� vaziyette, haf�zadaki yol yap��t�r�ld�
        new Robot().keyPress(KeyEvent.VK_V);

        new Robot().keyRelease(KeyEvent.VK_CONTROL); // tu�lar serbest b�rak�ld�
        new Robot().keyRelease(KeyEvent.VK_V);

        new Robot().keyPress(KeyEvent.VK_ENTER); // dosya Entera bas�larak g�nderildi
        new Robot().keyRelease(KeyEvent.VK_ENTER);

    }

    @Then("User should verify message has been successfully sent")
    public void userShouldVerifyMessageHasBeenSuccessfullySent() {
        dc.verifyContainsText(dc.contactUsSuccessMessage, "message has been successfully sent");
    }
}
