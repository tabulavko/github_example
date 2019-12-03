package com.example.test;

import com.codeborne.selenide.Selenide;
import com.example.tbulavko.business.page.HomePage;
import com.example.tbulavko.business.steps.LoginService;
import com.example.tbulavko.business.steps.NavigationService;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Tatiana_Bulavko on 11/2/2019
 */
public class CheckoutTest{

    LoginService loginService;
    NavigationService navigationService;

    @Test
    public void test() {

        Selenide.open("https://www.w3schools.com/howto/");
        Assert.assertTrue(false);
        navigationService.open("https://www.w3schools.com/howto/");

        new HomePage().clickCheckoutFormLink();
    }

}
