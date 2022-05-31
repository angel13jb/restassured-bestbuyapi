package playground.api.bestbuy.productinfo;

import io.restassured.response.Response;
import org.junit.Test;
import playground.api.bestbuy.testbase.TestBase;

import static io.restassured.RestAssured.given;

public class GetProductTest extends TestBase {

    @Test
    public void getAllProduct(){
        Response response=given()
                .when()
                .get("/products");
        response.then().statusCode(200);
        response.prettyPrint();
    }
    @Test
    public void getSingleProduct(){
        Response response=given()
                .pathParam("id","48530")
                .when()
                .get("/products/{id}");
        response.then().statusCode(200);
        response.prettyPrint();
    }
}
