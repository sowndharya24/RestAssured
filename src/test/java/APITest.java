import org.junit.Test;
import static io.restassured.RestAssured.*;

public class APITest {
//https://medium.com/@bubu.tripathy/testing-restful-apis-with-rest-assured-6d245401deea
    @Test
    public void testGetRequest() {
        given()
                .when()
                .get("https://jsonplaceholder.typicode.com/posts")
                .then()
                .statusCode(200);
    }
}