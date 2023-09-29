package Pages.Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContent extends Parent {


    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(),this);
    }

    //@FindBy(xpath = "//a[@class='login']")
    //  public WebElement singInButton;

    //lütfen store nize ayrılmıs bolumleri doldurunuz

    //-----------------------us1-----------------------------------------
    //US1 locators
    @FindBy(xpath = "//*[@id='header']/div[2]/div/div/nav/div[1]/a")
    public WebElement singInButton;

    @FindBy(xpath = "//*[@id='email_create']")
    public WebElement emailAddress;

    @FindBy(xpath = "//*[@id='SubmitCreate']/span")
    public WebElement createAnAccountButton;

    @FindBy(xpath = "//*[@id='customer_firstname']")
    public WebElement firstName;

    @FindBy(xpath = "//*[@id='customer_lastname']")
    public WebElement lastName;

    @FindBy(xpath = "//*[@id='passwd']")
    public WebElement password;

    @FindBy(xpath = "//*[@id='submitAccount']/span")
    public WebElement registerButton;

    @FindBy(xpath = "//*[@id='center_column']/h1")
    public WebElement myAccount;


































    //-----------------------us2-----------------------------------------







































    //-----------------------us3-----------------------------------------

































    //-----------------------us4-----------------------------------------




























    //-----------------------us5-----------------------------------------





























    //-----------------------us6-----------------------------------------

























































    //-----------------------us7-----------------------------------------










































    //-----------------------us8-----------------------------------------
































































    public WebElement getWebElement(String strElement){
        switch (strElement){
           // case "addButton": return this.addButton;
            //-----------------------us1-----------------------------------------








            //-----------------------us2-----------------------------------------









            //-----------------------us3-----------------------------------------









            //-----------------------us4-----------------------------------------











            //-----------------------us5-----------------------------------------













            //-----------------------us6-----------------------------------------














            //-----------------------us7-----------------------------------------


            

            //-----------------------us8-----------------------------------------












        }

        return null;
    }

}
