package playground.api.bestbuy.categoriesinfo;

import io.restassured.response.Response;
import org.junit.Test;
import playground.api.bestbuy.model.categoriespojo.PostCategoriesPojo;
import playground.api.bestbuy.testbase.TestBase;

import static io.restassured.RestAssured.given;

public class PatchCategoriesTest extends TestBase {
    @Test
    public void updateCategoriesData(){

        PostCategoriesPojo postCategoriesPojo=new PostCategoriesPojo();
        postCategoriesPojo.setName("birthday gift");
        postCategoriesPojo.setId("cat00220000");

        Response response=given()
                .header("Content-Type", "application/json")
                .pathParam("id","cat00220044")
                .body(postCategoriesPojo)
                .when()
                .patch("/categories/{id}");
        response.then().statusCode(200);
        response.prettyPrint();
    }
}
