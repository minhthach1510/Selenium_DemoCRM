package crm.Tests;

import crm.Commons.BaseSetup;
import crm.Pages.DashboardPage;
import crm.Pages.SigningPage;
import crm.Utilities.HelperClass;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SigningTest extends BaseSetup {
    SigningPage signingPage;
    HelperClass helper;
    DashboardPage dashboardPage;

    @BeforeMethod
    public void beforeMethod() {
        signingPage = new SigningPage(driver);
        helper = new HelperClass(driver);
        driver.manage().deleteAllCookies();
        driver.get("https://crm.anhtester.com/admin/authentication");
    }
    @Test(priority = 1)
    public void tst_loginSuccess() {
        Assert.assertTrue(driver.getCurrentUrl().contains("/authentication"), "Not the login page");
        dashboardPage = signingPage.login("admin@example.com", "123456");
        dashboardPage.verifyDashboardOptions();
    }
    @Test(priority = 2)
    public void tst_loginEmtyUsername() {
        signingPage.enterPassword("123456");
        signingPage.clickBtnLogin();
        Assert.assertEquals(signingPage.getErrorMsg(), "The Email Address field is required.");
    }
    @Test(priority = 3)
    public void tst_loginEmtyPassWord() {
        signingPage.enterUsername("admin@example.com");
        signingPage.clickBtnLogin();
        Assert.assertEquals(signingPage.getErrorMsg(), "The Password field is required.");
    }
    @Test (priority = 4)
    public void tst_loginEmtyUsernameAndPassWord() {
        signingPage.clickBtnLogin();
        Assert.assertEquals(signingPage.getErrorMsg(), "The Password field is required.");
        Assert.assertEquals(signingPage.getErrorMsg2(), "The Email Address field is required.");
    }
    @Test (priority = 5)
    public void tst_notCorrectFormatEmail() {
        signingPage.enterUsername("adminexample.com");
        signingPage.clickBtnLogin();
        String expectedErrorMessage = "Please include an '@' in the email address. 'adminexample.com' is missing an '@'.";
        Assert.assertEquals(signingPage.getErrorMessagehtml(), expectedErrorMessage, "Not correct format email");
    }

}
