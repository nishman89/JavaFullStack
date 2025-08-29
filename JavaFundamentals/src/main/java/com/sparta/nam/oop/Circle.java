package com.sparta.nam.oop;

public class Circle extends Shape {
    private int radius;

    public Circle(int radius){
        this.radius = radius;
    }
    @Override
    public int calculateArea() {
        return (int) (Math.PI * radius * radius);
    }

    @Override
    public void print() {
        System.out.println("I am a circle");
    }
}
