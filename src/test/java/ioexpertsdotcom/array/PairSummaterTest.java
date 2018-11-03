package ioexpertsdotcom.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class PairSummaterTest {

    @Test
    public void sum() throws ArraySummaterException {
        PairSummater summate = new PairSummater();
        assertEquals(6, summate.sum(new int [] {2, 3, 4, 2}));

    }

    @Test
    public void sum2() throws ArraySummaterException {
        PairSummater summate = new PairSummater();
        assertEquals(1, summate.sum(new int [] {}));
    }
}