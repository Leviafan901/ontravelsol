package by.tut.accounttests.service;

import com.codeborne.selenide.SelenideElement;

public class AbstractService {

    protected void clickElement(SelenideElement element){
        element.click();
    }

    protected void setElementText(SelenideElement element, String text){
        element.clear();
        element.sendKeys(text);
    }
}
