package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;

public class LogsCollecting {
    public static void collectLogs(WebDriver driver) {
        LogEntries logEntries = driver.manage().logs().get(LogType.BROWSER);
        for (LogEntry entry : logEntries) {
            System.out.println(new Date(entry.getTimestamp()) + " " + entry.getLevel() + " " + entry.getMessage());
        }
    }

    public static void logsInFile(WebDriver driver, String fileName, Level level) {
        LogEntries logEntries = driver.manage().logs().get(LogType.BROWSER);
        String timeStamp = new SimpleDateFormat("MMdd_HHmmss").format(Calendar.getInstance().getTime());
        File save = new File(fileName + "_" + timeStamp + ".log");
        FileWriter out = null;
        try {
            out = new FileWriter(save);
            for (LogEntry logEntry : logEntries) {
                if (logEntry.getLevel().getName().equals(level.getName().toUpperCase()) || level.getName().toUpperCase().equals("ALL")) {
                    out.write(logEntry.toString() + "\n");

                }
            }
            out.flush();
            out.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}