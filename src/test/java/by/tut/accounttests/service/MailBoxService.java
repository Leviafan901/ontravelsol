package by.tut.accounttests.service;

import by.tut.accounttests.pages.MailBoxPage;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class MailBoxService extends AbstractService {

    private MailBoxPage page = new MailBoxPage();

    public void checkNoInboxMails() {
        assertThat(page.getInboxMessagesCountText().text(), equalTo("В папке «Входящие» нет писем."));
    }
}
