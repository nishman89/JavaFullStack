package com.sparta.nam.collections;



import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LongestWordListTests {

    @Test
    void sentenceWithPunctuation_onlyWordsLongerThanFive() {
        // > 5 means "Hello" (5) is excluded; "what's" (6) and "happening" (10) included.
        String input = "Hello, my name is Nish, what's happening?";
        List<String> result = Exercises.longestWordList(input);
        assertEquals(List.of("what's", "happening"), result);
    }

    @Test
    void commaSeparated_basicFiltering() {
        List<String> result = Exercises.longestWordList("apple, banana, pear, cherry");
        // "apple" (5) excluded; "banana"/"cherry" (6) included
        assertEquals(List.of("apple", "banana", "cherry"), result);
    }

    @Test
    void duplicatesArePreserved() {
        List<String> result = Exercises.longestWordList("flower, flower, bush");
        // "flower" (6) twice, "bush" (4) excluded
        assertEquals(List.of("flower", "flower"), result);
    }

    @Test
    void allShortWords_returnsEmptyList() {
        List<String> result = Exercises.longestWordList("a, is, cat, dog");
        assertTrue(result.isEmpty());
    }

    @Test
    void singleLongWord_returnsThatWord() {
        List<String> result = Exercises.longestWordList("serenity");
        assertEquals(List.of("serenity"), result);
    }

    @Test
    void emptyInput_returnsEmptyList() {
        List<String> result = Exercises.longestWordList("");
        assertTrue(result.isEmpty());
    }
}


