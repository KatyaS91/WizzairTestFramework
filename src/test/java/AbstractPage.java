import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

/**
 * Created by Katsiaryna_Skarzhyns on 3/2/2017.
 */
public abstract class AbstractPage {

    protected WebDriver driver;

    public abstract void openPage();

    public AbstractPage(WebDriver driver){
        this.driver = driver;
    }

/*    WebDriver driver = new RemoteWebDriver("http://localhost:9515", DesiredCapabilities.chrome());
driver.get("http://www.google.com");*/

}
