package Pages;

import com.aventstack.extentreports.Status;
import helper.ScreenShotHelper;
import org.openqa.selenium.*;

public class CheckPage extends BasePage {
    private By check1 = By.xpath("//body//input[1]");
    private By check2 = By.xpath("//body//input[2]");
    public CheckPage(WebDriver driver) {
        super(driver);
    }
    public void check(){
        driver.findElement(check1).click();
        ScreenShotHelper.takeScreenShotAndAdToHTMLReport(driver, Status.INFO, "FirstCheck");
    }

    public void unCheck(){
        driver.findElement(check2).click();
        ScreenShotHelper.takeScreenShotAndAdToHTMLReport(driver, Status.INFO, "SecondUnCheck");
    }

    public boolean verifyCheck1() {
        return driver.findElement(check1).isSelected();
    }

    public boolean verifyCheck2() {
        return driver.findElement(check2).isSelected();
    }
}
