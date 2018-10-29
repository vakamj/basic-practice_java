package ioexpertsdotcom.array;

public class PairSummater implements IArraySummater {

    @Override
    public int sum(int[] array) throws ArraySummaterException {
        if (array.length % 2 != 0) {
            throw new ArraySummaterException("\n" +
                    "array length is not a multiple of two");
        }
        int sumElements = array[0] + array[1];
        int[] arraySum = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arraySum[i] = array[2 * i] + array[2 * i + 1];
            if (sumElements < arraySum[i]) {
                sumElements = arraySum[i];
            }
        }
        return sumElements;
    }
}
