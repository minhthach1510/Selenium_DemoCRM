package crm.Tests;

import crm.Commons.BaseSetup;
import crm.Pages.Customers.CustomersAddNewPage;
import crm.Pages.Customers.CustomersPage;
import crm.Pages.SidebarMenu;
import crm.Pages.SigningPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CustomersAddNewTest extends BaseSetup {
    private SidebarMenu sidebarMenu;
    private CustomersPage customers;
    private SigningPage signingPage;
    private CustomersAddNewPage customersAddNewPage;

    @BeforeMethod
    public void beforeMethod() {
        sidebarMenu = new SidebarMenu(driver);
        customers = new CustomersPage(driver);
        signingPage = new SigningPage(driver);
        customersAddNewPage = new CustomersAddNewPage(driver);
        driver.get("https://crm.anhtester.com/admin/authentication");
        signingPage.login("admin@example.com", "123456");
        sidebarMenu.clickCustomersPage();
        customers.clickAddNewCustomers();
    }
    @Test
    public void enterInfoNewCustomer(){
        customersAddNewPage.enterTextCompany("Mtt company");
        customersAddNewPage.enterTextVATNumber("123456789");
        customersAddNewPage.enterTextPhone("0987654321");
        customersAddNewPage.enterTextWebsite("https://mtt.com");
        customersAddNewPage.selectGroups("abb");
        customersAddNewPage.selectCurrency();
        customersAddNewPage.selectDefaultLanguage("English");
        customersAddNewPage.enterTextAddress("ABC, BCA, Ha Noi");
        customersAddNewPage.enterTextCity("Ha Noi");
        customersAddNewPage.enterTextState("STATE");
        customersAddNewPage.enterTextZip("100000");
        customersAddNewPage.selectCountry("Vietnam");
        customersAddNewPage.clickSave();

    }
}
