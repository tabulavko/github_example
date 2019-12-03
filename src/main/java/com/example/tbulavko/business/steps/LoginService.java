package com.example.tbulavko.business.steps;

import com.example.tbulavko.business.models.Customer;
import com.example.tbulavko.business.page.HomePage;
import com.example.tbulavko.business.page.LoginPage;

/**
 * Created by Tatiana_Bulavko on 11/2/2019
 */
public class LoginService {

    public void loginCustomer(Customer customer, boolean isRemember) {
        HomePage hp = new HomePage();
        hp.clickLoginFormLink();

        LoginPage lp = new LoginPage();
        lp.clickLoginButton();
        lp.typeLogin(customer.getLogin());
        lp.typePassword(customer.getPassword());
        lp.setRememberMeCheckbox(isRemember);
        lp.submitForm();
    }


}
