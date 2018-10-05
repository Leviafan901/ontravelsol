package by.tut.accounttests.test;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.close;

@Test
public abstract class BaseTest {

    @BeforeSuite
    public static void config() {
        Configuration.browser = "chrome";
    }

    @AfterClass(alwaysRun = true, description = "close all drivers")
    public void teardown() {
        close();
    }
}
