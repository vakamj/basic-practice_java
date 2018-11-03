package ioexpertsdotcom.array;

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
     *
     * sum of all the elements
     * max amount of pairs array
     *
     * @param args standard input arguments
     * @throws ArraySummaterException throws
     */
    public static void main(final String[] args) throws ArraySummaterException {
        SimpleSummater summater = new SimpleSummater();
        System.out.println(summater.sum(new int[]{1, 2, 3}));
        PairSummater class1 = new PairSummater();
        System.out.println(class1.sum(new int[]{1, 3, 4, 4}));

    }
}
