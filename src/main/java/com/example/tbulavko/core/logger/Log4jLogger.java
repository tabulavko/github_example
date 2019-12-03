package com.example.tbulavko.core.logger;

import org.apache.log4j.PropertyConfigurator;

import java.io.File;
import java.io.IOException;

/**
 * Created by Tatiana_Bulavko on 11/2/2019
 */
public class Log4jLogger {
    private static org.apache.log4j.Logger log = org.apache.log4j.Logger.getLogger(Log4jLogger.class);
    private static final String L4JFILE = "\\src\\main\\resources\\log4j.properties";

    private static boolean isInitialized = initialization();

    /**
     * Set the Log4j configuration
     * @return true if initialized
     */
    private static boolean initialization(){
        if(!isInitialized){
            try {
                PropertyConfigurator.configure(new File( "" ).getCanonicalPath() + L4JFILE);
            } catch (IOException e) {
                e.printStackTrace();
            }
            return true;
        } else {
            return false;
        }
    }

    public static void info(String message) {
        log.info(message);
    }

    public static void error(String message) {
        log.error(message);
    }

    public static void fatal(String message) {
        log.fatal(message);
    }

    public static void debug(String message) {
        log.debug(message);
    }

    public static void warn(String message) {
        log.warn(message);
    }
}


