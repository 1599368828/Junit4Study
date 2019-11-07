
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.allOf;
import static org.hamcrest.CoreMatchers.anyOf;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.sameInstance;
import static org.hamcrest.CoreMatchers.startsWith;
import static org.junit.Assert.*;
import static org.junit.matchers.JUnitMatchers.both;
import static org.junit.matchers.JUnitMatchers.containsString;
import static org.junit.matchers.JUnitMatchers.everyItem;
import static org.junit.matchers.JUnitMatchers.hasItems;

public class MyMathTest {
    @Test
    public void testArrayEqual(){
        byte[] exp = "trial".getBytes();
        byte[] actual = "trial".getBytes();
        assertArrayEquals("test",exp,actual);
    }

    @Test
    public void testEquals(){
        assertEquals("test equal","test","test");
    }

    @Test
    public void testAssertFalse(){
        Assert.assertFalse("asd",true);
    }

    @Test
    public void testAssetNotNull(){
        assertNotNull(123);
    }
}
