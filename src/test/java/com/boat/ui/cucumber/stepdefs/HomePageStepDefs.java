package com.boat.ui.cucumber.stepdefs;


import com.boat.ui.cucumber.ui.BaseClass;
import com.boat.ui.cucumber.ui.HomePage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;


public class HomePageStepDefs extends BaseClass {

    @Before()
    public void launchBrower() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\raj\\Documents\\CucumberDemo\\src\\test\\resources\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        Reporter.log("Launching Browser", true);
    }

    @After
    public void closeBrowser() {
        driver.quit();
        Reporter.log("closing browser", true);
    }

    @Given("I login as user")
    public void loginAsUser() {
        HomePage homepage = PageFactory.initElements(driver, HomePage.class);
        homepage.loginAsUser();
    }

    @Given("I login as user with below details")
    public void loginAsUser(DataTable dataTable) {
        HomePage homepage = PageFactory.initElements(driver, HomePage.class);
        homepage.loginAsUser(dataTable);
    }

    @Given("I navigate to homepage")
    public void navigateToHomepage() {
        HomePage homepage = PageFactory.initElements(driver, HomePage.class);
        homepage.navigateToHomepage();
    }

    @Given("I add iphone to cart")
    public void addToCart() {
        HomePage homepage = PageFactory.initElements(driver, HomePage.class);
        homepage.addToCart();
    }

    @Given("I add below products to cart")
    public void addToCart(DataTable dataTable) {
        HomePage homepage = PageFactory.initElements(driver, HomePage.class);
        homepage.addToCart();
    }

    @Given("I place an order")
    public void placeOrder() {
        HomePage homepage = PageFactory.initElements(driver, HomePage.class);
        homepage.placeOrder();
    }

    @Given("I place an order with below details")
    public void placeOrder(DataTable dataTable) {
        HomePage homepage = PageFactory.initElements(driver, HomePage.class);
        homepage.placeOrder(dataTable);
    }

    @Then("I return order with order id {string}")
    public void returnOrder(String orderId) {
        Reporter.log("Returning order " + orderId, true);
    }

    @Given("This is background step")
    public void backgroundStep() {
        Reporter.log("background step", true);
    }

}

