package com.sparta.tfd;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class CheckInputTests {
    @ParameterizedTest
    @DisplayName("Given the String password, regardless of case, checkInput returns true")
    @ValueSource(strings = {"PASSWORD", "password", "paSswOrd"})
    public void givenTheStringPassword_RegardlessOfCase_CheckInput_ReturnsTrue(String str )
    {
        boolean result = Methods.checkInput(str);
        Assertions.assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"PASS", "word", "chicken", ""})
    @DisplayName("Given any String except password, checkInput returns false")
    public void givenAnyStringExceptPassword_CheckInput_ReturnsFalse(String str)
    {
        boolean result = Methods.checkInput(str);
        Assertions.assertFalse(result);
    }
}
