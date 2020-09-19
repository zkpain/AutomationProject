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

public class CheckPage extends BasePage {
    private By check1 = By.xpath("//body//input[1]");
    private By check2 = By.xpath("//body//input[2]");
    public CheckPage(WebDriver driver) {
        super(driver);
    }
    public void checkUnCheck(){
        driver.findElement(check1).click();
        ScreenShotHelper.takeScreenShotAndAdToHTMLReport(driver, Status.INFO, "FirstCheck");
        driver.findElement(check2).click();
        ScreenShotHelper.takeScreenShotAndAdToHTMLReport(driver, Status.INFO, "SecondUnCheck");
    }
}
