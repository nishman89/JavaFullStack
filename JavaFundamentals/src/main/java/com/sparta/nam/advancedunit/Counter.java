package com.sparta.nam.advancedunit;

public class Counter {

    private int count;

    public Counter(int start) { this.count = start; }

    public void increment() { count++; }
    public void decrement() { count--; }

    public int getCount() { return count; }
}