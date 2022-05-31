package playground.api.bestbuy.categoriesinfo;

import io.restassured.response.Response;
import org.junit.Test;
import playground.api.bestbuy.testbase.TestBase;

import static io.restassured.RestAssured.given;

public class GetCategoriesTest extends TestBase {

    @Test
    public void getAllCategoriesData(){
        Response response=given()
                .when()
                .get("/categories");
        response.then().statusCode(200);
        response.prettyPrint();
    }
    @Test
    public void getSingleCategoriesData(){
        Response response=given()
                .pathParam("id","abcat0102005")
                .when()
                .get("/categories/{id}");
        response.then().statusCode(200);
        response.prettyPrint();
    }
}
