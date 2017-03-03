import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by Katsiaryna_Skarzhyns on 3/3/2017.
 */
public class WizzAirAutomationFramework {

    private TestsFramework testsFramework;

    @BeforeMethod(description = "Init browser")
    public void setUp() {
        testsFramework = new TestsFramework();
        testsFramework.initBrowser();
    }

    @Test
    public void openPage() {
        testsFramework.xxx();
    }
}
