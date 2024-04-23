package org;

import io.appium.java_client.AppiumBy;

public class cart extends baseClass {

    public cart() {
        this.driver = driver;
    }

    //actions
    public loginPage ProceedToCheckout() {
        driver.findElement(AppiumBy.accessibilityId("Proceed To Checkout button")).click();
        return new loginPage();
    }
}