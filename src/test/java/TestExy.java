//import org.hamcrest.CoreMatchers;
//import org.junit.Rule;
//import org.junit.Test;
//import org.junit.rules.ExpectedException;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import static org.hamcrest.MatcherAssert.assertThat;
//import static org.hamcrest.core.Is.is;
//import static org.junit.Assert.fail;
//
//public class TestExy {
//
//    @Test(expected = IndexOutOfBoundsException.class)
//    public void empty() {
//        new ArrayList<Object>().get(0);
//    }
//
//    @Test
//    public void testExceptionMessage() {
//        try {
//            new ArrayList<Object>().get(0);
//            fail("Expected an IndexOutOfBoundsException to be thrown");
//        } catch (IndexOutOfBoundsException anIndexOutOfBoundsException) {
//            System.out.println(anIndexOutOfBoundsException.getMessage());
//            assertThat(anIndexOutOfBoundsException.getMessage(), is("Index: 0, Size: 0"));
//        }
//    }
//
//    @Rule
//    public ExpectedException thrown = ExpectedException.none();
//
//    @Test
//    public void shouldTestExceptionMessage() throws IndexOutOfBoundsException {
//        List<Object> list = new ArrayList<Object>();
//
//        thrown.expect(IndexOutOfBoundsException.class);
//        thrown.expectMessage("Index: 0, Size: 0");
//        list.get(0); // execution will never get past this line
//    }
//}
import static org.hamcrest.CoreMatchers.startsWith;
import static org.hamcrest.Matchers.hasProperty;
import static org.hamcrest.Matchers.is;
//import static org.hamcrest.Matchers.startsWith;

import javax.ws.rs.NotFoundException;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class TestExy {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void shouldThrow() {
        TestThing testThing = new TestThing();
        thrown.expect(NotFoundException.class);
        thrown.expectMessage(startsWith("some Message"));
        thrown.expect(hasProperty("response", hasProperty("status", is(404))));
        testThing.chuck();
    }

    private class TestThing {
        public void chuck() {
            Response response = Response.status(Status.NOT_FOUND).entity("Resource not found").build();
            throw new NotFoundException("some Message", response);
        }
    }
}