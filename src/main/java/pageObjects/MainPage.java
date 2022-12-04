package pageObjects;

import data.PersonalInfo;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage {
    @FindBy(id = "firstName")
    WebElement firstName;
    @FindBy(id = "lastName")
    WebElement lastName;
    @FindBy(id = "userEmail")
    WebElement email;
    @FindBy(id = "userNumber")
    WebElement phone;
    @FindBy(id = "subjectsInput")
    WebElement subject;

    public void FillingFields(PersonalInfo user) {
        firstName.sendKeys(user.getFistName());
        lastName.sendKeys(user.getLastName());
        email.sendKeys(user.getEmail());
        phone.sendKeys(user.getPhone());
        subject.sendKeys(user.getSubject());
        subject.sendKeys(Keys.ENTER);
    }
}
