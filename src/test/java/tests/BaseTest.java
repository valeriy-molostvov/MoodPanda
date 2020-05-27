package tests;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.LoginPage;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class BaseTest {
    LoginPage loginPage;

    @BeforeMethod
    public void setupBrowser() {
        Configuration.headless = false;
        Configuration.startMaximized = true;
        Configuration.timeout = 20000;
        Configuration.browser = "chrome";
        Configuration.clickViaJs = false;
        loginPage = new LoginPage();
    }

    @AfterMethod (alwaysRun = true)
    public void closeBrowser() {
        getWebDriver().quit();
    }
}
