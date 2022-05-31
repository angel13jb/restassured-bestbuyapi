package playground.api.bestbuy.productinfo;

import io.restassured.response.Response;
import org.junit.Test;
import playground.api.bestbuy.model.productpojo.PatchProductPojo;
import playground.api.bestbuy.testbase.TestBase;


import static io.restassured.RestAssured.given;

public class PatchProductTest extends TestBase {
    @Test
    public void updateProduct(){
        PatchProductPojo patchProductPojo=new PatchProductPojo();
        patchProductPojo.setName("Duracell - C Batteries (4-Pack)");
        patchProductPojo.setType("HardGood");
        patchProductPojo.setShipping(10);

        Response response=given()
                .header("Content-Type", "application/json")
                .pathParam("id",9999680)
                .body(patchProductPojo)
                .when()
                .patch("/products/{id}");
        response.then().statusCode(200);
        response.prettyPrint();
    }
}
