package resource;

import io.quarkus.test.junit.QuarkusTest;
import io.quarkus.test.junit.mockito.InjectMock;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import service.AlticciSequenceService;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class AlticciSequenceResourceTest {

    private static final Long TEST_INDEX = 1L;

    @InjectMock
    AlticciSequenceService service;

    @Test
    public void testGetSequence() {
        Mockito.when(service.getResultByIndex(TEST_INDEX)).thenReturn(TEST_INDEX);

        given().when()
                .get("/alticci/{id}", TEST_INDEX)
                .then()
                .statusCode(200)
                .body(is(String.valueOf(TEST_INDEX)));
    }
}
