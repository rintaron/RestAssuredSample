package jp.dip.prog;

import org.junit.Test;
import io.restassured.RestAssured;

import static io.restassured.matcher.ResponseAwareMatcher.*;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class JsonTest {

    @Test
    public void テスト() {
        RestAssured.baseURI = "http://jsonplaceholder.typicode.com/";
        given()
                .get("/posts/2")
                .then()
                .body("userId", equalTo(1))
                .body("id", equalTo(2))
                .body("title", equalTo("qui est esse"))
        ;

        given().get("/posts/2").prettyPrint();

    }

}
