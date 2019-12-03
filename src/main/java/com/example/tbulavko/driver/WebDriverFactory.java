package com.example.tbulavko.driver;

/**
 * Created by Tatiana_Bulavko on 11/2/2019
 */
public class WebDriverFactory {

    public static AbstractWebDriverInitilizer getWebDriverInitializer(BrowserType browserType) {
        switch (browserType) {
            case CHROME:
                return new ChromeWebDriverInitializer();
            case FIREFOX:
                return new FirefoxWebDriverInitilizer();
            default:
                throw new IllegalArgumentException("No supported browser: " + browserType);
        }
    }
}
