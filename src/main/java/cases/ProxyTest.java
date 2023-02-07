package cases;

import configurations.BasicClass;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import util.LogsCollecting;

import java.util.logging.Level;

public class ProxyTest extends BasicClass {
   @BeforeClass
   public static void openYouTube() {
        driver.get("https://www.youtube.com");
    }
    @Test
    public void printURL() {
        System.out.println(driver.getCurrentUrl());
    }
    @AfterClass
    public static void printLogs(){
        LogsCollecting.logsInFile(driver,"YouTube", Level.ALL);
    }
}
