import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;

public class NetPaekMainPage {

    public WebDriver driver;

    public NetPaekMainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//body/div[@id='allrecords']/div[@id='rec278727844']/div[1]/div[1]/div[1]/div[2]/div[1]/nav[1]/div[1]/div[1]/ul[1]/li[4]/a[1]")
    private WebElement CareerBtn;


    public void careerBtnClick() {
        CareerBtn.click();
    }


    public void switchTab() {
        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
    }


}
