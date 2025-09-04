package tests;

import com.automation.qabrains.pages.UserAuthenticationPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.utils.Constant;

public class UserAuthenticationTest extends BaseTest {

    @Test(priority = 1)
    public void validLoginTest() throws InterruptedException {
        UserAuthenticationPage userAuthenticationPage = new UserAuthenticationPage(webDriver);

        userAuthenticationPage.enterLoginEmail(Constant.login_username);
        userAuthenticationPage.enterLoginPassword(Constant.login_password);
        userAuthenticationPage.clickLogin();
        Assert.assertEquals(userAuthenticationPage.getLoginSuccess(), "Login Successful");
        Thread.sleep(2000);
        userAuthenticationPage.clickLogout();
        Thread.sleep(2000);
    }

    @Test(priority = 2)
    public void invalidLoginTest() throws InterruptedException {
        UserAuthenticationPage userAuthenticationPage = new UserAuthenticationPage(webDriver);

        userAuthenticationPage.enterLoginEmail(Constant.wrong_login_username);
        userAuthenticationPage.enterLoginPassword(Constant.wrong_login_password);
        userAuthenticationPage.clickLogin();
        Assert.assertEquals(userAuthenticationPage.getLoginError(), "Your email and password both are invalid!");
        Thread.sleep(2000);
    }

    @Test(priority = 3)
    public void navigateLinksTest()  {
        UserAuthenticationPage userAuthenticationPage = new UserAuthenticationPage(webDriver);
        userAuthenticationPage.clickRegistrationLink();
        userAuthenticationPage.clickForgotPasswordLink();

    }
}
