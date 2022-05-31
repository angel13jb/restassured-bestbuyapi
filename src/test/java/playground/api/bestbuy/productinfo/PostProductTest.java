package playground.api.bestbuy.productinfo;

import io.restassured.response.Response;
import org.junit.Test;
import playground.api.bestbuy.model.productpojo.PostProductPojo;
import playground.api.bestbuy.testbase.TestBase;

import java.util.HashMap;
import java.util.List;

import static io.restassured.RestAssured.given;

public class PostProductTest extends TestBase {

    @Test
    public void createProduct(){
        PostProductPojo postProductPojo=new PostProductPojo();
        postProductPojo.setName("Duracell - AA Batteries (2-Pack)");
        postProductPojo.setType("HardGood");
        postProductPojo.setPrice( 7.50);
        postProductPojo.setShipping(0);
        postProductPojo.setUpc("041333825014");
        postProductPojo.setDescription("Compatible with select electronic devices; AA size; DURALOCK Power Preserve technology; 8-pack");
        postProductPojo.setManufacturer("Duracell");
        postProductPojo.setModel("MN1500B8Z");
        postProductPojo.setUrl("http://www.bestbuy.com/site/energizer-n-cell-e90-batteries-2-pack/333179.p?id=1185268509951&skuId=333179&cmp=RMXCC");
       postProductPojo.setImage("http://img.bbystatic.com/BestBuy_US/images/products/3331/333179_sa.jpg");

        Response response=given()
                .header("Content-Type", "application/json")
                .body(postProductPojo)
                .when()
                .post("/products");
        response.then().statusCode(201);
        response.prettyPrint();
    }

}
