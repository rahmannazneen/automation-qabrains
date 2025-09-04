package com.automation.qabrains.pages;

import com.automation.qabrains.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ECommerceSitePage extends BasePage {


    private final By emailField = By.id("email");
    private final By passwordField = By.id("password");
    private final By loginButton = By.xpath("//button[contains(text(),'Login')]");
    private final By addToCartButton = By.xpath("//button[contains(text(),'Add to cart')]");
    private final By cartIcon = By.xpath("//span//*[name()='svg']");
    private final By checkoutButton = By.xpath("//button//span[text()='Checkout']");
    private final By firstNameInput = By.cssSelector("input[placeholder='Ex. John']");
    private final By lastNameInput = By.cssSelector("input[placeholder='Ex. Doe']");
    private final By continueButton = By.xpath("//button[.//span[text()='Continue']]");
    private final By finishButton = By.xpath("//button[.//span[text()='Finish']]");
    private final By successMessage = By.cssSelector("h3.text-lg.uppercase.font-black.font-oswald.mb-4");



    public ECommerceSitePage(WebDriver driver) {
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

    public void clickAddToCartButton() {
        click(addToCartButton);
    }

    public void clickCartIcon() {
        click(cartIcon);
    }

    public void clickCheckoutButton() {
        click(checkoutButton);
    }

    public void enterFirstName(String firstName) {
        type(firstNameInput, firstName);
    }

    public void enterLastName(String lastName) {
        type(lastNameInput, lastName);
    }
    public void clickContinueButton() {
        click(continueButton);
    }
    public void clickFinishButton() {
        click(finishButton);
    }
    public String getSuccessMessage() {
        return getText(successMessage);
    }
}



