package com.sparta.nam.refactoring;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class AppTest {


//    @Test
//    @DisplayName("My first test")
//    public void firstTest(){
//        Assertions.assertTrue(false);
//    }

    @Test
    @DisplayName("getGreeting, when given a time of 21, returns good evening")
    public void getGreeting_GivenATimeOf21_ReturnsGoodEvening(){
        // Arrange
        int time = 21;
        String expected = "Good evening!";

        //Act
        String actual = App.getGreeting(time);

        //Assert
        Assertions.assertEquals(expected, actual);

        Assertions.assertEquals("Good evening!", App.getGreeting(21));

    }

    @Test
    @DisplayName("getGreeting, when given a time of 8, returns good morning")
    public void getGreeting_GivenATimeOf8_ReturnsGoodMorning()
    {
        Assertions.assertEquals("Good morning!", App.getGreeting(8));
    }

    @Test
    @DisplayName("getGreeting, when given a time of 15, returns good afternoon")
    public void getGreeting_GivenATimeOf15_ReturnsGoodAfternoon()
    {
        Assertions.assertEquals("Good afternoon!", App.getGreeting(15));
    }

    @Test
    @DisplayName("getGreeting, when given a time of 2, returns good evening")
    public void getGreeting_GivenATimeOf2_ReturnsGoodEvening()
    {
        Assertions.assertEquals("Good evening!", App.getGreeting(2));
    }

    @ParameterizedTest
    @ValueSource(chars = {5,11})
    @DisplayName("getGreeting, when given a time from 5 to 11, returns good morning")
    public void getGreeting_GivenATimeFrom50To11_RetrurnsGoodMorning(int time){
        Assertions.assertEquals("Good morning!", App.getGreeting(time));
    }

    @ParameterizedTest
    @ValueSource(ints = {12, 18})
    @DisplayName("getGreeting, when given a time from 12 to 18, returns good afternoon")
    public void getGreeting_GivenATimeFrom12To18_ReturnsGoodAfternoon(int time)
    {
        Assertions.assertEquals("Good afternoon!", App.getGreeting(time));
    }

    @ParameterizedTest
    @ValueSource(ints = {0, 4})
    @DisplayName("getGreeting, when given a time from 0 to 4, returns good evening")
    public void getGreeting_GivenATimeFrom0To4_ReturnsGoodEvening(int time)
    {
        Assertions.assertEquals("Good evening!", App.getGreeting(time));
    }

    @ParameterizedTest
    @ValueSource(ints = {19, 23})
    @DisplayName("getGreeting, when given a time from 19 to 23, returns good evening")
    public void getGreeting_GivenATimeFrom19To23_ReturnsGoodEvening(int time)
    {
        Assertions.assertEquals("Good evening!", App.getGreeting(time));
    }

    @ParameterizedTest
    @CsvSource({
            "Good evening!, 2",
            "Good morning!, 8",
            "Good afternoon!, 15",
            "Good evening!, 21"
    })
    @DisplayName("getGetting, when given a time, returns an appropriate greeting")
    public void givenATime_Greeting_ReturnsAnAppropriateGreeting(String expected, int time){
        Assertions.assertEquals(expected, App.getGreeting(time));
    }
}
