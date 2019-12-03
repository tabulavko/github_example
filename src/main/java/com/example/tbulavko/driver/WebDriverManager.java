package com.example.tbulavko.driver;

import com.example.tbulavko.core.logger.Log4jLogger;
import com.example.tbulavko.utils.PropertyReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

/**
 * Created by Tatiana_Bulavko on 11/2/2019
 */
public class WebDriverManager {

    private static WebDriver driver;

    private WebDriverManager() {

    }

    public static WebDriver getDriver() {
        if (driver == null) {
            BrowserType type = BrowserType.getByValue(PropertyReader.getRunProperty("browser"));
            driver = WebDriverFactory.getWebDriverInitializer(type).initDriver();
        }
        return driver;
    }

    public static void destroyDriver() {
        try {
            if (driver != null) {
                driver.manage().deleteAllCookies();
                driver.quit();
            }
        } catch (WebDriverException e) {
            Log4jLogger.fatal("WebDriver can not be closed!" + e);
        }
    }
}