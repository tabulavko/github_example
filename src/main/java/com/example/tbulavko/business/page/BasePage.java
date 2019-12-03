package com.example.tbulavko.business.page;

import com.example.tbulavko.driver.WebDriverManager;
import org.openqa.selenium.support.PageFactory;
import ru.yandex.qatools.htmlelements.loader.decorator.HtmlElementDecorator;
import ru.yandex.qatools.htmlelements.loader.decorator.HtmlElementLocatorFactory;

/**
 * Created by Tatiana_Bulavko on 11/2/2019
 */
public abstract class BasePage {

    protected BasePage() {
        PageFactory.initElements(
                new HtmlElementDecorator(new HtmlElementLocatorFactory(WebDriverManager.getDriver())), this);
    }
}
