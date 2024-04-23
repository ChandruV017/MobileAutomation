package org;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class homePage extends baseClass {
    public homePage(AppiumDriver driver) throws InterruptedException {

        this.driver=driver;
        Thread.sleep(1000);
    }

//checks the product is visible.
    public boolean productVisible(){

        return driver.findElement(By.xpath("(//android.view.ViewGroup[@content-desc='store item'])[4]/android.view.ViewGroup[1]/android.widget.ImageView")).isDisplayed();
    }

//if true then this action will perform
    public productPage productSelect(){
        driver.findElement(By.xpath("(//android.view.ViewGroup[@content-desc='store item'])[4]/android.view.ViewGroup[1]/android.widget.ImageView")).click();
        return new productPage();
    }
}
