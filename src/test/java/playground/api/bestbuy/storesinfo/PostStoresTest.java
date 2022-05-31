package playground.api.bestbuy.storesinfo;


import org.junit.Test;
import playground.api.bestbuy.model.productpojo.PostProductPojo;
import playground.api.bestbuy.model.storepojo.PostStoresPojo;
import playground.api.bestbuy.testbase.TestBase;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class PostStoresTest extends TestBase{

    @Test
    public void createStoresData(){

        PostStoresPojo postStoresPojo=new PostStoresPojo();
        postStoresPojo.setName("Minne");
        postStoresPojo.setType("BigBox");
        postStoresPojo.setAddress("13 Dale");
        postStoresPojo.setCity("Turkey");
        postStoresPojo.setState("MZ");
        postStoresPojo.setZip("56403");
        postStoresPojo.setLat(44.969658);
        postStoresPojo.setLng(-93.449539);
        postStoresPojo.setHours("Mon: 10-9; Tue: 10-9; Wed: 10-9; Thurs: 10-9; Fri: 10-9; Sat: 10-9; Sun: 10-8");

        Response response=given()
                .header("Content-Type", "application/json")
                .body(postStoresPojo)
                .when()
                .post("/stores");
        response.then().statusCode(201);
        response.prettyPrint();





    }
}
