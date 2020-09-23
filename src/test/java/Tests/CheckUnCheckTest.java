package Tests;

import Pages.CheckPage;
import Pages.HomePage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckUnCheckTest extends BaseTest {
    @Test
    public void CheckUnCheck () {
        HomePage homePage = new HomePage(webDriver);
        homePage.clicLinkCheck();
        CheckPage checkPage = new CheckPage(webDriver);
        checkPage.check();
        Assert.assertEquals(checkPage.verifyCheck1(), true);
        checkPage.unCheck();
        Assert.assertEquals(checkPage.verifyCheck2(), false);
    }

}
