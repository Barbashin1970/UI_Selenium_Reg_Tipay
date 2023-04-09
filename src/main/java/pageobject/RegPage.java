package pageobject;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RegPage {
    private final WebDriver driver;

    private static final By regOk = By.xpath(".//*[text()='Ваша заявка на регистрацию принята. Менеджер свяжется с Вами в ближайшее время.']");

    private static final By company = By.name("company");
    private static final By ogrn = By.name("ogrn");
    private static final By inn = By.name("inn");
    private static final By address = By.name("address");

    private static final By bik= By.name("bik");
    private static final By bank = By.name("bank");
    private static final By corr_account = By.name("corr_account");
    private static final By account = By.name("account");
    private static final By name = By.name("name");
    private static final By email = By.name("email");
    private static final By phone = By.name("tildaspec-phone-part[]");

    private static final By registerButton = By.xpath(".//*[text()='Регистрация']");

    public RegPage(WebDriver driver) {
        this.driver = driver;
    }
    // Вводим информацию о компании

    @Step("Вводим юридическое наименование компании на странице Регистрация")
    public void enterCompany(String company_) {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(company));
        driver.findElement(company).sendKeys(company_);
    }
    @Step("Вводим ОГРН компании на странице Регистрация")
    public void enterOgrn(String ogrn_) {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(ogrn));
        driver.findElement(ogrn).sendKeys(ogrn_);
    }
    @Step("Вводим ИНН компании на странице Регистрация")
    public void enterInn(String inn_) {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(inn));
        driver.findElement(inn).sendKeys(inn_);
    }
    @Step("Вводим адрес компании на странице Регистрация")
    public void enterAddress(String address_) {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(address));
        driver.findElement(address).sendKeys(address_);
    }
    @Step("Вводим БИК банка компании на странице Регистрация")
    public void enterBik(String bik_) {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(bik));
        driver.findElement(bik).sendKeys(bik_);
    }
    @Step("Вводим Название банка компании на странице Регистрация")
    public void enterBank(String bank_) {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(bank));
        driver.findElement(bank).sendKeys(bank_);
    }
    @Step("Вводим коррсчет банка компании на странице Регистрация")
    public void enterCorr(String corr_) {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(corr_account));
        driver.findElement(corr_account).sendKeys(corr_);
    }
    @Step("Вводим расчетный счет компании на странице Регистрация")
    public void enterAccount(String account_) {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(account));
        driver.findElement(account).sendKeys(account_);
    }
    @Step("Вводим имя представителя компании на странице Регистрация")
    public void enterName(String name_) {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(name));
        driver.findElement(name).sendKeys(name_);
    }
    @Step("Вводим email компании на странице Регистрация")
    public void enterEmail(String email_) {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(email));
        driver.findElement(email).sendKeys(email_);
    }
    @Step("Вводим телефон компании на странице Регистрация")
    public void enterPhone(String phone_) {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(phone));
        driver.findElement(phone).sendKeys(phone_);
    }
    @Step("Нажимаем кнопку Регистрация")
    public void clickRegButton() {
        driver.findElement(registerButton).click();
    }

    @Step("Проверяем что страница сменилась и появилось окно с сообщением о успешной регистрации")
    public void checkAnswer() {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfAllElementsLocatedBy(regOk));
        System.out.println(driver.findElement(regOk).getText());
    }

}
