package com.tenExperts.array;

import com.tenExperts.array.exceptions.ArraySummaterException;

/**
 * class SimpleSummater
 */
public class SimpleSummater implements IArraySummater {
    /**
     * sum of all the elements
     *
     * @param array array
     * @return sum
     */
    @Override
    public int sum(final int[] array) throws ArraySummaterException {
        if (array.length == 0) {
            throw new ArraySummaterException("\n" +
                    "empty array");
        }
        int sum = 0;
        for (int anArray : array) {
            sum = sum + anArray;
        }
        return sum;
    }
}
