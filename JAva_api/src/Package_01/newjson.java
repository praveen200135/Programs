package Package_01;

import static io.restassured.RestAssured.*;

import org.json.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class newjson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		JSONObject js = new JSONObject();
		js.put("firrstname","prakash");
		js.put("id","juio");
		js.put("lastname","muthr");
		js.put("vellore","native");
		System.out.println(js);
		
		Response res = given().contentType(ContentType.JSON).body(js.toString()).when().post("http://localhost:3000/Praveen");
		
		System.out.println(res.statusCode());
		
	//	System.out.println(res.asString());
		
	}

}
