package com.sparta.nam.collections;

import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MakeFiveSetTests {

    @Test
    void testZeroMax() {
        Set<Integer> result = Exercises.makeFiveSet(0);
        assertEquals(Set.of(0), result, "Only 0 should be included");
    }

    @Test
    void testMaxLessThanFive() {
        Set<Integer> result = Exercises.makeFiveSet(4);
        assertEquals(Set.of(0), result, "Only 0 should be included when max < 5");
    }

    @Test
    void testMaxIsFive() {
        Set<Integer> result = Exercises.makeFiveSet(5);
        assertEquals(Set.of(0, 5), result, "Should include 0 and 5");
    }

    @Test
    void testMaxIsTen() {
        Set<Integer> result = Exercises.makeFiveSet(10);
        assertEquals(Set.of(0, 5, 10), result, "Should include 0, 5, 10");
    }

    @Test
    void testMaxNotMultipleOfFive() {
        Set<Integer> result = Exercises.makeFiveSet(12);
        assertEquals(Set.of(0, 5, 10), result, "Should stop at 10 since 12 not divisible by 5");
    }

    @Test
    void testLargeMax() {
        Set<Integer> result = Exercises.makeFiveSet(25);
        assertEquals(Set.of(0, 5, 10, 15, 20, 25), result);
    }

    @Test
    void testNoNegativeNumbers() {
        Set<Integer> result = Exercises.makeFiveSet(7);
        assertTrue(result.stream().allMatch(i -> i >= 0), "All values should be non-negative");
    }
}
