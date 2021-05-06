import org.testng.annotations.Test;

import java.io.IOException;

public class MainTests extends DriverSettings {

    @Test(priority = 1)
    public void careerBtnClick() {
        netPaekMainPage.careerBtnClick();
        netPaekMainPage.switchTab();
    }

    @Test(priority = 2)
    public void jobBtnClick() {
        careerPage.jobBtnClick();
    }

    @Test(priority = 3)
    public void uploadFile() throws IOException, InterruptedException {
        formPage.uploadFileClick();
        formPage.uploadStart();
    }

    @Test(priority = 4)
    public void errorMessageIsDisplayed() {
        formPage.errorMessage();
    }

    @Test(priority = 5)
    public void nameFieldFill() {
        formPage.nameFieldFill(ConfigProperties.getProperty("name"));
    }

    @Test(priority = 6)
    public void lastNameFieldFill() {
        formPage.lastNameFieldFill(ConfigProperties.getProperty("lastName"));
    }

    @Test(priority = 7)
    public void emailFieldFill() {
        formPage.emailFieldFill(ConfigProperties.getProperty("email"));
    }

    @Test(priority = 8)
    public void phoneNumberFieldFill() {
        formPage.phoneFieldFill(ConfigProperties.getProperty("phone"));
    }

    @Test(priority = 9)
    public void yearElementClick() {
        formPage.yearElementClick();
    }

    @Test(priority = 10)
    public void monthElementClick() {
        formPage.monthElementClick();
    }

    @Test(priority = 11)
    public void dayElementClick() {
        formPage.dayElementClick();
    }

    @Test(priority = 12)
    public void submitBtnClick() {
        formPage.submitBtnClick();
    }

    @Test(priority = 13)
    public void allElements() {
        formPage.allElements();
    }

    @Test(priority = 14)
    public void coursesBtnClick() {
        formPage.coursesBtnClick();
    }

    @Test(priority = 15)
    public void checkTitle() {
        coursesPage.checkTitle();
    }
}
