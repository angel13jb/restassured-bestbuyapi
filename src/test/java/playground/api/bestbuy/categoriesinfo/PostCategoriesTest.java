package playground.api.bestbuy.categoriesinfo;


import io.restassured.response.Response;
import org.junit.Test;
import playground.api.bestbuy.model.categoriespojo.PostCategoriesPojo;
import playground.api.bestbuy.testbase.TestBase;

import static io.restassured.RestAssured.given;

public class PostCategoriesTest extends TestBase{

    @Test
    public void createCategoriesData(){
        PostCategoriesPojo postCategoriesPojo=new PostCategoriesPojo();
        postCategoriesPojo.setName("special gift");
        postCategoriesPojo.setId("cat00220044");

        Response response=given()
                .header("Content-Type", "application/json")
                .body(postCategoriesPojo)
                .when()
                .post("/categories");
        response.then().statusCode(201);
        response.prettyPrint();
    }
}
