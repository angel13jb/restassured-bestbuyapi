package playground.api.bestbuy.utilitiesinfo;

import io.restassured.response.Response;
import org.junit.Test;
import playground.api.bestbuy.testbase.TestBase;

import static io.restassured.RestAssured.given;

public class GetVersionTest extends TestBase {
    @Test
    public void getUtilityVersion(){
        Response response=given()
                .when()
                .get("/version");
        response.then().statusCode(200);
        response.prettyPrint();
    }
}
