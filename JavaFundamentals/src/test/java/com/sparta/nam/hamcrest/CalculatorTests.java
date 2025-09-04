package com.sparta.nam.hamcrest;



import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import java.util.List;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
public class CalculatorTests {

    @Test
    void given2And6_Add_Returns8Pt0() {
        Calculator calc = new Calculator(6, 2);

        Assertions.assertEquals(8.0, calc.add());

        assertThat(calc.add(), is(8.0));
        assertThat(calc.add(), is(equalTo(8.0)));
        assertThat(calc.add(), equalTo(8.0));
    }

    // Complete Hamcrest MatcherAssert Assertions For the other tests
    @Test
    void given6And3_DivisibleBy_ReturnsTrue() {
        Calculator calc = new Calculator(6, 2);

        Assertions.assertTrue(calc.divisibleBy());
        assertThat(calc.divisibleBy(), is(true));

    }

    @Test
    void given7And3_DivisibleBy_ReturnsFalse() {
        Calculator calc = new Calculator(7, 3);

        Assertions.assertFalse(calc.divisibleBy());
        assertThat(calc.divisibleBy(), is(false));

    }

    @Test
    void given7And3_ToString_OutputContainsCalculator() {
        Calculator calc = new Calculator(7, 3);

        Assertions.assertTrue(calc.toString().contains("Calculator"));
        assertThat(calc.toString(), containsString("Calculator"));

    }

    @Test
    void moreStringMatchers(){
        String testString = "The quick brown fox umps over the lazy dog.";
        assertThat(testString, startsWith("The"));
        assertThat(testString, containsStringIgnoringCase("dog."));
        assertThat(testString, stringContainsInOrder("quick", "jump", "lazy"));
        assertThat(testString, not(emptyOrNullString()));
    }

    @Test
    void collectionMatchersExercise() {

        List<String> fruit = List.of(
                "apple", "pear", "banana", "peach", "pomegranate", "pineapple", "lemon");

        MatcherAssert.assertThat(fruit, hasSize(7));

        MatcherAssert.assertThat(
                fruit,
                containsInRelativeOrder("apple", "banana", "pomegranate", "lemon"));

        MatcherAssert.assertThat(fruit, hasItems("banana", "pear"));

        MatcherAssert.assertThat(
                fruit,
                containsInAnyOrder(
                        "lemon", "pineapple", "pomegranate", "apple", "peach", "pear", "banana"));

        MatcherAssert.assertThat(fruit, not(hasItem("grape")));

        MatcherAssert.assertThat(fruit, not(hasItem(endsWith("z"))));
    }

}