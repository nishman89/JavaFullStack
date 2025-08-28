package com.sparta.nam.oop;

// Abstract classes can have concrete and abstract methods
public abstract class Shape {
    @Override
    public String toString(){
        return getClass().getName() + " Area: " + calculateArea();
    }

    // Abstract methods do NOT have a method body
    // BUT derived classes from the abstract clas MUST ahve their own implmentation of the abstract methods from the base class
    public abstract int calculateArea();
}
