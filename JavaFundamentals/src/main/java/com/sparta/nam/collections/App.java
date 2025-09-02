package com.sparta.nam.collections;

import com.sparta.nam.oop.Member;

import java.util.*;

public class App {
    public static void main(String[] args) {
     // Array Lists
        List<String> nameList = new ArrayList<>();
        nameList.add("Nish");
        nameList.add("Nash");
        nameList.add("Nosh");

        List<Integer> nums = new ArrayList<>(List.of(1,2,3,4)); // int --> Integer
        for(var num : nums){
            System.out.println(num); // Integer --> int
        }

        Integer [] ints = {1,2,3,4,5};
        var arrList = Arrays.asList(ints);

        System.out.println();
        ArrayList<Integer> intList = new ArrayList<>(List.of(1,2,3,4,5));
        intList.add(2, 7);
        Collections.reverse(intList);
        intList.remove(1);
        for (var i : intList) {
            System.out.println(i);
        }
        // HashSet (revisit)
        HashSet<Member> memberSet = new HashSet<>();
        memberSet.add(new Member("Nish", "Mandal", 2025,3,12));
        memberSet.add(new Member("Nish", "Mandal", 2025,3,12));
        memberSet.add(new Member("Hash", "Mandol", 2023,3,13));
        memberSet.add(new Member("Nash", "Cheded", 2025,3,13));
        System.out.println("memberSet: ");
        for(Member m : memberSet){
            System.out.println(m);
            System.out.println(m.hashCode());
        }

        if(memberSet.contains(new Member("Nish", "Mandal", 2025,3,12))){
            System.out.println("Nish is in the set");
        } else {
            System.out.println("Nish is not in the set");
        }

        System.out.println(Exercises.countDigits("Niishes"));

        // {[N,1].[i,2].[s,2].[h,1].[e,1]}

        // HashMaps (activitiy)

        Map<Integer, String> map = new HashMap<>();

        // You can't have duplicae keys in maps

        map.put(1, "Nish");
        map.put(2, "Nash");
        map.put(3, "Nosh");

        System.out.println(map.get(1));
        // System.out.println(map.remove(1));
        System.out.println(map);
        System.out.println(map.containsKey(2));

        Set<Integer> keySet = map.keySet();
        var values = map.values();

        for(var item: keySet){
            System.out.println(item);
        }
        System.out.println();
        for(var item : values){
            System.out.println(item);
        }


     // Queues and Stacks (Dequeue)

        Stack<String> myNameStack = new Stack<>();
        myNameStack.push("Haashim");
        myNameStack.push("Farah");
        myNameStack.push("Vineet");
        myNameStack.push("Dayanna");

        // See who was last put onto the stack
        System.out.println(myNameStack.peek());
        System.out.println(myNameStack);
        // Takes the last thing that was put on the stack and returns it as a string
        System.out.println(myNameStack.pop());
        System.out.println(myNameStack);


        Queue<String> myNamesQueue = new LinkedList<>();
        myNamesQueue.offer("Haashim");
        myNamesQueue.offer("Farah");
        myNamesQueue.offer("Vineet");
        myNamesQueue.offer("Dayanna");
        System.out.println(myNamesQueue);
        System.out.println(myNamesQueue.peek());
        System.out.println(myNamesQueue.poll());
        System.out.println(myNamesQueue);
     // Collections activity
    }
}
