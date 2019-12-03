package com.example.tbulavko.business.page;

import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.element.Button;
import ru.yandex.qatools.htmlelements.element.CheckBox;
import ru.yandex.qatools.htmlelements.element.HtmlElement;
import ru.yandex.qatools.htmlelements.element.TextInput;

/**
 * Created by Tatiana_Bulavko on 11/2/2019
 */
@FindBy(css = "#id01 .w3-modal-content")
public class LoginModal extends HtmlElement {

    @FindBy(css = "input[type=text]")
    TextInput usernameInput;

    @FindBy(css = "input[type=password]")
    TextInput passwordInput;

    @FindBy(css = "input[type=checkbox]")
    CheckBox rememberMeCheckBox;

    @FindBy(css = "button[onclick*='id01'].w3-green")
    Button loginButton;








}
