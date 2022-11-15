package org.profitsoftvdata.task1;


import static java.util.Arrays.*;

/**
 *
 */
public class Numbers {


    /**
     * Method that also takes an array of integers
     * and returns only those that are positive (>=0),
     * sorting them in descending order.
     * @param numbers
     * @return
     */
    public static int[] positiveIntegerSort(int[] numbers) {

        return stream(numbers).sorted()
                .filter(i -> i >= 0).toArray();
    }

    public static int[] sort(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int tmp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = tmp;
        }
        return array;
    }

    public static int[] positiveIntegerSort1(int[] numbers) {

        return sort(positiveIntegerSort(numbers));
    }





}
