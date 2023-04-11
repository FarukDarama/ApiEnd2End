package utilities;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class AuthenticationMedunna {

    public static String generateToken(){
        String url="https://medunna.com/api/authenticate";
       Map<String, Object> token = new HashMap<>();
        token.put("password", "Batch.103");
        token.put("rememberMe", true);
        token.put("username", "batch_yuzuc");

     Response response = given().contentType(ContentType.JSON).body(token).post(url);
    return response.jsonPath().getString("id_token");
    }




}
