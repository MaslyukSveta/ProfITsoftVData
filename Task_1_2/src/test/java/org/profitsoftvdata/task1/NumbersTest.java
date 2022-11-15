package org.profitsoftvdata.task1;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class NumbersTest {

    @org.junit.jupiter.api.Test
    void positiveIntegerSort() {

        Numbers numbers = new Numbers();

        int [] arr = { 5, 2, 1, -8,0, 10 };

        String result = Arrays.toString(numbers.positiveIntegerSort(arr));

        assertEquals("[0, 1, 2, 5, 10]", result);



    }
}