package com.example.tbulavko.business.steps;

import com.example.tbulavko.driver.WebDriverManager;

/**
 * Created by Tatiana_Bulavko on 11/2/2019
 */
public class NavigationService {

    public void open(String url) {
        WebDriverManager.getDriver().navigate().to(url);
        WebDriverManager.getDriver().manage().window().maximize();
    }

}
