package by.tut.accounttests.pages;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.$;

@Getter
public class MailBoxPage {

    private SelenideElement inboxMessagesCountText = $(".b-messages__placeholder-item");
}