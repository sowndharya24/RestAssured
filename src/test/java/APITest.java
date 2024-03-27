import org.junit.Test;
import static io.restassured.RestAssured.*;

public class APITest {

    @Test
    public void testGetRequest() {
        given()
                .when()
                .get("https://jsonplaceholder.typicode.com/posts")
                .then()
                .statusCode(200);
    }
}
