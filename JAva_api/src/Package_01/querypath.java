package Package_01;
import static io.restassured.RestAssured.given;

import io.restassured.http.ContentType;
	import io.restassured.response.Response;

public class querypath {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Response res = given().contentType(ContentType.JSON).when().get("http://localhost:3000/Praveen?name=raji");
		
		System.out.println(res.statusCode());
		
		System.out.println(res.asString());

	}

}
