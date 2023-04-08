package pageobject;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegPage {
    private final WebDriver driver;
    // private static final By company = By.xpath(".//*[text()='company']");
    private static final By company = By.name("company");
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


    @Step("Вводим данные компании на странице Регистрация")

    public void enterCompany(String name) {
        driver.findElement(company).isEnabled();
        driver.findElement(company).click();
        driver.findElement(company).sendKeys(name);
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
