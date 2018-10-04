package by.tut.accounttests.pages;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.$;

@Getter
public class TutByPage {

    private SelenideElement userIcon = $("a.enter");
    private SelenideElement loginField = $("input[name=login]");
    private SelenideElement passwordField = $("input[name=password]");
    private SelenideElement submitButton = $("button auth__enter");
}
