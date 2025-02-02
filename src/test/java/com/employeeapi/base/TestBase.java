package com.employeeapi.base;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.BeforeClass;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TestBase {
	
	public static RequestSpecification httpRequest;
	public static Response reponse;
	public String empID = "1"; //this is hardcoded id taken from database through Postman with GetAllUsers request
	
	public Logger logger;
	
	@BeforeClass
	public void setup() {
		logger = Logger.getLogger("EmloyyesRestAPI"); //added Logger
		PropertyConfigurator.configure("Log4j.properties"); //added logger
		logger.setLevel(Level.DEBUG);
	}

}
