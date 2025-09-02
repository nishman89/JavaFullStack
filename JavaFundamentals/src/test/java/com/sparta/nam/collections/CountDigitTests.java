package com.sparta.nam.collections;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class CountDigitsTest {

    @Test
    void returnsEmptyMapForNull() {
        assertTrue(Exercises.countDigits(null).isEmpty());
    }

    @Test
    void returnsEmptyMapForEmpty() {
        assertTrue(Exercises.countDigits("").isEmpty());
    }

    @Test
    void countsAllCharactersIncludingSpacesAndPunctuation() {
        String s = "Hello, world";
        Map<Character, Integer> expected = new HashMap<>();
        expected.put('H', 1);
        expected.put('e', 1);
        expected.put('l', 3);
        expected.put('o', 2);
        expected.put(',', 1);
        expected.put(' ', 1);
        expected.put('w', 1);
        expected.put('r', 1);
        expected.put('d', 1);

        assertEquals(expected, Exercises.countDigits(s));
    }


    @Test
    void countsOnlyCharactersPresent() {
        String s = "112233";
        Map<Character, Integer> expected = new HashMap<>();
        expected.put('1', 2);
        expected.put('2', 2);
        expected.put('3', 2);

        assertEquals(expected, Exercises.countDigits(s));
    }

}
