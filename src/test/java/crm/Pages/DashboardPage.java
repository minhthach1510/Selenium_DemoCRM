package crm.Pages;

import crm.Utilities.HelperClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class DashboardPage extends HelperClass {
    public DashboardPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class='screen-options-btn' and contains(., 'Dashboard Options')]")
    private WebElement dashboardOptions;

    public void verifyDashboardOptions() {
        Assert.assertTrue(verifyElementDisplayed(dashboardOptions), "dashboardOptions not displayed");
    }
}
