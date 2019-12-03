package com.example.tbulavko.business.models;

/**
 * Created by Tatiana_Bulavko on 11/2/2019
 */
public class Customer implements TestData {

    private String login;
    private String password;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
