package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class pairProgram {

    public static int getMax (int[] numbers) {
        int maxValue = numbers[0];
        for(int i = 1; i < numbers.length; i++) {
            if(numbers[i] > maxValue) {
                maxValue = numbers[i];
            }
        }
        return maxValue;
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("How big do you want the array to be?");
        int givenNumber = keyboard.nextInt();
        int[] array1 = new int[givenNumber];

        for (int index =0; index < givenNumber; index++) {
            System.out.println("Add a number to the array: ");
            int num = keyboard.nextInt();
            array1[index] = num;
        }

        System.out.println("Here's your finished array: " + Arrays.toString(array1));
        System.out.println("The max value is " + getMax(array1));


    }
}