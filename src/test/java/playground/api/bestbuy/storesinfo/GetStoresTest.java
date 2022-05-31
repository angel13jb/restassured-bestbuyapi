package playground.api.bestbuy.storesinfo;

import io.restassured.response.Response;
import org.junit.Test;
import playground.api.bestbuy.testbase.TestBase;

import static io.restassured.RestAssured.given;

public class GetStoresTest extends TestBase {

    @Test
    public void getAllStoresData(){
        Response response=given()
                .when()
                .get("/stores");
        response.then().statusCode(200);
        response.prettyPrint();
    }
    @Test
    public void getSingleStoresData(){
        Response response=given()
                .pathParam("id","6")
                .when()
                .get("/stores/{id}");
        response.then().statusCode(200);
        response.prettyPrint();
    }
}
