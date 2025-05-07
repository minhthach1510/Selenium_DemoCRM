package crm.Tests;

import crm.Commons.BaseSetup;
import crm.Pages.Customers.CustomersDetailPage;
import crm.Pages.Customers.CustomersPage;
import crm.Pages.SidebarMenu;
import crm.Pages.SigningPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CustomerDetailTest extends BaseSetup{
    private SigningPage signingPage;
    private SidebarMenu sidebarMenu;
    private CustomersPage customersPage;
    private CustomersDetailPage customerDetailPage;

    @BeforeMethod
    public void beforeMethod() throws InterruptedException {
        signingPage = new SigningPage(driver);
        sidebarMenu = new SidebarMenu(driver);
        customersPage = new CustomersPage(driver);
        customerDetailPage = new CustomersDetailPage(driver);
        driver.get("https://crm.anhtester.com/admin/authentication");
        signingPage.login("admin@example.com", "123456");
        sidebarMenu.clickCustomersPage();
        customersPage.clickSearchCustomer();
        customersPage.enterTextSearchCustomer("Mtt company");
        customersPage.moveToTextCompany();
        customersPage.clickLinkView();
    }
    @Test
    public void verifyTextCustomerDetail() {
        Assert.assertEquals(customerDetailPage.getTextCompany(), "Mtt company", "Not correct company");
        Assert.assertEquals(customerDetailPage.getTextVATNumber(), "123456789", "Not correct VATNumber");
        Assert.assertEquals(customerDetailPage.getTextPhone(), "0987654321", "Not correct Phone");
        Assert.assertEquals(customerDetailPage.getTextWebsite(), "https://mtt.com", "Not correct Website");
        Assert.assertEquals(customerDetailPage.getTextGroup(), "abb", "Not correct Group");
        Assert.assertEquals(customerDetailPage.getTextCurrency(), "USD", "Not correct Currency");
        Assert.assertEquals(customerDetailPage.getTextDefaultLanguage(), "English", "Not correct DefaultLanguage");
        Assert.assertEquals(customerDetailPage.getTextAddress(), "ABC, BCA, Ha Noi", "Not correct Address");
        Assert.assertEquals(customerDetailPage.getTextCity(), "Ha Noi", "Not correct City");
        Assert.assertEquals(customerDetailPage.getTextState(), "STATE", "Not correct State");
        Assert.assertEquals(customerDetailPage.getTextZip(), "100000", "Not correct Zip");
        Assert.assertEquals(customerDetailPage.getTextCountry(), "Vietnam", "Not correct Country");

    }
}
