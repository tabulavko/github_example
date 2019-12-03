package com.example.tbulavko.core.logger;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SimpleReport;

/**
 * Created by Tatiana_Bulavko on 11/4/2019
 */
public class CustomReport extends SimpleReport {

    @Override
    public void finish(String text) {
        super.finish(text);
        Selenide.screenshot("test");
    }


}
