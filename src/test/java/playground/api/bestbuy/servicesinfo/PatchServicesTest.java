package playground.api.bestbuy.servicesinfo;

import io.restassured.response.Response;
import org.junit.Test;
import playground.api.bestbuy.model.servicespojo.PostServicePojo;
import playground.api.bestbuy.testbase.TestBase;

import static io.restassured.RestAssured.given;

public class PatchServicesTest extends TestBase {
    @Test
    public void updateServicesData(){

        PostServicePojo postServicePojo=new PostServicePojo();
        postServicePojo.setName("Nokia Store");

        Response response=given()
                .header("Content-Type", "application/json")
                .pathParam("id",23)
                .body(postServicePojo)
                .when()
                .patch("/services/{id}");
        response.then().statusCode(200);
        response.prettyPrint();
    }
}
