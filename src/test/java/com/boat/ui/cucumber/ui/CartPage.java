package com.boat.ui.cucumber.ui;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class CartPage {

    @FindBy(xpath = "xpath")
    private WebElement webElement;


    public void applyCoupon(){
        Reporter.log("Apply Coupon",true);
    }

}
