package ioexpertsdotcom.array;


import org.junit.Test;

import static org.junit.Assert.*;

public class SimpleSummaterTest {

    @Test
    public void sum() {
        SimpleSummater summater = new SimpleSummater();
        assertEquals(5, summater.sum(new int [] {1, 2, 2}));
    }
}