package crm.Pages.Customers;

import crm.Utilities.HelperClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomersDetailPage {
    private WebDriver driver;
    private HelperClass helperClass;


    public CustomersDetailPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        helperClass = new HelperClass(driver);
    }

    @FindBy(xpath = "//input[@id='company']")
    WebElement txt_Company;

    @FindBy(xpath = "//input[@id='vat']")
    WebElement txt_VATNumber;

    @FindBy(xpath = "//input[@id='phonenumber']")
    WebElement txt_Phone;

    @FindBy(xpath = "//input[@id='website']")
    WebElement txt_Website;

    @FindBy(xpath = "//label[text()='Groups']/following-sibling::div/div//button[@role='combobox']")
    WebElement ccb_Group;

    @FindBy(xpath = "//label[text()='Currency']/following-sibling::div/button")
    WebElement ccb_Currency;

    @FindBy(xpath = "//label[normalize-space()='Default Language']/following-sibling::div/button")
    WebElement ccb_DefaultLanguage;

    @FindBy(xpath = "//textarea[@id='address']")
    WebElement txt_Address;

    @FindBy(xpath = "//input[@id='city']")
    WebElement txt_City;

    @FindBy(xpath = "//input[@id='state']")
    WebElement txt_State;

    @FindBy(xpath = "//input[@id='zip']")
    WebElement txt_Zip;

    @FindBy(xpath = "//label[text()='Country']/following-sibling::div/button")
    WebElement ccb_Country;

    //create methos getText frome element by helperclass
    public String getTextCompany(){
        return helperClass.getAttributeValueElement(txt_Company);
    }
    public String getTextVATNumber(){
        return helperClass.getAttributeValueElement(txt_VATNumber);
    }
    public String getTextPhone(){
        return helperClass.getAttributeValueElement(txt_Phone);
    }
    public String getTextWebsite(){
        return helperClass.getAttributeValueElement(txt_Website);
    }
    public String getTextGroup(){
        return helperClass.getTextFromElement(ccb_Group);
    }
    public String getTextCurrency(){
        return helperClass.getTextFromElement(ccb_Currency);
    }
    public String getTextDefaultLanguage(){
        return helperClass.getTextFromElement(ccb_DefaultLanguage);
    }
    public String getTextAddress(){
        return helperClass.getAttributeValueElement(txt_Address);
    }
    public String getTextCity(){
        return helperClass.getAttributeValueElement(txt_City);
    }
    public String getTextState(){
        return helperClass.getAttributeValueElement(txt_State);
    }
    public String getTextZip(){
        return helperClass.getAttributeValueElement(txt_Zip);
    }
    public String getTextCountry(){
        return helperClass.getTextFromElement(ccb_Country);
    }


}
