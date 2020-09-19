package webdriver.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDriverCreator extends WebDriverCreator {

    @Override
    public WebDriver createWebDriver() {
        System.setProperty("webdriver.gecko.driver","Resource/geckodriver.exe");
        return new FirefoxDriver();
    }
}
