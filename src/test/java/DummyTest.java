import org.junit.Test;

import static org.junit.Assert.*;

public class DummyTest {

    @Test
    public void testDummy() {
        Dummy dummy = new Dummy();
        assertEquals("Hello World", dummy.printHello());
    }
}
