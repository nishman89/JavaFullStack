package com.sparta.nam.oop;

import java.time.LocalDate;
import java.util.*;

public class App {
    public static void main(String[] args) {
        Member m1 = new Member("Cathy", "French", 1990, 5, 15);
        Member m2 = new Member("Nish", "Mandal", 2025, 1, 20);
        Member noel = new Member("Noel", "Gallagher");


        List<Member> members = new ArrayList<>(List.of(noel,m1,m2));
        members.stream().filter(mem -> mem.getMemberDays() > 600).toList();
        System.out.println(members);
//        System.out.println(m1.getFullName());
//        System.out.println(m1.getMemberDays());
//        System.out.println(m2.getFullName());
//        System.out.println(m2.getMemberDays());
//
//        m2.setLastName("Jones");
//
//        System.out.println(m2.getFullName());
//
//        m1.getDate();
//        Member.getDate();
//
//        BaseballMember zainab = new BaseballMember("Zainab", "Farooq", 2022,12,6, "fielder");
//        System.out.println(zainab.getFullName());
//        System.out.println(zainab.getMemberDays());
//        System.out.println(zainab.getPosition());
//        zainab.setPosition("pitcher");
//        System.out.println(zainab.getPosition());
//
//        Member[] members = {m1, m2, zainab};
//
//
//        System.out.println(m1.getClass());
//        System.out.println(m1.toString());
//        System.out.println(m1.equals(m2));
//        System.out.println(m1.hashCode());
//        System.out.println(m2.hashCode());
//
//        System.out.println(zainab.getClass());
//        System.out.println(zainab.toString());
//        System.out.println(zainab.hashCode());
//
//        for(Member m : members){
//            System.out.println(m.toString());
//        }
//
//        Shape rectangle = new Rectangle(5,5);
//        System.out.println(rectangle);
//
//        Shape circle = new Circle(5);
//        System.out.println(circle);
//
//        Shape[] shapes = {rectangle, circle};
//
//        for(Shape shape : shapes){
//            System.out.println(shape);
//        }
//
//        Printable[] printables = {m1, zainab, rectangle, circle};
//
//        for(Printable p : printables){
//            p.print();
//        }


//        int a = 1;
//        int b = 1;
//        System.out.println(a == b);
//
//        Member member1 = new Member("Nish", "Mandal", 2022,1,1);
//        Member member2 = new Member("Nish", "Mandal", 2022,1,1);
//        Member member3 = member1;
//        System.out.println(member1.equals(member2));
//        System.out.println(member1.equals(member3));
//        System.out.println(member1.hashCode());
//        System.out.println(member2.hashCode());
//
//
//        HashSet<Member> members = new HashSet<>();
//        members.add(member1);
//        members.add(member2);
//        HashSet<Integer> ints = new HashSet<>();
//        ints.add(1);
//        ints.add(1);
//        ints.add(2);
//        ints.add(3);

    var result = aMethod("Nish is the man", "Nish");

    }

    public static int aMethod(String one, String two)
    {
        int x = 0;
        String[] result = one.split(" ");
        for (String t : result)
        {
            if (t.startsWith(two))
            {
                x++;
            }
        }
        return x;
    }
}
