package com.example.tbulavko.utils;

import java.util.ResourceBundle;

/**
 * Created by Tatiana_Bulavko on 11/2/2019
 */
public class PropertyReader {

    private static ResourceBundle resourceBundle;

    private PropertyReader() {
    }

    public static String getRunProperty(String key) {
        if (resourceBundle == null) {
            resourceBundle = ResourceBundle.getBundle("run");
        }
        return resourceBundle.getString(key);
    }
}
