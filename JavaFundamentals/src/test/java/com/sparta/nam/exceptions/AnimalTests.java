package com.sparta.nam.exceptions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class AnimalTests {

    @ParameterizedTest
    @CsvSource({
        "0,0",
        "10,10"
    })
    @DisplayName("Give an age of 0 or above, setAge changes the age")
    public void setAgeHappyPath(int newAge, int expectedAge){
        Animal sut = new Animal();
        sut.setAge(newAge);
        Assertions.assertEquals(expectedAge, sut.getAge());
    }

    @Test
    @DisplayName("Given an age below zero, setAge throws an IllegalArgumentException")
    public void setAgeSadPath(){
        Animal sut = new Animal();
        // invoke a method, and return anything it throws
        // we then store it in the `exception` variable
        var exception = Assertions.assertThrows(IllegalArgumentException.class, () -> sut.setAge(-2) );
        Assertions.assertEquals("Age must not be negative: -2", exception.getMessage());
    }

    // Create tests for setName (happy and sad) and setVaccincation date (happy & sad)
}
