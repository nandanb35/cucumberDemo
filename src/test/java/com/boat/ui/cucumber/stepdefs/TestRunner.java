package com.boat.ui.cucumber.stepdefs;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;

import io.cucumber.testng.CucumberOptions;
import org.junit.runner.RunWith;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;

@CucumberOptions(features = "src/test/resources/features",
        glue = {"com.boat.ui.cucumber.stepdefs"},
        plugin = {
                "pretty",
                "json:target/cucumber-report/cucumber.json"}
)
public class TestRunner extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {

        Reporter.log("Data Provider ", true);

        return super.scenarios();
    }

}