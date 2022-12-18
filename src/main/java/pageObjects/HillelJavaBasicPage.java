package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class HillelJavaBasicPage {
    @FindBy(className = "course-descriptor_header-text")
    WebElement title;
    @FindBy(className = "profession-bar_descr")
    WebElement description;

    @FindBy(className = "course-rating_average")
    WebElement rating;

    @FindBy(xpath = "//div[@class=\"introduction-info-redactor_section\"]")
    WebElement goalsList;

    public String getCourseTitle() {
        return title.getText();
    }

    public String getCourseDescription() {
        return description.getText();
    }

    public String getCourseRate() {
        return rating.getText();
    }

    public List<String> getCourseGoals() {
        List<String> goals = new ArrayList<>();
        List<WebElement> listWithGoals = (List<WebElement>) goalsList.findElements(By.tagName("li"));
        for (WebElement s : listWithGoals) {
            goals.add(s.getText());
        }
        return goals;
    }
}
