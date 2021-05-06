import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

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




    public void uploadFileClick() throws InterruptedException {
        uploadBtn.click();
        Thread.sleep(10000);
    }

    public void uploadStart() throws IOException {
        Runtime.getRuntime().exec(ConfigProperties.getProperty("FileUpload"));
    }

    public void errorMessage() {
        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        if (errorMessage.isDisplayed()) {
            System.out.println("Message is Displayed!");
        } else {
            System.out.println("Message is not Displayed!");
        }
    }

    public void nameFieldFill(String name){
        nameField.sendKeys(name);
    }

    public void lastNameFieldFill(String lastName){
        nameField.sendKeys(lastName);
    }





}
