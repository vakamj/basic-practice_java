package com.tenExperts;

import com.tenExperts.array.IArraySummater;
import com.tenExperts.array.PairSummater;
import com.tenExperts.array.SimpleSummater;
import com.tenExperts.array.exceptions.ArraySummaterException;

/**
 * main
 */

public final class Main {
    /**
     * constructor Main
     */
    private Main() {
    }

    /**
     * sum of all the elements
     * max amount of pairs array
     *
     * @param args standard input arguments
     * @throws ArraySummaterException throws
     */
    public static void main(final String[] args) {
        IArraySummater summater = new SimpleSummater();
        try {
            System.out.println(summater.sum(new int[]{}));
        } catch (ArraySummaterException e) {
            System.out.println(e.getMessage());

        }
        IArraySummater pairSum = new PairSummater();
        try {
            System.out.println(pairSum.sum(new int[]{1, 2}));
        } catch (ArraySummaterException e) {
            System.out.println(e.getMessage());


        }

    }

}
