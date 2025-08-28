package com.sparta.nam.oop;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        Member m1 = new Member("Cathy", "French", 1990, 5, 15);
        Member m2 = new Member("Nish", "Mandal", 2025, 1, 20);
        Member noel = new Member("Noel", "Gallagher");
        System.out.println(m1.getFullName());
        System.out.println(m1.getMemberDays());
        System.out.println(m2.getFullName());
        System.out.println(m2.getMemberDays());

        m2.setLastName("Jones");

        System.out.println(m2.getFullName());

        m1.getDate();
        Member.getDate();

        BaseballMember zainab = new BaseballMember("Zainab", "Farooq", 2022,12,6, "fielder");
        System.out.println(zainab.getFullName());
        System.out.println(zainab.getMemberDays());
        System.out.println(zainab.getPosition());
        zainab.setPosition("pitcher");
        System.out.println(zainab.getPosition());

        Member[] members = {m1, m2, zainab};


        System.out.println(m1.getClass());
        System.out.println(m1.toString());
        System.out.println(m1.equals(m2));
        System.out.println(m1.hashCode());
        System.out.println(m2.hashCode());

        System.out.println(zainab.getClass());
        System.out.println(zainab.toString());
        System.out.println(zainab.hashCode());

    }
}
