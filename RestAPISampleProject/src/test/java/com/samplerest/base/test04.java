package com.samplerest.base;

import static org.junit.Assert.assertEquals;

import org.json.JSONObject;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.samplerest.data.data;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import net.serenitybdd.junit.runners.SerenityRunner;


@RunWith(SerenityRunner.class)
public class test04 extends data{

	
	@Before
	public void beforevalue(){
		RestAssured.baseURI=url4;
		
		}
	@Test
	public void validuser(){
		
		 RequestSpecification req= RestAssured.given();
		 req.header("Content-Type",contentType);
		 JSONObject jb = new JSONObject();
		 jb.put("email",validEmail);
		 jb.put("password",validPassword );
		 req.body(jb.toString());
		 Response resp= req.post(url4post);
		 System.out.println("Response Value " +resp.asString());
		 System.out.println("Response Code  Value " +resp.getStatusCode());
		 assertEquals(200,resp.getStatusCode());
	}
	@Test
	public void invalidUser(){
		 RequestSpecification req= RestAssured.given();
		 req.header("Content-Type","application/json");
		 JSONObject jb = new JSONObject();
		 jb.put("email",invalidEmail);
		 jb.put("password", validPassword);
		 req.body(jb.toString());
		 Response resp= req.post("/api/register");
		 System.out.println("Response Value " +resp.asString());
		 System.out.println("Response Code  Value " +resp.getStatusCode());
		 assertEquals(400,resp.getStatusCode());
	}
	
}
