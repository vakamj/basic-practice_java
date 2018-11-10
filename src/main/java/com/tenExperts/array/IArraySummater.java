package com.tenExperts.array;

import com.tenExperts.array.exceptions.ArraySummaterException;

/**
 * interface IArraySummater
 */
public interface IArraySummater {
    /**
     * method sum
     * @param array array
     * @return  sum
     * @throws ArraySummaterException exception
     */
    int sum(int [] array) throws ArraySummaterException;

}
