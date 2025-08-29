package com.sparta.nam.oop;

public class Rectangle extends Shape{

    private int length;
    private int width;

    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }
    @Override
    public int calculateArea() {
        return width * length;
    }

    @Override
    public void print() {
        System.out.println("I am a rectabgle");
    }
}
