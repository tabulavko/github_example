package com.example.tbulavko.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

/**
 * Created by Tatiana_Bulavko on 11/2/2019
 */
public class FirefoxWebDriverInitilizer extends AbstractWebDriverInitilizer {

    public WebDriver initDriver() {
        System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver.exe");
        FirefoxOptions firefoxOptions = new FirefoxOptions();
        return new FirefoxDriver(firefoxOptions);
    }
}
