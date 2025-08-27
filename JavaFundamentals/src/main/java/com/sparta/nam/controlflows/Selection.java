package com.sparta.nam.controlflows;

public class Selection {
    public static void main(String[] args) {
        String result = getGradeIfElse(85);
        System.out.println(result);
        int mark = 35;
        String grade = mark >= 65 ? "Pass" : "Fail";
        String result2 = getGradeConditionalOperators(85);
        System.out.println(result2);
        String resultSwitch = priority(99);
        System.out.println(resultSwitch);
    }

    public static String getGradeIfElse(int mark){
        if(mark >= 85){
            return "Distinction";
        } else if (mark >= 65){
            return "Pass";
        } else {
            return "Fail";
        }
    }

    public static String getGradeConditionalOperators(int mark){
        String grade = mark >= 65 ? (mark >= 85 ? "Distinction" : "Pass") : "Fail";
        return grade;
    }

    public static String priority(int level)
    {
        String priority = "Code ";
        switch (level)
        {
            case 3:
                priority = priority + "Red";
                break;
            case 2:
            case 1:
                priority = priority + "Amber";
                break;
            case 0:
                priority = priority + "Green";
                break;
            default:
                priority = "Error";
                break;
        }
        return priority;
    }
}
