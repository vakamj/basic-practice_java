package ioexpertsdotcom.array;

/**
 *
 */
public class SimpleSummater implements IArraySummater {
    /**
     * sum of all the elements
     *
     * @param array array
     * @return sum
     */
    public int sum(final int[] array) {
        int sum = 0;
        for (int anArray : array) {
            sum = sum + anArray;
        }
        return sum;
    }
}
