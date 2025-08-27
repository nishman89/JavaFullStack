package com.sparta.nam.strings;

public class App {
    public static void main(String[] args) {
        String name = "   Nish   ";
        char c = name.charAt(4);
       name = name.toLowerCase();
       name = name.trim();
       c = name.charAt(3);
        System.out.println(name);

        System.out.println();
        System.out.println(stringExercise("  Java list fundamentals "));

        String vineet = "Vineet";
        var result = vineet.substring(0,2 + 1);
        System.out.println(result);

        // 1,Nish,Java
        // 2,Zainab,C#

        String theSetence = "I'm really glad to be training at Sparta";
        String[] theWords = theSetence.split(" ");
        String statement = "I came, I saw, I conquered";
        String[] theClauses = statement.split(",");

    }

    public static String stringExercise(String myString){
//        var intermediateString = myString.trim().toUpperCase().replace('L', '*').replace('T', '*');
//        var nPos = intermediateString.indexOf('N');
//        var finalString = intermediateString.substring(0, nPos + 1);
//        return finalString;

        var trimmedString = myString.trim();
        var ucString = trimmedString.toUpperCase();
        var replacedString = ucString.replace('L', '*');
        var replacedString2 = replacedString.replace('T', '*');
        var nPos = replacedString2.indexOf('N');
        var finalString = replacedString2.substring(0, nPos + 1);
        return finalString;
    }
}
