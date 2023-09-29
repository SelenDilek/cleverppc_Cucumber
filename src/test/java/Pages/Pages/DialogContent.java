package Pages.Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DialogContent extends Parent {


    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
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

    @FindBy(className = "header_user_info")
    public WebElement sign_in;

    @FindBy(css = "[id='email']")
    public WebElement LoginEmail;

    @FindBy(css = " [id='passwd']")
    public WebElement LoginPasswrd;

    @FindBy(css = "[id='SubmitLogin']")
    public WebElement SubmitLogin;

    @FindBy(css = "[class='account']")
    public WebElement myHomepage;
    @FindBy(css = "[class='alert alert-danger']")
    public WebElement error;


    //-----------------------us3-----------------------------------------
    @FindBy (xpath="//*[@id='email']")
    public WebElement eMail;

    @FindBy (xpath="//*[@id='SubmitLogin']")
    public WebElement signInButton;

    @FindBy (xpath="//*[@title='Sitemap']")
    public WebElement siteMap;

    @FindBy (xpath="//*[@title='View a list of my addresses']")
    public WebElement addresses;

    @FindBy (xpath="//*[@id='center_column']//a")
    public WebElement addAnewAddressMessage;

    @FindBy (xpath="//*[@title='Add an address']")
    public WebElement addAnewAddressButton;

    @FindBy (xpath="//*[@id='center_column']//p")
    public WebElement fillOutFormMessage;

    @FindBy (xpath="//*[@id='submitAddress']")
    public WebElement addressSaveButton;

    @FindBy (xpath="(//*[@id='center_column']//p)[2]")
    public WebElement addressErrorMessage;

    @FindBy (xpath="//*[@id='address1']")
    public WebElement address1Input;

    @FindBy (xpath="//*[@id='city']")
    public WebElement city;

    @FindBy (xpath="//*[@id='id_state']")
    public WebElement state;

    @FindBy (xpath="//*[@id='postcode']")
    public WebElement postcode;

    @FindBy (xpath="//*[@id='phone_mobile']")
    public WebElement phone_mobile;

    @FindBy (xpath="//*[@id='center_column']/h1")
    public WebElement txtMyAccount;

    //-----------------------us4-----------------------------------------
    @FindBy (xpath="(//*[@title='Women'])[1]")
    public WebElement womenButton;

    @FindBy (xpath="(//*[@id='categories_block_left']//a)[4]")
    public WebElement dressesbutton;

    @FindBy (xpath="(//*[@id='categories_block_left']//li)[3]/a")
    public WebElement summerDressesButton;

    @FindBy (xpath="(//*[@id='center_column']//span)[1]")
    public WebElement txtSummerDresses;

    @FindBy (xpath="//*[@class='replace-2x img-responsive']")
    public List<WebElement> summerDressesList;

    @FindBy (xpath="//*[@title='Add to cart']")
    public List<WebElement> addToCartButton;

    @FindBy (xpath="(//*[@id='layer_cart']//span)[2]")
    public WebElement addedToCartMessage;

    @FindBy (xpath="(//*[@id='block_top_menu']//a)[9]")
    public WebElement dressesButton1;

    @FindBy (xpath="//*[@title='View my shopping cart']")
    public WebElement cartButton;

    //-----------------------us5-----------------------------------------
    @FindBy(xpath="//*[@id='header']/div[2]/div/div/nav/div[1]/a")
    public WebElement signIN;
    @FindBy(id="email")
    public WebElement username;

    @FindBy(id="passwd")
    public WebElement password1;

    @FindBy(xpath="//*[@id='SubmitLogin']/span")
    public WebElement loginButton;

    @FindBy(xpath="//*[@id='block_top_menu']/ul/li[2]")
    public WebElement dresses;

    @FindBy(xpath="//*[@id='center_column']//*[contains(text(), 'Showing 1 - 5 of 5 items')]")
    public WebElement containText;
    @FindBy(xpath="//span[@class='heading-counter']")
    public WebElement fiveProduct;
    @FindBy(xpath="//*[@id='product_list']//img")
    public List<WebElement> items;

    //-----------------------us6-----------------------------------------


    //-----------------------us7-----------------------------------------


    //-----------------------us8-----------------------------------------
    @FindBy (xpath="//*[@id='contact-link']")
    public WebElement contactUsButton;

    @FindBy (xpath="//*[@id='center_column']/h1")
    public WebElement contactUsMessage;

    @FindBy (xpath="//*[@id='id_contact']")
    public WebElement subjectHeadingButton;

    @FindBy (xpath="//*[@id='email']")
    public WebElement emailInput;

    @FindBy (xpath="//*[@id='id_order']")
    public WebElement orderReferenceInput;

    @FindBy (xpath="//*[@id='uniform-fileUpload']")
    public WebElement chooseFileButton;

    @FindBy (xpath="//*[@id='message']")
    public WebElement messageTextArea;

    @FindBy (xpath="//*[@id='submitMessage']")
    public WebElement sendButton;

    @FindBy (xpath="//*[@id='center_column']/p")
    public WebElement contactUsSuccessMessage;

    public WebElement getWebElement(String strElement) {
        switch (strElement) {
            // case "addButton": return this.addButton;
            //-----------------------us1-----------------------------------------


            //-----------------------us2-----------------------------------------

            case "SingButton":
                return this.sign_in;
            case "SubmitLogin":
                return this.SubmitLogin;


            //-----------------------us3-----------------------------------------

            case "registerButton": return this.registerButton;
            case "siteMap": return this.siteMap;
            case "addresses": return this.addresses;
            case "addAnewAddressButton": return this.addAnewAddressButton;
            case "addressSaveButton": return this.addressSaveButton;
            case "address1Input": return this.address1Input;
            case "city": return this.city;
            case "postcode": return this.postcode;
            case "phone_mobile": return this.phone_mobile;

            //-----------------------us4-----------------------------------------
            case "womenButton": return this.womenButton;
            case "dressesbutton": return this.dressesbutton;
            case "summerDressesButton": return this.summerDressesButton;
            case "dressesButton1": return this.dressesButton1;
            case "cartButton": return this.cartButton;

            //-----------------------us5-----------------------------------------


            //-----------------------us6-----------------------------------------


            //-----------------------us7-----------------------------------------


            //-----------------------us8-----------------------------------------
            case "contactUsButton": return this.contactUsButton;
            case "subjectHeadingButton": return this.subjectHeadingButton;
            case "chooseFileButton": return this.chooseFileButton;
            case "sendButton": return this.sendButton;

        }

        return null;
    }

}
