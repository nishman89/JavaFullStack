package com.sparta.nam.oop;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Member {

    private final String firstName;
    private String lastName;
    private final LocalDate joinDate;

    public Member(String firstName, String lastName, int year, int month, int day) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.joinDate = LocalDate.of(year, month, day);
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFullName(){
        return this.firstName + " " + this.lastName;
    }

    public long getMemberDays(){
        return joinDate.until(LocalDate.now(), ChronoUnit.DAYS);
    }
}
