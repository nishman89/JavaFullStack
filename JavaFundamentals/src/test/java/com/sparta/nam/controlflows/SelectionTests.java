package com.sparta.nam.controlflows;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


public class SelectionTests {

    @ParameterizedTest
    @ValueSource(ints = {0,40,64})
    public void givenAMarkLessThan65_getGradeIfElse_ReturnsFail(int mark){
        Assertions.assertEquals("Fail", Selection.getGradeIfElse(mark));
    }

    @Test
    @DisplayName("Test the switch statement")
    public void testSwitchStatement(){
        //Arrange
        int code = 1;
        String expected = "Code Amber";
        //Act
        String result = Selection.priority(code);
        //Assert
        Assertions.assertEquals(expected, result);
    }
    // write some tests for the switch statement and the conditional operator method
}
