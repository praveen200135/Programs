package Package_01;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class rets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Response r = given().contentType(ContentType.JSON).when().get("http://localhost:3000/Praveen");
		
		System.out.println(r.statusCode());
		System.out.println(r.asString());
	}

}
