package com.boat.ui.cucumber.stepdefs;

import com.boat.ui.cucumber.ui.BaseClass;
import com.boat.ui.cucumber.ui.CartPage;
import com.boat.ui.cucumber.ui.HomePage;
import io.cucumber.java.en.Given;
import org.openqa.selenium.support.PageFactory;

public class CartPageStepDefs extends BaseClass {

    @Given("I apply coupon")
    public void applyCoupon(){
        CartPage cartPage = PageFactory.initElements(driver, CartPage.class);
        cartPage.applyCoupon();
    }
}
