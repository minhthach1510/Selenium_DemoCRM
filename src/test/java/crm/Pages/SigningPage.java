package crm.Pages;

import crm.Utilities.HelperClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SigningPage {
    private WebDriver driver;
    HelperClass helper;
    public SigningPage(WebDriver driver) {
        this.driver = driver;
        helper = new HelperClass(driver);
//        super(driver); //Gọi constructor của lớp cha (HelperClass) và truyền driver cho nó
        PageFactory.initElements(driver, this);
    }

    //elements
    @FindBy(xpath = "//input[@id='email']")
    private WebElement txt_Username;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement txt_Password;

    @FindBy(xpath = "//button[normalize-space()='Login']")
    private WebElement btn_Login;

    @FindBy(xpath = "//div[@class='alert alert-danger text-center'][1]")
    private WebElement msg_Error;

    @FindBy(xpath = "//div[@class='alert alert-danger text-center'][2]")
    private WebElement msg_Error2;

    //methods handle
    public DashboardPage login(String username, String password) {
        helper.setTextElement(txt_Username, username);
        helper.setTextElement(txt_Password, password);
        helper.clickElement(btn_Login);
        return new DashboardPage(driver);

    }
    public void enterUsername(String text){
        helper.setTextElement(txt_Username, text);
    }
    public void enterPassword(String text){
        helper.setTextElement(txt_Password, text);
    }
    public void clickBtnLogin(){
        helper.clickElement(btn_Login);
    }

    public String getErrorMsg(){
        return helper.getTextFromElement(msg_Error);
    }
    public String getErrorMsg2(){
        return helper.getTextFromElement(msg_Error2);
    }
    public Boolean checkFormatEmail(){
        return helper.checkValidityEmail();
    }

    public String getErrorMessagehtml()
    {
        String actualErrorMessage = (String) ((JavascriptExecutor) driver)
                .executeScript("return arguments[0].validationMessage;", txt_Username);
        System.out.println(actualErrorMessage);
        return actualErrorMessage.trim();
    }
}
