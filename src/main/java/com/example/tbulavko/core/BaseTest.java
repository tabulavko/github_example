package com.example.tbulavko.core;

import com.example.tbulavko.driver.WebDriverManager;
import org.junit.After;
import org.junit.Before;

/**
 * Created by Tatiana_Bulavko on 11/2/2019
 */
public abstract class BaseTest {

    @Before
    public void initTest() {
        WebDriverManager.getDriver();
        preconditions();
    }

    @After
    public void tearDown() {
        WebDriverManager.destroyDriver();
    }

    protected void preconditions() {
        //override to implement
    }
}
