package apitesting;
import static io.restassured.RestAssured.*;

import org.apache.http.entity.ContentType;

import io.restassured.response.Response;
//import static io.restassured.matcher.RestAssuredMatchers.*;
//import static org.hamcrest.Matchers.*;

public class SendGetRequestUsingRestAssured {
	


	public static void main(String[] args)
	{
		
		Response response = given().auth().basic("sk_test_8Ek0AIAk0fyvUyJiDbG5ZOIN", "").formParams("limit", 3).formParam("email", "trainer@way2automation.com")
				.get("https://api.stripe.com/v1/customers");
		
		
		response.prettyPrint();

		//given().contentType(io.restassured.http.ContentType.JSON);
		given().contentType("application/json");
		
		given().header("content-Type","application/json").auth().basic("UserName", "Password");
	}
	}
	
	
	
	
	
