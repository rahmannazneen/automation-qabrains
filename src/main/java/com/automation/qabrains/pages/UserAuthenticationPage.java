package com.automation.qabrains.pages;

import com.automation.qabrains.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserAuthenticationPage extends BasePage {


    // Locators
    private By emailField = By.id("email");
    private By passwordField = By.id("password");
    private By loginButton = By.xpath("//button[contains(text(),'Login')]");
    private By logoutButton = By.xpath("//button[normalize-space()='Logout']");
    private By successMsg = By.cssSelector("span.title.text-black.text-md");
    private By errorMsg = By.cssSelector("span.title.text-black.text-md");
    private By registrationLink = By.id("registration");
    private By forgotPasswordLink = By.id("forgot-password");

    private final By feedbackInput = By.cssSelector("textarea[placeholder='Write Comment...']");
    private final By submitButton = By.xpath("//button[normalize-space()='Submit']");
    private final By feedbackList = By.xpath("//div[contains(@class,'feedback-list')]//p");


    public UserAuthenticationPage(WebDriver driver) {
        super(driver);
    }

    public void enterLoginEmail(String username) {
        type(emailField, username);
    }

    public void enterLoginPassword(String password) {
        type(passwordField, password);
    }

    public void clickLogin() {
        click(loginButton);
    }

    public void clickLogout() {
        click(logoutButton);
    }


    public String getLoginSuccess() {
        return getText(successMsg);
    }

    public String getLoginError() {
        return getText(errorMsg);
    }

    public void clickRegistrationLink() {
        click(registrationLink);
    }

    public void clickForgotPasswordLink() {
        click(forgotPasswordLink);
    }

    public void enterFeedback(String message) {
        type(feedbackInput, message);
    }


    public void clickSubmitButton() {
        click(submitButton);
    }
}
