package crm.Pages.Customers;

import crm.Utilities.HelperClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomersPage {
    private WebDriver driver;
    HelperClass helperClass;

    public CustomersPage(WebDriver driver) {
        this.driver = driver;
        helperClass = new HelperClass(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[normalize-space()='New Customer']")
    WebElement btn_AddNewCustomers;

    @FindBy(xpath = "//input[@class='form-control input-sm']")
    WebElement search_Customer;

    @FindBy(xpath = "//td[@class='sorting_1']//a[contains(text(),'Mtt company')]")
    WebElement text_Company;

    @FindBy(xpath = "//td[@class='sorting_1']//a[normalize-space()='View']")
    WebElement link_View;

    public void clickAddNewCustomers() {
        helperClass.clickElement(btn_AddNewCustomers);
    }
    //click search customer
    public void clickSearchCustomer() {
        helperClass.clickElement(search_Customer);
    }
    //enter text search customer
    public void enterTextSearchCustomer(String text) {
        helperClass.setTextElement(search_Customer, text);
    }
    //move to text_Company
    public void moveToTextCompany() {
        helperClass.moveToElement(text_Company);
    }
    //click linkview
    public void clickLinkView() {
        helperClass.clickElement(link_View);
    }
}
