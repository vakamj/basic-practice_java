package com.tenExperts.array;

import com.tenExperts.array.exceptions.ArraySummaterException;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PairSummaterTest {
    /**
     * max amount of pairs array with elements
     * @throws ArraySummaterException exception
     */
    @Test
    public void normalSum() throws ArraySummaterException {
        PairSummater summate = new PairSummater();
        assertEquals(6, summate.sum(new int[]{2, 3, 4, 2}));
    }

    /**
     * empty array
     * @throws ArraySummaterException exception
     */
    @Test(expected = ArraySummaterException.class)
    public void nullSum() throws ArraySummaterException {
        PairSummater summate = new PairSummater();
        summate.sum(new int[]{});
    }
}