package com.sparta.nam.collections;

import java.util.*;

public class Exercises {

    public static HashSet<Integer> makeFiveSet(int max){
        HashSet<Integer> result = new HashSet<>();
        for(int i  = 0; i <= max; i++){
            if(i % 5 == 0){
            result.add(i);
            }
        }
        return  result;
    }


    public static List<String> longestWordList(String phrase){
        String[] words = phrase.split(",\\s*");
        ArrayList<String> result = new ArrayList<>();

        for(String word : words){

            if(word.trim().length() >= 5){
                result.add(word);
            }
        }

        return result;
    }

    public static Map<Character, Integer> countDigits(String input) {
        Map<Character, Integer> result = new HashMap<>();

        if (input == null || input.isEmpty()) {
            return result;
        }

        // Strings - convert to a CharArray - then you can treat it as an array

        for (char c : input.toCharArray()) {
                if (!result.containsKey(c)) {
                    result.put(c, 1);
                } else {
                    result.put(c, result.get(c) + 1);
                }
        }
        return result;
    }



}
