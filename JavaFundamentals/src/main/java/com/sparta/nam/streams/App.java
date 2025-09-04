package com.sparta.nam.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class App {




    public static boolean isEqual(int num){
        return num % 2 == 0;
    }
    public static void main(String[] args) {

        List<String> beatles = new ArrayList<>(List.of("John", "Paul", "George", "Ringo"));

        // FILTER
        // num -> num % 2 == 0
        List<Integer> nums = new ArrayList<>(List.of(1,2,3,4,5));

        nums.stream()
                .filter(App::isEqual)
                .forEach(num -> System.out.println(num));

        // MAP
        List<String> upperNames = beatles.stream()
                // map will perform a function on each element in the collection
                .map(name -> name.toUpperCase())
                .toList();
        System.out.println(upperNames);

        // Sum
        int sum = nums.stream().mapToInt(num -> num).sum();
        System.out.println(sum);




        for(int num : nums){
            if(isEqual(num)){
                System.out.println();
            }
        }





        // DECLARATIVE - functional

        beatles.stream()
                .filter(name -> name.startsWith("J")) // the streams provides the first element which is John. It  then checks the other elements
                .forEach(name -> System.out.println(name));



        // get all the beatles who's name starts with J
        // IMPERATIVE way
        for(String name : beatles){
            if(name.startsWith("J")){
                System.out.println(name);
            }
        }
    }
}
