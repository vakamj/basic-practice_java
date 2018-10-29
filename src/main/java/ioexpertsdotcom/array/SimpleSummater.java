package ioexpertsdotcom.array;

public class SimpleSummater implements IArraySummater {

    public int sum(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum=sum+num;
        }
        return sum;
    }
}
