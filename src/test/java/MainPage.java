import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

/**
 * Created by Katsiaryna_Skarzhyns on 3/2/2017.
 */
public class MainPage extends AbstractPage{

    private final String BASE_URL = "https://wizzair.com/ru-ru/main-page#";

    @FindBy(id= "search-departure-station")
    private WebElement inputOriginName;

    @FindBy(id = "search-arrival-station")
    private WebElement inputDestinationName;

    @FindBy(xpath = "//*[@id=\"search-departure-date\"]")
    private WebElement departureDateName;

    @FindBy(xpath = "//*[@id=\"search-return-date\"]")
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
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        inputDestinationName.sendKeys(destination);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        searchButton.click();
        return new SearchResult(driver);
    }

    public void signIn(){
        loginButton.click();
    }


}