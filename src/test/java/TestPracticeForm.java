import configurations.BasicClass;
import data.PersonalInfo;
import io.qameta.allure.Description;
import io.qameta.allure.junit4.DisplayName;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import pageObjects.MainPage;
import watchers.MyWatchers;
@DisplayName("DIANA OFITSEROVA")
public class TestPracticeForm extends BasicClass {
    static MainPage mainPage = PageFactory.initElements(driver, MainPage.class);
    @Rule
   public MyWatchers watchers = new MyWatchers();

    @BeforeClass
    public static void mainURL() {
        driver.get("https://demoqa.com/automation-practice-form");
    }

    @Test
    @Description("Filling out the QA Practice form with user data")
    public void formWithData() {
        mainPage.FillingFields(new PersonalInfo());
    }
    @Test
    System.out.println("Hello my dear. Good luck!")
}
