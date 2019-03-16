package com.company;


public class numberArrays {

    public static float averageCalculator(int[] temp) {
        int index;
        int total = 0;
        for (index = 0; index < temp.length; index++) {
            total += temp[index];
        }
        float average = total / temp.length;
        return average;

    }

     public static void main(String[] args) {
        String[] days = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        int[] week1temp = {48,50,55,53,58,63,63};
        int[] week2temp = {64,68,68,67,65,61,59};

        System.out.println("Week 1 High Temperatures");
        System.out.println(week1temp[0] + ", " + week1temp[1] + ", " + week1temp[2] + ", " + week1temp[3] + ", " + week1temp[4] + ", " + week1temp[5] + ", " + week1temp[6]);
        System.out.println("\n" + "Week 2 High Temperatures");
        System.out.println(week2temp[0] + ", " + week2temp[1] + ", " + week2temp[2] + ", " + week2temp[3] + ", " + week2temp[4] + ", " + week2temp[5] + ", " + week2temp[6]);

         System.out.println("\n" + "The average daily high temperature for week 1 is " + averageCalculator(week1temp));
         System.out.println("The average daily high temperature for week 2 is " + averageCalculator(week2temp));
         System.out.println("In week 1, " + days[5] + " & " + days[6] + " will be the warmest, with a high of " + week1temp[6]);
         System.out.println("In week 2, " + days[1] + " & " + days[2] + " will be the warmest, with a high of " + week2temp[1]);

     }

}
