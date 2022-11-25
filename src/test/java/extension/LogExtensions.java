package extension;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.extension.AfterEachCallback;
import org.junit.jupiter.api.extension.BeforeEachCallback;
import org.junit.jupiter.api.extension.ExtensionContext;


public class LogExtensions implements BeforeEachCallback, AfterEachCallback {
    private static final Logger logger = LogManager.getLogger();
    @Override
    public void beforeEach(ExtensionContext extensionContext) throws Exception {
        logger.info("BeforeEach extensions'a girdi.");

    }

    @Override
    public void afterEach(ExtensionContext extensionContext) throws Exception {
        logger.info("AfterEach extensions'a girdi.");


    }
}