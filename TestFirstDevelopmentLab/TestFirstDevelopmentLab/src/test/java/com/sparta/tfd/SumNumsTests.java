package com.sparta.tfd;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SumNumsTests {

    @Test
    @DisplayName("Given start and end, sumNums returns the sum from start to end")
    public void givenTwoNumbers_SumNums_ReturnsTheSumFromStartToEnd() {
        int result = Methods.sumNums(3, 6);
        Assertions.assertEquals(18, result);
    }


    @Test
    @DisplayName("Given two equal numbers, sumNums returns the number")
    public void givenTwoEqualNumbers_SumNums_ReturnsTheNumber() {
        int result = Methods.sumNums(3, 3);
        Assertions.assertEquals(3, result);
    }

    @Test
    @DisplayName("Given two numbers where the second is smaller, sumNums returns zero")
    public void givenTwoNumbersSecondSmaller_SumNums_ReturnsZero() {
        int result = Methods.sumNums(6, 3);
        Assertions.assertEquals(0, result);
    }
}