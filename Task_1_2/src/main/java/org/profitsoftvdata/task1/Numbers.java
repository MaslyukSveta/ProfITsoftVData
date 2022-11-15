package org.profitsoftvdata.task1;


import java.util.Arrays;

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

        parallelSort(numbers);

        return stream(numbers)
                .filter(i -> i >= 0).toArray();
    }





}
