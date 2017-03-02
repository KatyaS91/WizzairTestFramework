import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Katsiaryna_Skarzhyns on 3/2/2017.
 */
public class MainPage extends AbstractPage{

    private final String BASE_URL = "https://wizzair.com/ru-ru/main-page#";

    @FindBy(id= "search-departure-station")
    private WebElement inputOriginName;

    @FindBy(id = "search-arrival-station")
    private WebElement inputDestinationName;

    @FindBy (id = "search-departure-date")
    private WebElement departureDateName;

    @FindBy(id = "search-return-date")
    private WebElement returnDateName;

    @FindBy(xpath = "//*[@id=\"flight-search\"]/div/div/div/form/div[2]/button")
    private WebElement searchButton;

    @FindBy(xpath = "//*[@id=\"app\"]/header/div/nav/ul/li[3]/button")
    private WebElement loginButton;

    public MainPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    @Override
    public void openPage(){

        driver.navigate().to(BASE_URL);
    }

    public SearchResult createNewRoad(String origin, String destination, String departureDate, String returnDate){
        inputOriginName.sendKeys(origin);
        inputDestinationName.sendKeys(destination);
        departureDateName.sendKeys(departureDate); // пока не ясно как дату передать
        returnDateName.sendKeys(returnDate); //  возможно нужно написать метод отдельный, или хардкодом значение подходящего формата
        searchButton.click();
        // заглушка, пока в сигнатуре написано что возвращаеит стринг, по факту должно возвращать объект другого пайдж обджекта
        return null;
    }

    public void signIn(){
        loginButton.click();
    }


}