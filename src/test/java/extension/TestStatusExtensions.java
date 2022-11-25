package extension;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestWatcher;

public class TestStatusExtensions implements TestWatcher {
    private static final Logger logger = LogManager.getLogger();

    public void testSuccessful(ExtensionContext context) {
        logger.info("Test başarılı şekilde geçmiştir.");
    }
     public void testFailed(ExtensionContext context, Throwable cause) {
         logger.error("Test başarısız olmuştur.");

     }
}
