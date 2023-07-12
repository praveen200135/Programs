package Package_01;

import static io.restassured.RestAssured.*;

import org.json.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Comlplex_json {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
     		JSONObject js = new JSONObject();
     		js.put("houseno","14");
     		js.put("phone","789999435");
     		js.put("street","vetlu");
     		js.put("kovil","pilyaru");
     		
             JSONObject jssp = new JSONObject();
             jssp.put("name", "praveen");
             jssp.put("deatils",js);
             
             Response res = given().contentType(ContentType.JSON).body(jssp.toString()).when().post("http://localhost:3000/Praveen");

             System.out.println(res.statusCode());
             
             System.out.println(res.asString());
	}

}
