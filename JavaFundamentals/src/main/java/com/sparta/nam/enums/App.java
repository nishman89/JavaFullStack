package com.sparta.nam.enums;

import java.time.LocalDate;

public class App {

    public static void main(String[] args) {
        Day dayOfTheWeek = Day.SUNDAY;


        if(dayOfTheWeek == Day.SATURDAY || dayOfTheWeek == Day.SUNDAY){
            System.out.println("It's the weekend");
        } else {
            System.out.println("It's a weekday!");
        }
        System.out.println("=== Exercise 2: Selection and Iteration ===");

        // Declare a variable of type Season and assign it a value
        Season currentSeason = Season.SPRING;

        // Use if-else statement to print message based on season
        if (currentSeason == Season.SPRING) {
            System.out.println("The daffodils are out");
        } else if (currentSeason == Season.SUMMER) {
            System.out.println("Time for beach holidays!");
        } else if (currentSeason == Season.AUTUMN) {
            System.out.println("The leaves are changing colors");
        } else if (currentSeason == Season.WINTER) {
            System.out.println("Bundle up, it's cold outside!");
        }

        // Use for-each loop to iterate over all Season values
        System.out.println("\nAll seasons:");
        for (Season season : Season.values()) {
            System.out.println("- " + season);
        }
        System.out.println();
        System.out.println("=== Exercise 3: Enum with Switch Statement ===");

        // Test with different days
        Day[] testDays = {Day.MONDAY, Day.WEDNESDAY, Day.FRIDAY, Day.SATURDAY, Day.SUNDAY};

        for (Day day : testDays) {
            System.out.print(day + ": ");

            // Switch statement for different days
            switch (day) {
                case MONDAY:
                case TUESDAY:
                case WEDNESDAY:
                case THURSDAY:
                    System.out.println("Have a lovely day at work!");
                    break;
                case FRIDAY:
                    System.out.println("Nearly the weekend!");
                    break;
                case SATURDAY:
                case SUNDAY:
                    System.out.println("Relax and enjoy!");
                    break;
            }
        }
        System.out.println();
    }
}
