package org;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;

public class baseClass {
    /**
     * THis is a base class
     */
    public static AppiumDriver driver = null;

    @BeforeTest

//    public void startApp(String appPath, String deviceName, String udid, String url) throws MalformedURLException {
    public void startApp() throws MalformedURLException {
        UiAutomator2Options capability = new UiAutomator2Options();
        capability.setPlatformName("Android")
                .setPlatformVersion("13")
//                .setDeviceName(deviceName)
                .setDeviceName("sdk_gphone64_x86_64")
//                .setUdid(udid)
                .setUdid("emulator-5554")
//                .setApp(appPath);
                .setApp("C:\\Users\\vchandru\\IdeaProjects\\mobileAutomation_ChandruV\\Apps\\Android-MyDemoAppRN.1.3.0.build-244.apk");
//        driver = new AndroidDriver(new URL(url), capability);
        driver = new AndroidDriver(new URL("http://0.0.0.0:4723"), capability);


    }

    //@AfterTest
    public void closeApp() {
        driver.quit();
    }


}