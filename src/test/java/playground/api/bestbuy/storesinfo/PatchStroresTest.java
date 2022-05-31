package playground.api.bestbuy.storesinfo;

import io.restassured.response.Response;
import org.junit.Test;
import playground.api.bestbuy.model.productpojo.PatchProductPojo;
import playground.api.bestbuy.model.storepojo.PatchStoresPojo;
import playground.api.bestbuy.testbase.TestBase;

import static io.restassured.RestAssured.given;

public class PatchStroresTest extends TestBase {
    @Test
    public void updateStoresData(){

        PatchStoresPojo patchStoresPojo=new PatchStoresPojo();
        patchStoresPojo.setName("Mouse");
        patchStoresPojo.setType("smallbox");
       patchStoresPojo.setAddress("14 albany");
       patchStoresPojo.setCity("Texas");


        Response response=given()
                .header("Content-Type", "application/json")
                .pathParam("id",8923)
                .body(patchStoresPojo)
                .when()
                .patch("/stores/{id}");
        response.then().statusCode(200);
        response.prettyPrint();
    }
}
