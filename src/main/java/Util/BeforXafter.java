package Util;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import static com.codeborne.selenide.Configuration.timeout;
import static com.codeborne.selenide.Selenide.open;

public class BeforXafter {
    @BeforeMethod(alwaysRun = true)
    public void before(){
        Configuration.browser = "chrome";
        open("https://www.swoop.ge");
        WebDriverRunner.getWebDriver().manage().window().maximize();
        Configuration.holdBrowserOpen = true;
        timeout=5000;

    }
    @AfterMethod(alwaysRun = true)
    public void after(){
        WebDriverRunner.closeWindow();
    }
}
