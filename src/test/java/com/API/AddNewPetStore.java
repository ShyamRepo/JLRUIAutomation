package com.API;

import java.io.File;
import java.io.IOException;

import org.json.JSONObject;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Utils.Baseclass;
import Utils.TestDataUtils;
import groovyjarjarantlr4.v4.parse.ANTLRParser.parserRule_return;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class AddNewPetStore extends Baseclass {
	
	long id;
	
	
	
  public AddNewPetStore() throws IOException {
		super(driver);
		// TODO Auto-generated constructor stub
	}

@Test
  public void AddStote() {
	  
	
	  File file = new File(TestDataUtils.RESOURCES_FOLDER_PATH + "/petstore.json"); 
	    RestAssured.baseURI =properties.getProperty("base_uri"); 
	    Response response  = RestAssured.given().
	    		headers("Content-Type", "application/json", "Accept", "application/json").
	    body(file).
	    when().
	      post("/pet").
	      then().
	      extract().response(); 
	    ResponseBody body = response.getBody();
	    System.out.println(response.getStatusLine());
	    System.out.println(body.asString());
	    
	    JsonPath json = response.jsonPath();
	     id=json.get("id");
	    System.out.println("id"+(id));
	    
	    
	    
	    
  }
  
  @Test(priority = 1)
  public void getPetValie() 
  {
	  
	  RestAssured.baseURI =properties.getProperty("base_uri"); 
	    RequestSpecification request = RestAssured.given(); 
	    Response response = request.get("/pet/"+id); 
	    ResponseBody body = response.getBody();
	    System.out.println(response.getStatusLine());
	    System.out.println(body.asString());
  }
}
