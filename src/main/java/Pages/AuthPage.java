package Pages;

import com.aventstack.extentreports.Status;
import helper.ScreenShotHelper;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class AuthPage extends BasePage {
    private By txtUserName = By.id("username");
    private By txtPassword = By.id("password");
    private By btnLogin = By.xpath("//button[@class='radius']");
    public AuthPage(WebDriver driver) {
        super(driver);
    }
    public void Login (String userName, String password) {
        driver.findElement(txtUserName).sendKeys(userName);
        driver.findElement(txtPassword).sendKeys(password);

    }
    public LogonPage clicBtnLogin (){
        driver.findElement(btnLogin).click();
        return new LogonPage(driver);
    }
}
