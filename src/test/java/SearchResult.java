import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Katsiaryna_Skarzhyns on 3/2/2017.
 */
public class SearchResult extends AbstractPage {

    private final String BASE_URL = "https://wizzair.com/en-gb/main-page#/booking/select-flight"; // это походу не нужно

    @FindBy(xpath = "")
    private WebDriver confirmOriginButton;

    @FindBy(xpath = "//*[@id=\"fare-selector-outbound\"]/div/table/tbody[5]/tr/td[2]/div/button") // надо понять на что кликать
    private WebElement confirmDestinationButton;

    @FindBy(id = "flight-select-continue-btn")
    private WebElement continueButton;



    public SearchResult(WebDriver driver){
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    public PassangerPage continueChecking(){
        continueButton.click();
    }

    @Override
    public void openPage(){

        driver.navigate().to(BASE_URL); // это походу не нужно
    }

}
