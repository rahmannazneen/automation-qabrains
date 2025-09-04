package com.automation.qabrains.pages;

import com.automation.qabrains.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class FormSubmissionPage extends BasePage {

    private WebDriver driver;
    private By formSubmissionTab = By.id("form-submission");
    private By nameField = By.id("name");
    private By emailField = By.id("email");
    private By contactField = By.id("contact");
    private By dateField = By.id("date");
    private By fileField = By.id("file");
    private By color = By.id("Red");
    private By food = By.id("Pasta");
    private By countryDropdown = By.id("country");
    private By submitButton = By.cssSelector("button[type='submit']");
    private By successMsg =By.cssSelector("span.title.text-black.text-md");
    private By errorMsg =By.xpath("//p[normalize-space()='Country is a required field']");;


    public FormSubmissionPage(WebDriver driver) {
        super(driver);
    }

    public void clickFormSubmissionTab() {
        click(formSubmissionTab);
    }

    public void enterName(String name) {
        type(nameField, name);
    }

    public void enterEmail(String email) {
        type(emailField, email);
    }

    public void enterContact(String contact) {
        type(contactField, contact);
    }

    public void enterDate(String date) {
        type(dateField, date);
    }

    public void uploadFile(String file) {
        upload(fileField, file);
    }

    public void selectColor() {
        click(color);
    }

    public void selectFood() {
        click(food);
    }


    public void selectCountry(String country) {
        select(countryDropdown, country);
    }

    public void clickSubmitButton() {
        click(submitButton);
    }

    public String getFormSuccess() {
        return getText(successMsg);
    }
    public String getFormError() {
        return getText(errorMsg);
    }
}

