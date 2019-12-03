package com.example.test;

import com.example.tbulavko.business.models.Customer;
import com.example.tbulavko.business.page.LoginPage;
import com.example.tbulavko.business.steps.LoginService;
import com.example.tbulavko.business.steps.NavigationService;
import com.example.tbulavko.core.BaseTest;
import com.example.tbulavko.core.logger.Log4jLogger;
import com.example.tbulavko.utils.JsonReader;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Tatiana_Bulavko on 11/2/2019
 */
public class LoginFormTest extends BaseTest {

    LoginService loginService;
    NavigationService navigationService;

    Customer customer;

    protected void preconditions() {
        //should be moved into testdata
        customer = new JsonReader().getCustomer("Default");
        loginService = new LoginService();
        navigationService = new NavigationService();
    }

    @Test
    public void test() {
        navigationService.open("https://www.w3schools.com/howto/");

        Log4jLogger.info("Step: Fill in customer's form");
        loginService.loginCustomer(customer, false);
        Log4jLogger.info("Step: Verify 'Login modal' is not visible");
        Assert.assertFalse("Login modal should not be visible!", new LoginPage().isLoginModalPresent());
    }
}
