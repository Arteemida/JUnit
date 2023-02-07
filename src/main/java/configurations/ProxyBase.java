package configurations;

import configurations.proxyConfig.UserAgent;
import configurations.proxyConfig.UserAgentConfig;
import net.lightbody.bmp.BrowserMobProxyServer;
import net.lightbody.bmp.core.har.Har;
import net.lightbody.bmp.core.har.HarEntry;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import util.Screenshot;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;


public class ProxyBase extends BasicClass {
    public static BrowserMobProxyServer serverBase;

    @BeforeClass
    static public void startProxy() {
        serverBase.newHar("youtube");
       UserAgentConfig.createUserAgent(UserAgent.RU,serverBase);
    }
    @AfterClass
    static public void stopProxy() throws IOException {
       String timeStamp = new SimpleDateFormat("MMdd_HHmmss").format(Calendar.getInstance().getTime());
//        Har har = serverBase.getHar();
//        har.writeTo(new File("Doc" +timeStamp +".har"));
        serverBase.stop();
        Screenshot.takeScreen(driver, "Screenshot "+timeStamp);
    }
}
