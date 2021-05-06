import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;

public class DriverSettings {

    public static NetPaekMainPage netPaekMainPage;
    public static CareerPage careerPage;
    public static FormPage formPage;
    public static WebDriver driver;


    @BeforeSuite
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", ConfigProperties.getProperty("chromedriver"));
        WebDriver driver = new ChromeDriver();

        netPaekMainPage = new NetPaekMainPage(driver);
        careerPage = new CareerPage(driver);
        formPage = new FormPage(driver);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(ConfigProperties.getProperty("mainPageLink"));
    }

    @AfterSuite
    public void afterTest() {
        if (null != driver) {
            driver.close();
            driver.quit();
        }
    }
}

