package com.sparta.nam.generics;

public class ObjectRectangle {

    private Object width;
    private Object height;

    public ObjectRectangle(Object width, Object height) {
        this.width = width;
        this.height = height;
    }

    public Object getWidth() {
        return width;
    }

    public void setWidth(Object width) {
        this.width = width;
    }

    public Object getHeight() {
        return height;
    }

    public void setHeight(Object height) {
        this.height = height;
    }
}
