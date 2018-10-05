package by.tut.accounttests.service;

import by.tut.accounttests.pages.TutByPage;
import by.tut.accounttests.domain.UserAccount;

public class TutByService extends AbstractService {

    private TutByPage page = new TutByPage();

    public void logIn(UserAccount account) {
        clickElement(page.getUserIcon());
        setElementText(page.getLoginField(), account.getLogin());
        setElementText(page.getPasswordField(), account.getPassword());
        clickElement(page.getSubmitButton());
    }

    public void goToEmailBox() {
        clickElement(page.getAuthUserIcon());
        clickElement(page.getEmailRow());
    }
}
