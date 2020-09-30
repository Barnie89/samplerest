package com.samplerest.base;

import static org.junit.Assert.assertEquals;

import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.Before;
import org.junit.Test;

import com.samplerest.data.data;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class test02 extends data {
	@Before
	public void beforevalue(){
	RestAssured.baseURI=url1;	
	}
	@Test
	public void getcapital(){
		
		
		Response response= RestAssured.given().when().get(url2get);
	    System.out.println("Response Value " +response.asString());
	    System.out.println("Response Code  Value " +response.getStatusCode());
	    System.out.println("Response body " +response.getBody().asString());
	    assertEquals(200,response.getStatusCode());
	    String responsebody= response.getBody().asString();
	    
	    JSONArray jarray= new JSONArray(responsebody);
	    int responseLen= jarray.length();
	    System.out.println("resLen "+responseLen);
	    JSONObject jb = jarray.getJSONObject(0);
	    String capital= jb.get("capital").toString();
	    System.out.println("capitalvalue "+capital);
	    assertEquals("Oslo",capital);
	    
}
}
