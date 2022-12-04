package configurations;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;

public class BasicClass {
    public static WebDriver driver;

    @BeforeClass
    public static void createDriver() {
        driver = DriversConfig.chooseBrowser(BrowsersList.CHROME);
    }

    @AfterClass
    public static void closeDriver() {
        DriversConfig.closeBrowser();
    }
}
