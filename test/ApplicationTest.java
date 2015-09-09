import org.junit.*;
import play.test.*;
import play.mvc.*;
import play.mvc.Http.*;
import models.*;

public class ApplicationTest extends FunctionalTest {

    @Test
    public void testThatIndexPageWorks() {
        long beforeNumCalls = ApplicationCalls.get();

        Response response = GET("/");
        assertIsOk(response);

        long afterNumCalls = ApplicationCalls.get();

        assertEquals(1, afterNumCalls - beforeNumCalls);
    }
    
}