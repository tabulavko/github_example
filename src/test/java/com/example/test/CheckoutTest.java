package com.example.test;

import com.codeborne.selenide.Selenide;
import com.example.tbulavko.business.page.HomePage;
import com.example.tbulavko.business.steps.NavigationService;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Tatiana_Bulavko on 11/2/2019
 */
public class CheckoutTest{

    public static final String WWW_W_3_SCHOOLS_COM_HOWTO = "https://www.w3schools.com/howto/";
    NavigationService navigationService;

    @Test
    public void test() {

        String url = WWW_W_3_SCHOOLS_COM_HOWTO;
        Selenide.open(url);
        Assert.assertTrue(false);
        navigationService.open(url);

        new HomePage().clickCheckoutFormLink();
    }

}
