import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class CoursesPage {

    public WebDriver driver;

    public CoursesPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void checkTitle() {
        String actualTitle = driver.getTitle();
        String expectedTitle = "Образовательный Центр Netpeak: курсы по SEO, PPC, PHP в Одессе";
        System.out.println(actualTitle);
        Assert.assertEquals(actualTitle, expectedTitle);
    }
}
