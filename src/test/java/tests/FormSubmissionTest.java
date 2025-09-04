package tests;

import com.automation.qabrains.pages.FormSubmissionPage;

import org.testng.Assert;
import org.testng.annotations.Test;
import tests.utils.Constant;


public class FormSubmissionTest extends BaseTest {

    @Test(priority = 1)
    public void validFormTest() throws InterruptedException {
        FormSubmissionPage formSubmissionPage = new FormSubmissionPage(webDriver);

        formSubmissionPage.clickFormSubmissionTab();
        formSubmissionPage.enterName(Constant.name);
        formSubmissionPage.enterEmail(Constant.email);
        formSubmissionPage.enterContact(Constant.contact);
        formSubmissionPage.enterDate(Constant.date);
        Thread.sleep(2000);
        formSubmissionPage.uploadFile(Constant.file);
        formSubmissionPage.selectColor();
        formSubmissionPage.selectFood();
        formSubmissionPage.selectCountry(Constant.countryName);
        Thread.sleep(2000);
        formSubmissionPage.clickSubmitButton();
        Assert.assertEquals(formSubmissionPage.getFormSuccess(), "Form submit successfully.");
    }

    @Test(priority = 2)
    public void invalidFormTest() throws InterruptedException {
        FormSubmissionPage formSubmissionPage = new FormSubmissionPage(webDriver);

        formSubmissionPage.clickFormSubmissionTab();
        formSubmissionPage.enterName(Constant.name);
        formSubmissionPage.enterEmail(Constant.email);
        formSubmissionPage.enterContact(Constant.contact);
        formSubmissionPage.enterDate(Constant.date);
        Thread.sleep(2000);
        formSubmissionPage.uploadFile(Constant.file);
        formSubmissionPage.selectColor();
        formSubmissionPage.selectFood();
        Thread.sleep(2000);
        formSubmissionPage.clickSubmitButton();
        Assert.assertEquals(formSubmissionPage.getFormError(), "Country is a required field");


    }
}
