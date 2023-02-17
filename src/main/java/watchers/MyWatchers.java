package watchers;

import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import util.Screenshot;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyWatchers extends TestWatcher {
    Date date = new Date();
    SimpleDateFormat format = new SimpleDateFormat("HHmmss");
    @Override
    protected void succeeded(Description description) {
        Screenshot.takeScreen("Succeeded" + format.format(date));
    }
}
