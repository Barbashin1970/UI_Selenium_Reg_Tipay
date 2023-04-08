package data;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class ChangeBrowser {

        public static WebDriver getBrowser(String browserName) {
                switch (browserName) {

                        case "yandex":
                                System.setProperty("webdriver.chrome.driver", "/Users/olegbarbashin/DIPLOM/Diplom_3/src/main/resources/chromedriver_108");
                                // System.setProperty("webdriver.chrome.driver", "/Users/olegbarbashin/DIPLOM/Diplom_3/src/main/resources/chromedriver");
                                // для версии Яндекс-Браузер версии v.21.5.0.751 (Mac OS X Puma) chromedriver - версия 90.0.4430.24
                                ChromeOptions options = new ChromeOptions();
                                options.setBinary("/Applications/Yandex.app/Contents/MacOS/Yandex");
                                return new ChromeDriver(options);

                        case "firefox":
                                System.setProperty("webdriver.gecko.driver", "/Users/olegbarbashin/DIPLOM/Diplom_3/src/main/resources/geckodriver");
                                return new FirefoxDriver();

                        case "safari":
                                return new SafariDriver();

                        case "chromeWebDriverManager":
                                System.setProperty("webdriver.http.factory", "jdk-http-client");
                                WebDriverManager.chromedriver().setup();
                                return new ChromeDriver();

                        case "chromeNoManager":
                                System.setProperty("webdriver.http.factory", "jdk-http-client");
                                return new ChromeDriver();

                        default:
                                throw new RuntimeException("Ваш браузер пока не поддерживается - только Хром и Яндекс!");
                }
        }
}
