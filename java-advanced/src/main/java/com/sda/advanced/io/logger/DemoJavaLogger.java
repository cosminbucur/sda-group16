package com.sda.advanced.io.logger;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * SEVERE (highest)
 * WARNING
 * INFO
 * <p>
 * CONFIG
 * FINE
 * FINER
 * FINEST
 */
public class DemoJavaLogger {

    // java logger
    // log4j
    // slf4j
    // logback

    // get logger
    private static final Logger logger = Logger.getLogger(DemoJavaLogger.class.getName());

    // use logger
    public static void main(String[] args) {
        System.out.println("some sever message");
        logger.severe("some severe message");
        logger.warning("some warning message");
        logger.info("some info message");

        List<String> names = Arrays.asList("ana", "alex", "adi");

        // processing [number of names] names
        logger.log(Level.INFO, "processing {0} names", names.size());

        // for each name log [index]: [name]
        for (int i = 0; i < names.size(); i++) {
            logger.log(Level.INFO, "processing {0}: {1}", new Object[]{i, names.get(i)});
        }
    }
}
