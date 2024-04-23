package org;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class checkoutPage extends baseClass {
    public checkoutPage() {
    }

    public void screenShot(String fileName) throws IOException {
        WebElement pageSS = driver.findElement(AppiumBy.xpath("//android.widget.ScrollView"));
        File screenshot = pageSS.getScreenshotAs(OutputType.FILE);
        File path = new File("./imgs/" + fileName + ".png");
        FileHandler.copy(screenshot, path);
    }
}