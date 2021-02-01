package RestUtils;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;



public class Generic
{
	
public static void main(String[] args)
{
	Generic s=new Generic();
	s.ToGet();
}

public void ToGet()
{
	RestAssured.baseURI="https://reqres.in";
	given().
	
	param("page","2").and().
	when().
	get("/api/users").
	
	then().assertThat().statusCode(400).and().contentType(ContentType.JSON).and().
	body("data[0].first_name",equalTo("Michael")).and().
	header("server","cloudflare");
	}
}
