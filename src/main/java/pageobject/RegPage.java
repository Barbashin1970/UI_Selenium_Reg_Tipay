package pageobject;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegPage {
    private final WebDriver driver;
    // private static final By company = By.xpath(".//*[text()='company']");
    private static final By company = By.name("company");
    private static final By ogrn = By.name("ogrn");
    private static final By inn = By.name("inn");
    private static final By address = By.name("address");
    public RegPage(WebDriver driver) {
        this.driver = driver;
    }
    // Вводим информацию о компании
   /* $(byName("company")).shouldBe(enabled);
    $(byName("company")).setValue("ООО Super компания ABC");
    $(byName("ogrn")).shouldBe(enabled);
    $(byName("ogrn")).setValue("1234567890123");
    $(byName("inn")).shouldBe(enabled);
    $(byName("inn")).setValue("1234567890");
    $(byName("address")).shouldBe(enabled);
    $(byName("address")).setValue("Address of the Company");

    */


    @Step("Вводим юридическое наименование компании на странице Регистрация")
    public RegPage enterCompany(String name) {
        driver.findElement(company).isEnabled();
        driver.findElement(company).click();
        driver.findElement(company).sendKeys(name);
        return this;
    }
    @Step("Вводим ОГРН компании на странице Регистрация")
    public RegPage enterOgrn(String ogrn_) {
        driver.findElement(ogrn).isEnabled();
        driver.findElement(ogrn).click();
        driver.findElement(ogrn).sendKeys(ogrn_);
        driver.findElement(ogrn).click();
        return this;
    }
    @Step("Вводим ИНН компании на странице Регистрация")
    public void enterInn(String inn_) {
        driver.findElement(inn).isEnabled();
        driver.findElement(inn).click();
        driver.findElement(inn).sendKeys(inn_);
        driver.findElement(inn).click();
    }
    @Step("Вводим адрес компании на странице Регистрация")
    public void enterAddress(String address_) {
        driver.findElement(address).isEnabled();
        driver.findElement(address).click();
        driver.findElement(address).sendKeys(address_);
    }
/*
    @Step("Вводим e-mail на странице - Регистрация")
    public RegPage enterRegisterEmail(String email) {
        driver.findElement(registerEmail).click();
        driver.findElement(registerEmail).sendKeys(email);
        return this;
    }

    @Step("Вводим пароль на странице - Регистрация")
    public RegPage enterRegisterPassword(String password) {
        driver.findElement(registerPassword).click();
        driver.findElement(registerPassword).sendKeys(password);
        return this;
    }

 */




}
