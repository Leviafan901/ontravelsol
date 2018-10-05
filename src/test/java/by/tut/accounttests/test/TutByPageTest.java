package by.tut.accounttests.test;

import by.tut.accounttests.data.CsvDataLoader;
import by.tut.accounttests.domain.UserAccount;
import by.tut.accounttests.service.MailBoxService;
import by.tut.accounttests.service.TutByService;
import com.codeborne.selenide.Configuration;
import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;

@Slf4j
@Test
public class TutByPageTest extends BaseTest {

    private UserAccount user;
    private TutByService tutByService = new TutByService();
    private MailBoxService mailBoxService = new MailBoxService();

    @BeforeClass
    public void setup() {
        user = CsvDataLoader.load("./src/test/resources/testaccountscsv.csv");
        log.info("Step 1. Load page with url https://tut.by.");
        open("https://www.tut.by/");
    }

    @Test
    public void shouldCheckMailInSentFolderAndReturnTrue() {
        log.info("Step 2. Login on tut.by page with next user account.");
        tutByService.logIn(user);
        log.info("Step 3. Click on auth user icon and click on \"Mail\" going to emailbox.");
        tutByService.goToEmailBox();
        log.info("Step 4. Check that email inbox is empty.");
        mailBoxService.checkNoInboxMails();
    }
}
