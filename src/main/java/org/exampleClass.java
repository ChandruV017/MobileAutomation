package org;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.sun.org.apache.xerces.internal.xpointer.XPointerHandler;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class exampleClass {

    protected static AppiumDriver driver;

    @Test
    public void mobielExampleTests() throws MalformedURLException {
        UiAutomator2Options capability = new UiAutomator2Options();
        capability.setPlatformName("Android");
        capability.setPlatformVersion("13");
        capability.setDeviceName("sdk_gphone64_x86_64");
        capability.setApp("C:\\Users\\vchandru\\IdeaProjects\\mobileAutomation_ChandruV\\Apps\\Android-MyDemoAppRN.1.3.0.build-244.apk");

        driver = new AndroidDriver(new URL("http://0.0.0.0:4723"), capability);


        //TODO: Appium Inspector NOT working....
        driver.findElement(AppiumBy.accessibilityId("")).click();

        driver.findElement(By.id(""));
        driver.findElement(By.xpath(""));


        //TODO:Extent Roport

        ExtentSparkReporter reporter = new ExtentSparkReporter("./Reports/report1.com");
        ExtentReports repotes = new ExtentReports();
        repotes.attachReporter(reporter);

        ExtentTest test = repotes.createTest("TC0001");

        //we can use test for further use


    }
}
