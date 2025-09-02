package com.sparta.nam.oop;

public class BaseballMember extends Member {


    private String position;
    public BaseballMember(String firstName, String lastName, int year, int month, int day, String position) {
        super(firstName, lastName, year, month, day);
        this.position = position;
        // this.lastName = lastName;
    }
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        Object obj = new Object();

        return super.toString() + " position " + position;
    }


}
