package com.sparta.pcw.codesmellsrefactoring;

public class Camera implements Shootable {
    @Override
    public String shoot() {
        return "Snap - picture taken";
    }
}
