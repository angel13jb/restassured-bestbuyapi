package playground.api.bestbuy.utilitiesinfo;

import io.restassured.response.Response;
import org.junit.Test;
import playground.api.bestbuy.testbase.TestBase;

import static io.restassured.RestAssured.given;

public class GetHealthCheckTest extends TestBase {
    @Test
    public void getHealthCheckData(){
        Response response=given()
                .when()
                .get("/healthcheck");
        response.then().statusCode(200);
        response.prettyPrint();
    }
}
