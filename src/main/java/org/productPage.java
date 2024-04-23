package org;

import io.appium.java_client.AppiumBy;

public class productPage extends baseClass {

    public productPage() {
        this.driver = driver;
    }


    public boolean addToCartButtonVisible() {
        return driver.findElement(AppiumBy.accessibilityId("Add To Cart button")).isDisplayed();
    }


    //actions
    public void addToCart() {

        driver.findElement(AppiumBy.accessibilityId("Add To Cart button")).click();
    }

    public cart cartButton() {
        driver.findElement(AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"cart badge\"]/android.widget.ImageView")).click();
        return new cart();
    }
}