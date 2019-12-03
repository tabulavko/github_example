package com.example.tbulavko.business.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Tatiana_Bulavko on 11/2/2019
 */
public class CheckoutPage extends BasePage {

    @FindBy(xpath = "//p[contains(text(),'Total')]/span")
    WebElement total;

    @FindBy(className = "fa-shopping-cart")
    WebElement cartAmount;

    public String getCartAmount() {
        return cartAmount.getText();
    }

    public String getTotal() {
        return total.getText();
    }

}
