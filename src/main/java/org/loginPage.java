package org;

import io.appium.java_client.AppiumBy;

public class loginPage extends baseClass {
    public loginPage() {
        this.driver = driver;
    }

    public boolean emailInputBoxVisible() {
        return driver.findElement(AppiumBy.accessibilityId("Username input field")).isDisplayed();
    }

    public boolean passwordInputBoxVisible() {
        return driver.findElement(AppiumBy.accessibilityId("Login button")).isDisplayed();
    }

    //actions
    public loginPage emailInput(String email) {
        driver.findElement(AppiumBy.accessibilityId("Username input field")).sendKeys(email);
        return this;
    }

    public loginPage passwordInput(String password) {
        driver.findElement(AppiumBy.accessibilityId("Password input field")).sendKeys(password);
        return this;
    }

    public billingPage loginButton() throws InterruptedException {
        driver.findElement(AppiumBy.accessibilityId("Login button")).click();
        return new billingPage();
    }
}