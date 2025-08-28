package com.sparta.nam.oop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MemeberTests {

    @Test
    @DisplayName("getFullName returns the correct name")
    public void getFullNameTest(){
        // Arrange
        Member sut = new Member("Nish", "Mandal", 2015,8,3);
        // Act
        String result = sut.getFullName();
        // Assert
        Assertions.assertEquals("Nish Mandal", result);
    }

    @Test
    @DisplayName("getFirstName returns the correct name")
    public void getFirstNameTest(){
        // Arrange
        Member sut = new Member("Nish", "Mandal", 2015,8,3);
        // Act
        String result = sut.getFirstName();
        // Assert
        Assertions.assertEquals("Nish", result);
    }

}
