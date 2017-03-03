import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

/**
 * Created by Katsiaryna_Skarzhyns on 3/3/2017.
 */
public class TestsFramework {

    private WebDriver driver;

    public void initBrowser() {
        driver = DriverSingleton.getDriver();
    }

    public void closeBrowser() {
        driver.quit();
    }

    public void xxx() {
        MainPage mainPage = new MainPage(driver);
        mainPage.openPage();
    }

}
