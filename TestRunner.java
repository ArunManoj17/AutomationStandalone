package runner;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@Cucumber.Options(features = "Features",glue={"StepDefintion","ExecutionMethod","MethodInfo"})

public class TestRunner {



	//public static void main(String[] args) {
		// TODO Auto-generated method stub

	}


