package util;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class PageUtil {
    public static void scrollToElementVisibilityOf(WebDriver element, By by) { //метод, который скролит до элемента
        JavascriptExecutor js = (JavascriptExecutor) element;
        boolean bool = false;
        while (!bool) { // цикл проверяет есть ли элемент, если на находит - скролит до тех пор, пока не найдет его
            try {
                element.findElement(by);
                bool = true;
            } catch (Exception ignore) {
                js.executeScript("window.scrollBy(0,50)");
            }
        }
    }
}
