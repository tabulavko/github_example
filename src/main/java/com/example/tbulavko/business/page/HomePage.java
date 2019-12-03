package com.example.tbulavko.business.page;

import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.element.Link;

/**
 * Created by Tatiana_Bulavko on 11/2/2019
 */
public class HomePage extends BasePage {

    @FindBy(css = "h2 a[href='howto_css_login_form.asp']")
    Link loginFormLink;

    @FindBy(css = "h2 a[href='howto_css_checkout_form.asp']")
    Link checkoutFormLink;

    public void clickLoginFormLink() {
        loginFormLink.click();
    }

    public void clickCheckoutFormLink() {
        checkoutFormLink.click();
    }


}
