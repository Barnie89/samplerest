package com.samplerest.base;
import static org.junit.Assert.assertEquals;

import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.samplerest.data.data;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class test03 extends data {
	
	
	@Test
	public void registeration(){
	
	 RestAssured.baseURI ="https://restapi.demoqa.com/customer";
	 RequestSpecification request = RestAssured.given();
	 
	 JSONObject requestParams = new JSONObject();
	 requestParams.put("FirstName", "Virender");
	 requestParams.put("LastName", "Singh");
	 requestParams.put("UserName", "sdimpleuser2dd2011");
	 requestParams.put("Password", "password1");
	 
	 requestParams.put("Email",  "sample2ee26d9@gmail.com");
	 request.body(requestParams.toString());
	 Response response = request.post("/register");
	 
	 int statusCode = response.getStatusCode();
	 Assert.assertEquals(statusCode, "201");
	 String successCode = response.jsonPath().get("SuccessCode");
	 Assert.assertEquals( "Correct Success code was returned", successCode, "OPERATION_SUCCESS");
}
	@Test
	public void registrationfault(){
		RestAssured.baseURI ="https://restapi.demoqa.com/customer";
		 RequestSpecification request = RestAssured.given();
		 
		 JSONObject requestParams = new JSONObject();
		 requestParams.put("FirstName", "Virender"); 
		 requestParams.put("LastName", "Singh");
		 requestParams.put("UserName", "sdimpleuser2dd2011");
		 requestParams.put("Password", "password1"); 
		 requestParams.put("Email",  "sample2ee26d9@gmail.com");
		 
		 request.body(requestParams.toString());
		 Response response = request.get("/register");
		 
		 int statusCode = response.getStatusCode();
		 System.out.println("The status code recieved: " + statusCode);
		 
		 System.out.println("Response body: " + response.body().asString());
	}
		
	
}
