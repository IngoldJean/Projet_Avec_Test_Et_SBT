import org.junit.Test;

import static org.junit.Assert.*;

public class PointJavaTest {

    @Test
    public void testretourx(){
        PointJava pointJava = new PointJava();
        int x = pointJava.getX();
        assertEquals(2, x);
    }
}