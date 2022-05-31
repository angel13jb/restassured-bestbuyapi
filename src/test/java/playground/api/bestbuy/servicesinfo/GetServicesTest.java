package playground.api.bestbuy.servicesinfo;

import io.restassured.response.Response;
import org.junit.Test;
import playground.api.bestbuy.testbase.TestBase;

import static io.restassured.RestAssured.given;

public class GetServicesTest extends TestBase {

    @Test
    public void getAllServicesData(){
        Response response=given()
                .when()
                .get("/services");
        response.then().statusCode(200);
        response.prettyPrint();
    }
    @Test
    public void getSingleServicesData(){
        Response response=given()
                .pathParam("id","9")
                .when()
                .get("/services/{id}");
        response.then().statusCode(200);
        response.prettyPrint();
    }
}
