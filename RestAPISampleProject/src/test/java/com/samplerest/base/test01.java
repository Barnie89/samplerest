package com.samplerest.base;

import org.junit.Before;
import org.junit.Test;
import com.samplerest.data.data;
import static org.junit.Assert.*;
import org.json.JSONArray;
import org.json.JSONObject;
import io.restassured.RestAssured;
import io.restassured.response.Response;



public class test01 extends data {

	
	@Before
	public void beforevalue(){
	RestAssured.baseURI=url1;	
	}
	@Test
	public void getvalue(){
		
		
		Response response= RestAssured.given().when().get(url1get);
	    System.out.println("Response Value " +response.asString());
	    System.out.println("Response Code  Value " +response.getStatusCode());
	    System.out.println("Response body " +response.getBody().asString());
	    assertEquals(200,response.getStatusCode());
	    String responsebody= response.getBody().asString();
	    
	    JSONArray jarray= new JSONArray(responsebody);
	    int responseLen= jarray.length();
	    System.out.println("resLen "+responseLen);
	    JSONObject jb = jarray.getJSONObject(1);
	    String xx= jb.get("altSpellings").toString();
	    System.out.println("value "+xx);
	    
	    String yy= xx.replaceAll("\\[","").replaceAll("\\]","").replaceAll(",","" );
	    String countryValue=yy.substring(13, 30);
	    System.out.println("value2 "+countryValue);
	    assertEquals("Republic of India",countryValue);

	    
	}
      @Test
      public void getValue2(){
    	
  		Response response= RestAssured.given().when().get(url1getinvalid);
  	    System.out.println("Response Value " +response.asString());
  	    System.out.println("Response Code  Value " +response.getStatusCode());
  	    System.out.println("Response body " +response.getBody().asString());
  	    assertEquals(404,response.getStatusCode());
  	    
  	    String responsebody1= response.getBody().asString();
  	    JSONObject jb = new JSONObject(responsebody1);
	    String message= jb.getString("message");
	    System.out.println("message value " +message);
  	    assertEquals("Not Found",message);
}
	
}
