package com.sparta.nam.memorymodel;


public class MemoryModel {
    public static void main(String[] args) {

        // walkthrough part 1
//        int vineet = 5;
//        int zainab = vineet;
//        zainab++;
//        String dayanna = "Dayannah";
//
//        var farah = dayanna.toUpperCase();
//        int[] hasashim = {2, 7, 8, 1};
//        vineet = hasashim[2];
//
//
//        var nish = hasashim;
//        nish[2] = 10;

        // this is the end of the method  Unwind the stack - ask everyone to sit down one by one starting at the top of the stack
        // at this point run the garbage collector: (it normally runs when the heap is getting full)
        // 1. Identify the objects on the heap that are not reachable from the stack
        // 2. set the references to them to null (detach the from the strings)
        // 3. compact the heap - move the remaining objects on the heap together


        // Part 2 - comment out part 1 and uncomment this section
//
        var nish = new Person("Nish", "Mandal");
        nish.setFirstName("Nash");
        var haashim = 3.6;
        String farah = "Farah";
        int result = processPerson(nish, haashim);
        System.out.println(nish.getFirstName());

        for(int i = 0; i <= 5; i++){
            System.out.println(i);
        }
    }

    public static int processPerson (Person vineet, double dayannah){
        var cathy = "Cathy";
        vineet.setFirstName("Bob");
        dayannah *= 2;
        return (int) dayannah;
    }

}