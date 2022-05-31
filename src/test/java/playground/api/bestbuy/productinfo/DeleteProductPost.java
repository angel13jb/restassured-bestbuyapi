package playground.api.bestbuy.productinfo;

import io.restassured.response.Response;
import org.junit.Test;
import playground.api.bestbuy.testbase.TestBase;

import static io.restassured.RestAssured.given;

public class DeleteProductPost extends TestBase {
    @Test
    public void deleteProduct(){
        Response response=given()
                .header("Content-Type", "application/json")
                .pathParam("id",346575)
                .when()
                .delete("/products/{id}");
       response.then().statusCode(200);
        response.prettyPrint();
    }
}
