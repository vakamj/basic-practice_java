package com.tenExperts.array;


import com.tenExperts.array.exceptions.ArraySummaterException;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SimpleSummaterTest {
    /**
     * sum array with elements
     * @throws ArraySummaterException exception
     */
    @Test
    public void sum() throws ArraySummaterException {
        SimpleSummater summater = new SimpleSummater();
        assertEquals(5, summater.sum(new int[]{1, 2, 2}));
    }

    /**
     * sum empty array
     *
     * @throws ArraySummaterException exception
     */
    @Test(expected = ArraySummaterException.class)
    public void sum2() throws ArraySummaterException {
        SimpleSummater summate = new SimpleSummater();
        summate.sum(new int[]{});
    }
}