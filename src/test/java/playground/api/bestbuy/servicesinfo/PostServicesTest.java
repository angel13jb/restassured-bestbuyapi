package playground.api.bestbuy.servicesinfo;


import io.restassured.response.Response;
import org.junit.Test;
import playground.api.bestbuy.model.servicespojo.PostServicePojo;
import playground.api.bestbuy.testbase.TestBase;

import static io.restassured.RestAssured.given;

public class PostServicesTest extends TestBase{

    @Test
    public void createServicesData(){
        PostServicePojo postServicePojo=new PostServicePojo();
        postServicePojo.setName("IPhone Store");

        Response response=given()
                .header("Content-Type", "application/json")
                .body(postServicePojo)
                .when()
                .post("/services");
        response.then().statusCode(201);
        response.prettyPrint();
    }
}
