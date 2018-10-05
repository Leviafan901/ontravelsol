package by.tut.accounttests.service;

import by.tut.accounttests.pages.MailBoxPage;

import static com.codeborne.selenide.Condition.text;

public class MailBoxService extends AbstractService {

    private MailBoxPage page = new MailBoxPage();

    public void checkNoInboxMails() {
        page.getInboxMessagesCountText().shouldHave(text("В папке «Входящие» нет писем."));
    }
}
