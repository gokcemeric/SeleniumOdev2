package extension;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Optional;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestWatcher;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

public class ScreenshotsExtensions implements TestWatcher {

/**
 * @RegisterExtension
 * ScreenshotsExtensions watcher = new ScreenshotsExtensions(driver, "target/surefire-reports");
 *
 */
    public static WebDriver driver;
    public static String path;

    public static void setDriver(WebDriver driver, String path) {
        ScreenshotsExtensions.driver = driver;
        ScreenshotsExtensions.path = path;
    }


    @Override
    public void testFailed(ExtensionContext context, Throwable throwable) {
        // do something
        captureScreenshot(driver, context.getDisplayName());
    }

    @Override
    public void testSuccessful(ExtensionContext extensionContext) {
        // do something
    }

    public void captureScreenshot(WebDriver driver, String fileName) {
        try {
            new File(path).mkdirs();
            try ( FileOutputStream out = new FileOutputStream(path + File.separator + "screenshot-" + fileName + ".png")) {
                out.write(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES));
            }
        } catch (IOException | WebDriverException e) {
            System.out.println("screenshot failed:" + e.getMessage());
        }
    }

}
