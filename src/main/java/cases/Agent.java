package cases;

import configurations.ProxyBase;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import pageObjects.YouTube;

public class Agent extends ProxyBase {
    YouTube youTubePage = PageFactory.initElements(driver, YouTube.class);

    @Before
    public void startYouTube() {
        driver.get("https://www.youtube.com/");
    }

    @Test
    public void agent() {
        youTubePage.youtubeInput("no war");
    }
}
