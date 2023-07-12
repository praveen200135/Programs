package Package_01;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Path_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Response res = given().contentType(ContentType.JSON).when().get("http://localhost:3000/Praveen/kavin");
		
		System.out.println(res.statusCode());
		
		System.out.println(res.asString());
		
	}

}
