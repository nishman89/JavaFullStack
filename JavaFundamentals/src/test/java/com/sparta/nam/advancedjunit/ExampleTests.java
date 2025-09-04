package com.sparta.nam.advancedjunit;

import org.junit.jupiter.api.*;

public class ExampleTests {
    public static int staticCounter = 0;
    public int instanceCounter = 0;

    public ExampleTests() {
        staticCounter++;
        instanceCounter++;
        System.out.println("\nConstructor:\tstaticCounter " + staticCounter +
                " | instanceCounter " + instanceCounter);
    }
    @BeforeAll
    public static void beforeAll() {
        staticCounter++;
        System.out.println("Before all:\t\tstaticCounter " + staticCounter);
    }

    @BeforeEach
    public void beforeEach() {
        staticCounter++;
        instanceCounter++;
        System.out.println("Before each:\tstaticCounter " + staticCounter +
                " | instanceCounter " + instanceCounter);
    }

    @Test
    public void testOne() {
        staticCounter++;
        instanceCounter++;
        System.out.println("Test One:\t\tstaticCounter " + staticCounter +
                " | instanceCounter " + instanceCounter);
    }

    @Test
    public void testTwo() {
        staticCounter+=10;
        instanceCounter +=10;
        System.out.println("Test Two:\t\tstaticCounter " + staticCounter +
                " | instanceCounter " + instanceCounter);
    }

    @Test
    public void testThree() {
        staticCounter+=100;
        instanceCounter+=100;
        System.out.println("Test Three:\t\tstaticCounter " + staticCounter +
                " | instanceCounter " + instanceCounter);
    }


    @AfterEach
    public void afterEach() {
        staticCounter++;
        instanceCounter++;
        System.out.println("After each:\t\tstaticCounter " + staticCounter +
                " | instanceCounter " + instanceCounter);
    }

    @AfterAll
    public static void afterAll() {
        staticCounter++;
        System.out.println("\nAfter all:\t\tstaticCounter " + staticCounter);
    }
}