import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Katsiaryna_Skarzhyns on 3/2/2017.
 */
public class PassangerPage extends AbstractPage {

    private final String BASE_URL = "https://wizzair.com/en-gb/main-page#/booking/select-flight";

    @FindBy

    public PassangerPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    @Override
    public void openPage(){

        driver.navigate().to(BASE_URL);
    }

}
