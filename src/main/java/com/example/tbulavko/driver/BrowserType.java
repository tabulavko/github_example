package com.example.tbulavko.driver;

import java.util.Arrays;

/**
 * Created by Tatiana_Bulavko on 11/2/2019
 */
public enum BrowserType {
    CHROME("chrome"),
    FIREFOX("firefox");

    private String name;

    BrowserType(String name) {
        this.name = name;
    }

    public static BrowserType getByValue(String value) {
        return Arrays.stream(BrowserType.values())
                .filter(br -> br.getName().equalsIgnoreCase(value)).findFirst()
                .orElseThrow(() -> new RuntimeException("Unsupported browser " + value));
    }

    public String getName() {
        return name;
    }
}
