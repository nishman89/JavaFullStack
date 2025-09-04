package com.sparta.nam.advancedjunit;

import com.sparta.nam.advancedunit.Counter;
import org.junit.jupiter.api.*;

public class CounterTests {

    private static Counter sut;
    // private Counter sut;

    @BeforeAll
    static void setUpAll(){
        sut = new Counter(6);
    }


//    @BeforeEach
//    void setUp(){
//        sut = new Counter(6);
//    }
    @Test
    @Order(1)
    void decrement_DecrementCountByOne(){
        sut.decrement();
        Assertions.assertEquals(5, sut.getCount());
    }

    @Test
    @Order(2)

    void increment_DecrementCountByOne(){
        sut.increment();
        Assertions.assertEquals(6, sut.getCount());
    }
}
