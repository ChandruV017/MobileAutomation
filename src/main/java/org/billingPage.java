package org;

import io.appium.java_client.AppiumBy;

public class billingPage extends baseClass {

    public billingPage() throws InterruptedException {
        this.driver = driver;
        Thread.sleep(1000);
    }


    public boolean fullnameVisible() {
        return driver.findElement(AppiumBy.accessibilityId("Full Name* input field")).isDisplayed();
    }

    public boolean addressLine1visible() {
        return driver.findElement(AppiumBy.accessibilityId("Address Line 1* input field")).isDisplayed();
    }

    public boolean addressLine2Visible() {
        return driver.findElement(AppiumBy.accessibilityId("Address Line 2 input field")).isDisplayed();
    }

    public boolean cityVisibile() {
        return driver.findElement(AppiumBy.accessibilityId("City* input field")).isDisplayed();
    }

    public boolean stateVisible() {
        return driver.findElement(AppiumBy.accessibilityId("State/Region input field")).isDisplayed();
    }

    public boolean zipcodeVisible() {
        return driver.findElement(AppiumBy.accessibilityId("Zip Code* input field")).isDisplayed();
    }

    public boolean countryVisible() {
        return driver.findElement(AppiumBy.accessibilityId("Country* input field")).isDisplayed();
    }

    public boolean paymentButtonVisible() {
        return driver.findElement(AppiumBy.accessibilityId("To Payment button")).isDisplayed();
    }

    //actions
    public billingPage fullname(String name) {
        driver.findElement(AppiumBy.accessibilityId("Full Name* input field")).sendKeys(name);
        return this;
    }

    public billingPage addressLine1(String addressLine1) {
        driver.findElement(AppiumBy.accessibilityId("Address Line 1* input field")).sendKeys(addressLine1);
        return this;
    }

    public billingPage addressLine2(String addressLine2) {
        driver.findElement(AppiumBy.accessibilityId("Address Line 2 input field")).sendKeys(addressLine2);
        return this;

    }

    public billingPage city(String cityName) {
        driver.findElement(AppiumBy.accessibilityId("City* input field")).sendKeys(cityName);
        return this;
    }

    public billingPage stateRegion(String stateName) {
        driver.findElement(AppiumBy.accessibilityId("State/Region input field")).sendKeys(stateName);
        return this;
    }

    public billingPage zipcode(String zipcode) {
        driver.findElement(AppiumBy.accessibilityId("Zip Code* input field")).sendKeys(zipcode);
        return this;
    }

    public billingPage country(String countryName) {
        driver.findElement(AppiumBy.accessibilityId("Country* input field")).sendKeys(countryName);
        return this;
    }

    public paymentPage payamentButton() throws InterruptedException {
        driver.findElement(AppiumBy.accessibilityId("To Payment button")).click();
        return new paymentPage();
    }
}