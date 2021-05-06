import org.testng.annotations.Test;

import java.io.IOException;

public class MainTests extends DriverSettings {

    @Test(priority = 1)
    public void careerBtnClick() {
        netPaekMainPage.careerBtnClick();
        netPaekMainPage.switchWind();
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
    public void errorMessageIsDisplayed(){
        formPage.errorMessage();
    }

    @Test(priority = 5)
    public void nameFieldFill(){
        formPage.nameFieldFill(ConfigProperties.getProperty("name"));
    }
}
