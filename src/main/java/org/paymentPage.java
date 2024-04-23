package org;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public class paymentPage extends baseClass {
    public paymentPage() throws InterruptedException {
        this.driver = driver;
        Thread.sleep(1000);
    }


    public boolean paymentFullNameVisible() {
        return driver.findElement(AppiumBy.accessibilityId("Full Name* input field")).isDisplayed();
    }

    public boolean cardnumberVisible() {
        return driver.findElement(AppiumBy.accessibilityId("Card Number* input field")).isDisplayed();
    }

    public boolean expireDateVisible() {
        return driver.findElement(AppiumBy.accessibilityId("Expiration Date* input field")).isDisplayed();
    }

    public boolean securityCodeVisble() {
        return driver.findElement(AppiumBy.accessibilityId("Security Code* input field")).isDisplayed();
    }

    public boolean myAddressSameCheckBoxVisible() {
        return driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"checkbox for My billing address is the same as my shipping address.\"]/android.view.ViewGroup/android.widget.ImageView")).isSelected();
    }

    public boolean reviewButtonVisible() {
        return driver.findElement(AppiumBy.accessibilityId("Review Order button")).isDisplayed();
    }

    //action
    public paymentPage paymentFullName(String name) {
        driver.findElement(AppiumBy.accessibilityId("Full Name* input field")).sendKeys(name);
        return this;
    }

    public paymentPage cardnumber(String cardNumber) {
        driver.findElement(AppiumBy.accessibilityId("Card Number* input field")).sendKeys(cardNumber);
        return this;
    }

    public paymentPage expireDate(String expiredate) {
        driver.findElement(AppiumBy.accessibilityId("Expiration Date* input field")).sendKeys(expiredate);
        return this;
    }

    public paymentPage securityCode(String code) {
        driver.findElement(AppiumBy.accessibilityId("Security Code* input field")).sendKeys(code);
        return this;
    }

    public placeOrderPage reiewButton() {
        driver.findElement(AppiumBy.accessibilityId("Review Order button")).click();
        return new placeOrderPage();
    }

}