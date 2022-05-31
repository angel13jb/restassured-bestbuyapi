package playground.api.bestbuy.categoriesinfo;

import io.restassured.response.Response;
import org.junit.Test;
import playground.api.bestbuy.testbase.TestBase;

import static io.restassured.RestAssured.given;

public class DeleteCategoriesTest extends TestBase {
    @Test
    public void deleteCategoriesData(){
        Response response=given()
                .pathParam("id","abcat0010000")
                .when()
                .delete("/categories/{id}");
        response.then().statusCode(200);
        response.prettyPrint();
    }
    }

