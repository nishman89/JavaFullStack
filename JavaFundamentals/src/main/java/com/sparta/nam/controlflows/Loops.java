package com.sparta.nam.controlflows;

public class Loops {
    public static void main(String[] args) {
        String[] names = new String[]{"Vineet", "Zainab", "Farah", "Hashim", "Dayana"};
        String vineet = names[0];
        System.out.println(vineet);
        int[] myArray = {1,2,3,4,5};

        double[] weights = new double[4];
        weights[0] = 3.5;
        weights[1] = 4.2;
        weights[2] = 7.1;

        // foreach/enhanced for loop: Used for forward iteration through and array, when you just want to READ the value
        for(double d : weights){
            System.out.println(d);
        }

        for(int i = 0; i < weights.length; i++){
            System.out.println(weights[i]);
        }

        int i = 0;
        while(i < weights.length){
            System.out.println(weights[i]);
            i++;
        }

        i = 0;
        do{
            System.out.println(weights[i]);
            i++;
        }  while(i < weights.length);

        int[] nums =  { 10, 6, 22, -17, 3 };
        System.out.println("Highest foreach loop: " + highestForEachLoop(nums));
        System.out.println("Highest for- loop: " + highestForLoop(nums));
        System.out.println("Highest while- loop: " + highestWhileLoop(nums));
        System.out.println("Highest do-while loop: " + highestDoWhileLoop(nums));
    }

    private static int highestDoWhileLoop(int[] nums) {
        int highest = Integer.MIN_VALUE;
        int i = 0;
        do
        {
            if (nums[i] > highest)
            {
                highest = nums[i];
            }
            i++;
        } while (i < nums.length);
        return highest;
    }

    private static int highestWhileLoop(int[] nums) {
        int highest = Integer.MIN_VALUE;
        int i = 0;
        while (i < nums.length)
        {
            if (nums[i] > highest)
            {
                highest = nums[i];
            }
            i++;
        }
        return highest;
    }

    private static int highestForLoop(int[] nums) {
        int highest = Integer.MIN_VALUE;
        for (int i=0; i < nums.length; i++)
        {
            if (nums[i] > highest)
            {
                highest = nums[i];
            }
        }
        return highest;
    }

    private static int highestForEachLoop(int[] nums) {
        int highest = Integer.MIN_VALUE;
        for(int num : nums){
            if(num > highest){
                highest = num;
            }
        }

        return highest;
    }
}
