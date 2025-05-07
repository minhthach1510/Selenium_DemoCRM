package crm.Pages.Customers;

import crm.Utilities.HelperClass;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CustomersAddNewPage {
    private WebDriver driver;
    private HelperClass helperClass;

    public CustomersAddNewPage(WebDriver driver) {
        this.driver = driver;
        helperClass = new HelperClass(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='company']")
    WebElement txt_Company;
    @FindBy(xpath = "//input[@id='vat']")
    WebElement txt_VATNumber;
    @FindBy(xpath = "//input[@id='phonenumber']")
    WebElement txt_Phone;
    @FindBy(xpath = "//input[@id='website']")
    WebElement txt_Website;
    @FindBy(xpath = "//label[text()='Groups']/following-sibling::div/div[contains(@class,'dropdown')]")
    WebElement ccb_Groups;
    @FindBy(xpath = "//label[text()='Groups']/following-sibling::div//input")
    WebElement txt_SearchGroups;
    @FindBy(xpath = "//label[text()='Currency']/following-sibling::div/button")
    WebElement ccb_Currency;
    @FindBy(xpath = "//a[@id='bs-select-2-1']")
    WebElement option_CurrenUSD;
    @FindBy(xpath = "//label[normalize-space()= 'Default Language']/following-sibling::div")
    WebElement ccb_DefaultLanguage;
    @FindBy(xpath = "//label[normalize-space()= 'Default Language']/following-sibling::div//li")
    List<WebElement> option_DefaultLanguage;
    @FindBy(xpath = "//textarea[@id='address']")
    WebElement txt_Address;
    @FindBy(xpath = "//input[@id='city']")
    WebElement txt_City;
    @FindBy(xpath = "//input[@id='state']")
    WebElement txt_State;
    @FindBy(xpath = "//input[@id='zip']")
    WebElement txt_Zip;
    @FindBy(xpath = "//label[@for='country']/following-sibling::div")
    WebElement ccb_Country;
    @FindBy(xpath = "//label[@for='country']/following-sibling::div//input")
    WebElement txt_SearchCountry;
    @FindBy(xpath = "//a[@id='bs-select-2-1']")
    List<WebElement> option_Country;
    @FindBy(xpath = "//div[@id='profile-save-section']/button[normalize-space()='Save']")
    WebElement btn_Save;

    //method
    public void enterTextCompany(String text){
        helperClass.setTextElement(txt_Company, text);
    }
    public void enterTextVATNumber(String text){
        helperClass.setTextElement(txt_VATNumber, text);
    }
    public void enterTextPhone(String text){
        helperClass.setTextElement(txt_Phone, text);
    }
    public void enterTextWebsite(String text){
        helperClass.setTextElement(txt_Website, text);
    }
    public void selectGroups(String text){
        helperClass.clickElement(ccb_Groups);
        helperClass.setTextElement(txt_SearchGroups, text);
        txt_SearchGroups.sendKeys(Keys.ENTER);
        helperClass.clickElement(ccb_Groups);
    }
    public void selectCurrency(){
        helperClass.clickElement(ccb_Currency);
        helperClass.clickElement(option_CurrenUSD);
    }
    public void selectDefaultLanguage(String text){
        helperClass.clickElement(ccb_DefaultLanguage);
        helperClass.clickElementByText(option_DefaultLanguage, text);
    }
    public void enterTextAddress(String text){
        helperClass.setTextElement(txt_Address, text);
    }
    public void enterTextCity(String text){
        helperClass.setTextElement(txt_City, text);
    }
    public void enterTextState(String text){
        helperClass.setTextElement(txt_State, text);
    }
    public void enterTextZip(String text){
        helperClass.setTextElement(txt_Zip, text);
    }
    public void selectCountry(String text){
        helperClass.clickElement(ccb_Country);
        helperClass.setTextElement(txt_SearchCountry, text);
        txt_SearchCountry.sendKeys(Keys.ENTER);
    }

    public void clickSave(){
        helperClass.clickElement(btn_Save);
    }
    public void addNewCustomer(String company, String vatNumber, String phone, String website, String group, String defaultLanguage, String address, String city, String state, String zip, String country) {
        enterTextCompany(company);
        enterTextVATNumber(vatNumber);
        enterTextPhone(phone);
        enterTextWebsite(website);
        selectGroups(group);
        selectCurrency();
        selectDefaultLanguage(defaultLanguage);
        enterTextAddress(address);
        enterTextCity(city);
        enterTextState(state);
        enterTextZip(zip);
        selectCountry(country);
        clickSave();
    }

}
