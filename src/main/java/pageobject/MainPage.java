package pageobject;


import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static data.UniformResourceLocator.BASE_URL;


public class MainPage {
    private static final By registerButtonMain = By.xpath(".//*[text()='Регистрация']");

    private final WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    @Step("Открываем главную страницу")
    public MainPage openMainPage() {
        driver.get(BASE_URL);
        return this;
    }
    @Step("Нажимаем кнопку Регистрация на главной странице")
    public void clickRegister() {
        driver.findElement(registerButtonMain).click();
    }


}