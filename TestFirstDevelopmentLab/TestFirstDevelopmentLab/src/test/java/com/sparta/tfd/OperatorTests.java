package com.sparta.tfd;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class OperatorTests {

    @ParameterizedTest
    @CsvSource({
            "5, 2, true",
            "2, 5, false",
            "5, 5, true"
    })
    @DisplayName("Given two numbers X and Y, greaterEqual returns whether X is greater than or equal to Y")
    public void givenTwoNumbersXY_GreaterEqual_ReturnsWhetherXIsGreaterOrEqualToY(int x, int y, boolean expResult)
    {
        Assertions.assertTrue(expResult == Methods.greaterEqual(x, y));
    }

    @ParameterizedTest
    @CsvSource({
            "0, 10.429",
            "10, 24.714"
    })
    @DisplayName("Given a number, BODMAS returns the expected result")
    public void givenNumber_BODMAS_ReturnsTheExpectedResult(int num, double expResult)
    {
        Assertions.assertEquals(expResult, Methods.BODMAS(num), 0.001);
    }
}