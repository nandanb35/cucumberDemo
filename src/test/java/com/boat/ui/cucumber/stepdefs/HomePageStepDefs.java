package com.boat.ui.cucumber.stepdefs;


import com.boat.ui.cucumber.api.HttpRest;
import com.boat.ui.cucumber.ui.BaseClass;
import com.boat.ui.cucumber.ui.HomePage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import org.json.JSONArray;
import org.json.JSONObject;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

import java.util.List;
import java.util.Map;


public class HomePageStepDefs extends BaseClass {

    @Before()
    public void launchBrower(Scenario scenario) {
        Reporter.log(" @Before",true);
        System.out.println("tags ---> " + scenario.getSourceTagNames());
        if (!scenario.getSourceTagNames().contains("@API")) {
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resources/drivers/chromedriver.exe");
            driver = new ChromeDriver();
            Reporter.log("Launching Browser", true);
        }
    }

    @After
    public void closeBrowser(Scenario scenario) {
        Reporter.log(" @After",true);
        Reporter.log("tags ---> " + scenario.getSourceTagNames(), true);
        if (!scenario.getSourceTagNames().contains("@API")) {
            driver.quit();
            Reporter.log("closing browser", true);
        }

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
        HomePage homepage = PageFactory.initElements(driver, HomePage.class);
        homepage.returnOrder(orderId);
    }

    @Then("I replace order with order id {int}")
    public void replaceOrder(Integer orderId) {
        HomePage homepage = PageFactory.initElements(driver, HomePage.class);
        homepage.replaceOrder(orderId);
    }

    @Given("I cancel order {string}")
    public void placeOrder(String orderId) {
        HomePage homepage = PageFactory.initElements(driver, HomePage.class);
        homepage.cancelOrder(orderId);
    }

    @Given("I verify below users are returned in get users request")
    public void verifyUsers(DataTable dataTable) {
        Response response = HttpRest.excecuteGetRequest("https://jsonplaceholder.typicode.com/users");
        Assert.assertEquals(200, response.getStatusCode());

        List<Map<String, String>> list = dataTable.asMaps();

        JSONArray array = new JSONArray(response.getBody().asString());

        for (int i = 0; i < array.length(); i++) {
            Assert.assertEquals(array.getJSONObject(i).getString("name"), list.get(i).get("name"));
            Assert.assertEquals(array.getJSONObject(i).getString("email"), list.get(i).get("email"));
            Assert.assertEquals(array.getJSONObject(i).getJSONObject("company").getString("name"), list.get(i).get("companyName"));
        }

    }

    @Given("I create user with below data")
    public void createUser(DataTable dataTable) {

        Map<String, String> map = dataTable.asMap(String.class, String.class);
        JSONObject payload = new JSONObject();
        payload.put("title", map.get("title"));
        payload.put("body", map.get("body"));
        payload.put("userId", map.get("userId"));

        Response response = HttpRest.excecutePostRequest("https://jsonplaceholder.typicode.com/posts", payload.toString());
        Assert.assertEquals(201, response.getStatusCode());

        JSONObject user = new JSONObject(response.getBody().asString());
        Assert.assertEquals(user.optInt("id"), 101);
    }


    @Given("This is background step")
    public void backgroundStep() {
        Reporter.log("background step", true);
    }

}

