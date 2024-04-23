package org.mobileAutomation.testCasses;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.*;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.baseClass.driver;

public class TestCase {

    @Test
    public void TC0001() throws IOException, InterruptedException {

        ExtentSparkReporter reporter = new ExtentSparkReporter("./Reports/report1.html");
        ExtentReports reports = new ExtentReports();
        reports.attachReporter(reporter);
        ExtentTest test = reports.createTest("TC001-Add TO Cart");
        test.assignAuthor("Chandru V");
//HomePage

        homePage hp = new homePage(driver);
        hp.startApp();
        boolean b = hp.productVisible();
        Assert.assertTrue(b);
        test.pass("Product Is Visible");
        hp.productSelect();

        //Product Page
        productPage pp = new productPage();
        boolean b1 = pp.addToCartButtonVisible();
        Assert.assertTrue(b1);
        test.pass("Add To Cart Button is visible");

        pp.addToCart();
        pp.cartButton();


//cartpage
        cart c = new cart();
        c.ProceedToCheckout();


        //loginpage
        loginPage lp = new loginPage();
        boolean b4 = lp.emailInputBoxVisible();
        Assert.assertTrue(b4);
        test.pass("email Input Box is Visible");

        boolean b5 = lp.passwordInputBoxVisible();
        Assert.assertTrue(b5);
        test.pass("password input box in visible");

        lp.emailInput("bob@example.com");
        lp.passwordInput("10203040").loginButton();

//Billing Page
        billingPage bp = new billingPage();
        boolean b6 = bp.fullnameVisible();
        Assert.assertTrue(b6);
        test.pass("Full Name enter input box in visible");

        boolean b7 = bp.addressLine1visible();
        Assert.assertTrue(b7);
        test.pass("Address Line 1 Input Box in visible");

        boolean b8 = bp.addressLine2Visible();
        Assert.assertTrue(b8);
        test.pass("Address Line Input Box in Visible");

        boolean b9 = bp.cityVisibile();
        Assert.assertTrue(b9);
        test.pass("City Input box in visible");

        boolean b10 = bp.stateVisible();
        Assert.assertTrue(b10);
        test.pass("State and Region Input Box Visible");

        boolean b11 = bp.zipcodeVisible();
        Assert.assertTrue(b11);
        test.pass("ZipCode Input Box Visble");

        boolean b12 = bp.countryVisible();
        Assert.assertTrue(b12);
        test.pass("Country is Visible");

        boolean b13 = bp.paymentButtonVisible();
        Assert.assertTrue(b13);
        test.pass("Payment Button Is Visible");

        bp.fullname("Chandru V")
                .addressLine1("123 clock tower")
                .addressLine2("chennai")
                .city("Ambur")
                .stateRegion("Vellore")
                .zipcode("12304")
                .country("India")
                .payamentButton();

        paymentPage pay = new paymentPage();
        boolean b2 = pay.cardnumberVisible();
        Assert.assertTrue(b2);
        test.pass("payement Button Visible");

        boolean b14 = pay.expireDateVisible();
        Assert.assertTrue(b14);
        test.pass("Expire Date Input box visible");

        boolean b15 = pay.securityCodeVisble();
        Assert.assertTrue(b15);
        test.pass("Security Code Input box visible");

        boolean b16 = pay.myAddressSameCheckBoxVisible();
        Assert.assertFalse(b16);
        test.pass("Checkbox is selected by default");

        pay.paymentFullName("Chandru V")
                .cardnumber("099283734")
                .securityCode("143")
                .expireDate("1230")
                .reiewButton();

        checkoutPage cp = new checkoutPage();
        cp.screenShot("img1");
        reports.flush();
    }
}