package com.boat.ui.cucumber.ui;

import io.cucumber.datatable.DataTable;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

import javax.xml.crypto.Data;
import java.util.List;
import java.util.Map;

public class HomePage {

    public static String env = System.getProperty("testenv");

    @FindBy(xpath = "xpath")
    private WebElement webElement;


    public void loginAsUser(){
        Reporter.log("Login as user",true);
    }

    public void loginAsUser(DataTable dataTable){
        Reporter.log("Running in env : "+ env,true);
        System.out.println("testEnv: " + env);
        Reporter.log("Login as user",true);
        Map<String, String> map = dataTable.asMap(String.class, String.class);
        map.forEach((k ,v )-> {
            Reporter.log(k +" : "+v,true);
        });

        List<List<String>> lists = dataTable.asLists();

        for (int i = 0; i < lists.size();i++){
            String col1 = lists.get(i).get(0);
            String col2 = lists.get(i).get(1);

            Reporter.log(col1+" : "+col2,true);

        }

    }

    public void navigateToHomepage(){
        Reporter.log("navigate to homepage",true);
    }

    public void addToCart(){
        Reporter.log("add to cart",true);
    }

    public void addToCart(DataTable dataTable){
        Reporter.log("add to cart",true);
        dataTable.asList().forEach(i -> Reporter.log(i,true));
        
    }

    public void placeOrder(){
        Reporter.log("place order",true);
    }

    public void cancelOrder(String order){
        Reporter.log("Cancelling order : "+order,true);
    }

    public void placeOrder(DataTable dataTable){
        Reporter.log("place order",true);

        List<Map<String, String>> list = dataTable.asMaps(String.class, String.class);

        list.forEach(l -> {
            Reporter.log(l.toString(),true);
        });

    }

    public void returnOrder(String orderID){
        Reporter.log("Returning order " + orderID, true);
    }

    public void replaceOrder(int orderID){
        Reporter.log("Replacing order " + orderID, true);
        Assert.fail("Unable to Replace order");
    }

}
