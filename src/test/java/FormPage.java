import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.io.IOException;

public class FormPage {

    public WebDriver driver;

    public FormPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//button[@id='upload']")
    private WebElement uploadBtn;

    @FindBy(css = "#up_file_name > label")
    private WebElement errorMessage;

    @FindBy(id = "inputName")
    private WebElement nameField;

    @FindBy(id = "inputLastname")
    private WebElement lastNameField;

    @FindBy(id = "inputEmail")
    private WebElement emailField;

    @FindBy(id = "inputPhone")
    private WebElement phoneField;

    @FindBy(xpath = "//option[contains(text(),'2002')]")
    private WebElement yearElement;

    @FindBy(xpath = "//option[contains(text(),'января')]")
    private WebElement monthElement;

    @FindBy(xpath = "//body/form[@id='hiring-form']/div[1]/div[1]/div[1]/div[11]/div[4]/select[1]/option[7]")
    private WebElement dayElement;

    @FindBy(xpath = "//p[contains(text(),'Все поля являются обязательными для заполнения')]")
    private WebElement allElements;

    @FindBy(id = "submit")
    private WebElement submitBtn;

    @FindBy(xpath = "//header/div[2]/div[1]/div[1]/div[2]/div[1]/nav[1]/ul[1]/li[4]")
    private WebElement coursesBtn;


    public void uploadFileClick() throws InterruptedException {
        uploadBtn.click();
        Thread.sleep(10000);
    }

    public void uploadStart() throws IOException {
        Runtime.getRuntime().exec(ConfigProperties.getProperty("FileUpload"));
    }

    public void errorMessage() {
        if (errorMessage.isDisplayed()) {
            System.out.println("Message is Displayed!");
        } else {
            System.out.println("Message is not Displayed!");
        }
    }

    public void nameFieldFill(String name) {
        nameField.sendKeys(name);
    }

    public void lastNameFieldFill(String lastName) {
        lastNameField.sendKeys(lastName);
    }

    public void emailFieldFill(String email) {
        emailField.sendKeys(email);
    }

    public void phoneFieldFill(String phone) {
        phoneField.sendKeys(phone);
    }

    public void yearElementClick() {
        yearElement.click();
    }

    public void monthElementClick() {
        monthElement.click();
    }

    public void dayElementClick() {
        dayElement.click();
    }

    public void submitBtnClick() {
        submitBtn.click();
    }

    public void allElements() {
        String color = allElements.getCssValue("color");
        System.out.println(color);
        String hex = Color.fromString(color).asHex();
        System.out.println(hex);

        Assert.assertEquals(hex, "#ff0000");
    }

    public void coursesBtnClick(){
        coursesBtn.click();
    }


}
