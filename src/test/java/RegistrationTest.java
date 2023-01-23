import org.junit.Test;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationTest {

    @Test
    public void checkCorrectData() {
        // создаём драйвер для браузера Chrome - по умолчанию
        // открываем страницу Заявки на регистрацию
        open("https://tipay-regform.tilda.ws/");

        // Вводим информацию о компании
        $(byName("company")).shouldBe(enabled);
        $(byName("company")).setValue("ООО Еще одна компания");
        $(byName("ogrn")).shouldBe(enabled);
        $(byName("ogrn")).setValue("1234567890123");
        $(byName("inn")).shouldBe(enabled);
        $(byName("inn")).setValue("1234567890");
        $(byName("address")).shouldBe(enabled);
        $(byName("address")).setValue("Address of the Company");

        // Вводим банковские реквизиты
        $(byName("bik")).shouldBe(enabled);
        $(byName("bik")).setValue("123456789");
        $(byName("bank")).shouldBe(enabled);
        $(byName("bank")).setValue("Name of the Bank for Test");
        $(byName("corr_account")).shouldBe(enabled);
        $(byName("corr_account")).setValue("30112345678901234567");
        $(byName("account")).shouldBe(enabled);
        $(byName("account")).setValue("12345678901234567890");

        // Вводим данные представителя компании
        $(byName("name")).shouldBe(enabled);
        $(byName("name")).setValue("The Name of the Person of Company");
        $(byName("email")).shouldBe(enabled);
        $(byName("email")).setValue("banksnab@gmail.com");
        $(byName("tildaspec-phone-part[]")).shouldBe(enabled);
        $(byName("tildaspec-phone-part[]")).setValue("1234567890");

        // Ставим чек-бокс согласия с политикой конфиденциальности
        $(byClassName("t-checkbox__indicator")).shouldBe(enabled);
        $(byClassName("t-checkbox__indicator")).click();

        // Жмём на кнопку Регистрация
        $(byClassName("t-submit")).shouldBe(enabled);
        $(byClassName("t-submit")).click();

        // Проверяем что страница сменилась и появилось окно с сообщением о успешной регистрации
        $(byText("Ваша заявка на регистрацию принята. Менеджер свяжется с Вами в ближайшее время.")).shouldBe(visible);
        System.out.println($(byText("Ваша заявка на регистрацию принята. Менеджер свяжется с Вами в ближайшее время.")).getText());
    }
}