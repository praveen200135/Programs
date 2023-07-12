package Package_01;

import org.json.JSONArray;
import org.json.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class Array_json {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		JSONObject jref= new JSONObject();
		jref.put("water","kiul");
		jref.put("class","pratap");
		jref.put("key","prakash");
		jref.put("pooja","tui");
		jref.put("name","rtu");
		
		JSONArray a = new JSONArray();
		a.put(jref);
		
	
		
		Response resp = given().contentType(ContentType.JSON).body(a.toString()).when().post("http://localhost:3000/Praveen");
		
		
		System.out.println(resp.statusCode());
		System.out.println(resp.asString());
	}

}
