package Tests;

import Pages.AddRemPage;
import Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class AddRemoveTest extends BaseTest {
    public void TestAddRemove () throws InterruptedException {
        HomePage homePage = new HomePage(webDriver);
        homePage.clicLinkAddRem();

        AddRemPage addRemPage = new AddRemPage(webDriver);
        addRemPage.btnAddElement();
        Assert.assertEquals(addRemPage.isElementListEmpty(), false);
        addRemPage.btnRemoveElement();
        Assert.assertEquals(addRemPage.isElementListEmpty(), true);
    }

}
