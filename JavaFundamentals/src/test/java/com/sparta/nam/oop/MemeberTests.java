package com.sparta.nam.oop;

import org.junit.jupiter.api.*;

public class MemeberTests {

    private Member sut;
    @BeforeAll
    public static void beforeAll(){
        // sut = new Member("Nish", "Mandal", 2015,8,3);
    }

    @BeforeEach
    public void beforeEach(){
        sut = new Member("Nish", "Mandal", 2015,8,3);
    }
    @Test
    @DisplayName("getFullName returns the correct name")
    public void getFullNameTest(){
        // Arrange

        // Act
        String result = sut.getFullName();
        // Assert
        Assertions.assertEquals("Nish Mandal", result);
    }

    @Test
    @DisplayName("getFirstName returns the correct name")
    public void getFirstNameTest(){
        // Arrange
       // Member sut = new Member("Nish", "Mandal", 2015,8,3);
        // Act
        String result = sut.getFirstName();
        // Assert
        Assertions.assertEquals("Nish", result);
    }

    @AfterEach
    public void afterEach(){
        System.out.println("After each");
    }

    @AfterAll
    public static void afterAll(){
        System.out.println("After all");
    }

}
