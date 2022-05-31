package playground.api.bestbuy.servicesinfo;

import io.restassured.response.Response;
import org.junit.Test;
import playground.api.bestbuy.testbase.TestBase;

import static io.restassured.RestAssured.given;

public class DeleteServicesTest extends TestBase {
    @Test
    public void deleteServicesData() {
        Response response = given()
                .header("Content-Type", "application/json")
                .pathParam("id", 12)
                .when()
                .delete("/services/{id}");
        response.then().statusCode(200);
        response.prettyPrint();
    }
}
