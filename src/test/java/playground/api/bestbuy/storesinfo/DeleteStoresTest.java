package playground.api.bestbuy.storesinfo;

import io.restassured.response.Response;
import org.junit.Test;
import playground.api.bestbuy.testbase.TestBase;

import static io.restassured.RestAssured.given;

public class DeleteStoresTest extends TestBase {
    @Test
    public void deleteStoresData(){
        Response response=given()
                .header("Content-Type", "application/json")
                .pathParam("id",8923)
                .when()
                .delete("/stores/{id}");
       response.then().statusCode(200);
        response.prettyPrint();
    }
}
