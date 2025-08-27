package com.sparta.nam.refactoring;

public class App {
    public static void main(String[] args) {

        int timeOfDay = 12;
        String result = getGreeting(timeOfDay);
        System.out.println(result);
    }

    public static String getGreeting(int timeOfDay) {
        if(timeOfDay >= 5 && timeOfDay < 12){
            return "Good morning!";
        } else if(timeOfDay >= 12 && timeOfDay <=18){
            return "Good afternoon!";
        } else {
            return "Good evening!";
        }
    }
}
