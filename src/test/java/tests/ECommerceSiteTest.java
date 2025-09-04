package tests;

import com.automation.qabrains.pages.ECommerceSitePage;

import org.testng.Assert;
import org.testng.annotations.Test;
import tests.utils.Constant;

public class ECommerceSiteTest extends BaseTest {

    @Test(priority = 1)
    public void validLoginTest() {
        ECommerceSitePage eCommerceSitePage = new ECommerceSitePage(webDriver);

        eCommerceSitePage.clickECommerceSite();
        eCommerceSitePage.clickECommerceSiteLink();
        eCommerceSitePage.enterLoginEmail(Constant.E_login_username);
        eCommerceSitePage.enterLoginPassword(Constant.E_login_password);
        eCommerceSitePage.clickLogin();

    }
    @Test(priority = 2)
    public void addItemsToCartTest() throws InterruptedException {
        ECommerceSitePage eCommerceSitePage = new ECommerceSitePage(webDriver);

        eCommerceSitePage.clickAddToCartButton();
        eCommerceSitePage.clickCartIcon();
        eCommerceSitePage.clickCheckoutButton();
        eCommerceSitePage.enterFirstName(Constant.E_first_name);
        eCommerceSitePage.enterLastName(Constant.E_last_name);
        eCommerceSitePage.clickContinueButton();
        eCommerceSitePage.clickFinishButton();
        Thread.sleep(2000);
        Assert.assertEquals(  eCommerceSitePage.getSuccessMessage(), "THANK YOU FOR YOUR ORDER!");


    }
}
