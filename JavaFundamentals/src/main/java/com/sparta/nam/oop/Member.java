package com.sparta.nam.oop;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public  class Member {

    private final String firstName;

    //protected means that the field/method is only available with the class and dervived classes
    protected String lastName;
    private LocalDate joinDate;

    public Member(String firstName, String lastName, int year, int month, int day) {
        this(firstName, lastName);
        this.joinDate = LocalDate.of(year, month, day);
    }


    public Member(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.joinDate = LocalDate.now();
    }

    public static LocalDate getDate(){
        return LocalDate.now();
    }
//
//    // If no constructor is in class, by defauly a paramterless contructor is put in the class
//    // But if we do have a constructor, and want a paramterless contructor, we need to explcitly put it in
//    public Member(){}

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public final String getFullName(){
        return this.firstName + " " + this.lastName;
    }

    public long getMemberDays(){
        return joinDate.until(LocalDate.now(), ChronoUnit.DAYS);
    }

    @Override
    public String toString() {
        return getFullName() + " has been member for " + getMemberDays() + " days.";
    }
}
