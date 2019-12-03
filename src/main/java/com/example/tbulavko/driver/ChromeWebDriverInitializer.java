package com.example.tbulavko.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * Created by Tatiana_Bulavko on 11/2/2019
 */
public class ChromeWebDriverInitializer extends AbstractWebDriverInitilizer {

    public WebDriver initDriver() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        return new ChromeDriver(options);
    }
}

