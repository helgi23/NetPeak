import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CareerPage {

    public WebDriver driver;

    public CareerPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void scrollDown() {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0, 3000)", "");
    }

    public void scrollUP() {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,-3000)", "");
    }

    @FindBy(xpath = "//a[contains(text(),'Я хочу работать в Netpeak')]")
    private WebElement jobBtn;


    public void jobBtnClick() {
        scrollDown();
        jobBtn.click();
    }
}
