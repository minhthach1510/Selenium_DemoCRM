package crm.Pages;

import crm.Utilities.HelperClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SidebarMenu {
    private WebDriver driver;
    private HelperClass helperClass;
    public SidebarMenu(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        helperClass = new HelperClass(driver);
    }

    @FindBy(xpath = "//span[normalize-space()='Customers']")
    WebElement menu_Customers;

    public void clickCustomersPage() {
        helperClass.clickElement(menu_Customers);
    }
}
