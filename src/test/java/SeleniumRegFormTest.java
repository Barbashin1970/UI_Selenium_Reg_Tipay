import data.ChangeBrowser;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pageobject.MainPage;
import pageobject.RegPage;

import java.time.Duration;

import static data.RandomCompany.*;
import static data.UniformResourceLocator.*;


public class SeleniumRegFormTest {
    @Test
    public void registerDataTest() throws InterruptedException {
        //WebDriver driver = ChangeBrowser.getBrowser(CHROME_WDM);
        //WebDriver driver = ChangeBrowser.getBrowser(CHROME);
        WebDriver driver = ChangeBrowser.getBrowser(YANDEX);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        MainPage mainPage = new MainPage(driver);
        mainPage.openMainPage()
                .clickRegister();

        RegPage regPage = new RegPage(driver);
        regPage.enterCompany(COMPANY);
        regPage.enterOgrn(OGRN);
        regPage.enterInn(INN);
        regPage.enterAddress(ADDRESS);
        regPage.enterBik(BIK);
        regPage.enterBank(BANK);
        regPage.enterCorr(CORR);
        regPage.enterAccount(ACCOUNT);
        regPage.enterName(NAME);
        regPage.enterEmail(EMAIL);
        regPage.enterPhone(PHONE);

        regPage.clickRegButton();
        Thread.sleep(2000);
        // checkAnswer();
        driver.quit();
    }
}
