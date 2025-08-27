package com.sparta.tfd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SumArrayTests {

    @Test
    @DisplayName("Given an array, sumList returns its sum")
    public void givenAnArray_SumList_ReturnsItsSum() {
        int[] myArray = {7, 2, 4, 1, 9};
        int result = Methods.sumArray(myArray);
        Assertions.assertEquals(result,  23);
    }

    @Test
    @DisplayName("Given an empty array, sumList returns zero")
    public void givenAnEmptyArray_SumList_ReturnsZero() {
        int[] myArray = {};
        int result = Methods.sumArray(myArray);
        Assertions.assertEquals(result, 0);
    }


    @Test
    @DisplayName("Given an array of negative, sumList returns its sum")
    public void givenAnArrayOfNegativeNumbers_SumList_ReturnsItsSum() {
        int[] myArray = {-7, -2, -4, -1, -9};
        int result = Methods.sumArray(myArray);
        Assertions.assertEquals(result,  -1);
    }
}

