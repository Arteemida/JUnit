package cases;

import configurations.BasicClass;
import data.PersonalInfo;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import pageObjects.MainPage;

public class PracticeForm extends BasicClass {
    static MainPage mainPage = PageFactory.initElements(driver, MainPage.class);

    @BeforeClass
    public static void mainURL() {
        driver.get("https://demoqa.com/automation-practice-form");
    }

    @Test
    public void testForm() {
        mainPage.FillingFields(new PersonalInfo());
    }
}
