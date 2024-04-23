package org;

import io.appium.java_client.AppiumBy;

public class placeOrderPage extends baseClass {

    public placeOrderPage() {
        this.driver = driver;
    }

    public checkoutPage placeOrderButton() {
        driver.findElement(AppiumBy.accessibilityId("Place Order button")).click();
        return new checkoutPage();
    }
}