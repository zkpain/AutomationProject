package Pages;

import com.aventstack.extentreports.Status;
import helper.ScreenShotHelper;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;

public class AddRemPage extends BasePage {
    private By addElement  = By.xpath("//button[@onclick='addElement()']");
    private By removeElement = By.xpath("//button[@onclick='deleteElement()']");
    public AddRemPage(WebDriver driver) {
        super(driver);
    }
    public void btnAddRemoveElement(){
        WebDriverWait wait=new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(addElement)));
        driver.findElement(addElement).click();
        ScreenShotHelper.takeScreenShotAndAdToHTMLReport(driver, Status.INFO, "Add Element");

        wait.until(ExpectedConditions.visibilityOf(driver.findElement(removeElement)));
        driver.findElement(removeElement).click();
        ScreenShotHelper.takeScreenShotAndAdToHTMLReport(driver, Status.INFO, "Remove Element");

    }
}
