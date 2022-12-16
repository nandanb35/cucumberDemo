package com.boat.ui.cucumber.api;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.util.HashMap;
import java.util.Map;

public class HttpRest {

    public static Response excecuteGetRequest(String url){
        RequestSpecification request = RestAssured.given();
        Map<String,String> headers = new HashMap<>();
        headers.put("content-type","application/json");
        Response response = request.get(url);
        return response;
    }

    public static Response excecutePostRequest(String url,String payload){
        RequestSpecification request = RestAssured.given();
        Map<String,String> headers = new HashMap<>();
        headers.put("content-type","application/json");
        request.body(payload);
        Response response = request.post(url);
        return response;
    }

}
