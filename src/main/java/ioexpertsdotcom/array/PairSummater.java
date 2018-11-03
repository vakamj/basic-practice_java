package ioexpertsdotcom.array;

/**
 *
 */
public class PairSummater implements IArraySummater {
    /**
     * max amount of pairs array
     *
     * @param array array
     * @return sumElements
     * @throws ArraySummaterException exception
     */
    @Override
    public int sum(final int[] array) throws ArraySummaterException {
        if (array.length % 2 != 0) {
            throw new ArraySummaterException("\n" +
                    "array length is not a multiple of two");
        }

        if (array.length == 0) {
            throw new ArraySummaterException("\n" +
                    "empty array");
        }

        int sumElements = array[0] + array[1];
        for (int i = 0; i < array.length / 2; i++) {
            if (sumElements < array[2 * i] + array[2 * i + 1]) {
                sumElements = array[2 * i] + array[2 * i + 1];
            }
        }
        return sumElements;
    }
}
