package cases;

import configurations.BasicClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import pageObjects.HillelJavaBasicPage;

public class JavaBasic extends BasicClass {
    static HillelJavaBasicPage javaCourse = PageFactory.initElements(driver, HillelJavaBasicPage.class);

    @BeforeClass
    public static void openHillelSite() {
        driver.get("https://ithillel.ua/courses/java-basic");
    }

    @Test
    public void courseInfo() {
        System.out.println(javaCourse.getCourseTitle());
        System.out.println(javaCourse.getCourseDescription());
        System.out.println(javaCourse.getCourseRate());
        System.out.println(javaCourse.getCourseGoals());

    }
}
