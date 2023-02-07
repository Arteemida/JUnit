package pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class YouTube {
    @FindBy(xpath = "//input[@id='search']")
    WebElement youtubeSearchField;
    @FindBy(xpath = "//*[@id=\"search-icon-legacy\"]")
    WebElement searchIcon;

    public void youtubeInput(String str) {
        youtubeSearchField.click();
        youtubeSearchField.sendKeys(str);
        youtubeSearchField.sendKeys(Keys.ENTER);
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
