package com.example.tbulavko.business.page;

import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.element.Button;

/**
 * Created by Tatiana_Bulavko on 11/2/2019
 */
public class LoginPage extends BasePage {

    @FindBy(css = "button[onclick*='id01'].w3-blue")
    Button loginButton;

    LoginModal loginModal;

    public LoginModal clickLoginButton() {
        loginButton.click();
        return loginModal;
    }

    public void typeLogin(String login) {
        loginModal.usernameInput.sendKeys(login);
    }

    public void typePassword(String password) {
        loginModal.passwordInput.sendKeys(password);
    }

    public void setRememberMeCheckbox(boolean isChecked) {
        loginModal.rememberMeCheckBox.set(isChecked);
    }

    public void submitForm() {
        loginModal.loginButton.click();
    }

    public Boolean isLoginModalPresent() {
        return loginModal.isDisplayed();
    }
}
