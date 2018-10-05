package by.tut.accounttests.pages;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.$;

@Getter
public class MailBoxPage {

    private SelenideElement inboxMessagesCountText = $("div.b-messages__placeholder-item");
}