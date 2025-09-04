package com.automation.qabrains.base;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;
import java.util.Random;

public class BasePage {

    private final WebDriver webDriver;
    private final FluentWait<WebDriver> fluentWait;

    public BasePage(WebDriver webDriver) {
        this.webDriver = webDriver;
        this.fluentWait = new FluentWait<>(webDriver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoSuchElementException.class); // Ignore specific exceptions
    }


    protected WebElement waitUntilVisible(By locator) {
        return fluentWait.until(driver -> driver.findElement(locator));
    }


    protected String getText(By locator) {
        return waitUntilVisible(locator).getText();
    }

    protected void type(By locator, String text) {
        WebElement element = waitUntilVisible(locator);
        element.clear();
        element.sendKeys(text);
    }

    protected void click(By locator) {
        waitUntilVisible(locator).click();
    }
    protected void select(By locator, String item) {
        WebElement dropdown = webDriver.findElement(locator);
        Select select = new Select(dropdown);
        select.selectByValue(item);
    }

    protected void upload(By locator, String filePath) {
        WebElement fileInput = webDriver.findElement(locator);
        fileInput.sendKeys(filePath);
    }

    protected void addRandomProductToCart(By locator){
        List<WebElement> products = webDriver.findElements(locator);

        if (products.size() > 0) {
            Random rand = new Random();
            int randomIndex = rand.nextInt(products.size()); // random index
            products.get(randomIndex).click();
            System.out.println("Clicked Add to Cart for product index: " + randomIndex);
        } else {
            System.out.println("No products found on the page!");
        }
    }
}
