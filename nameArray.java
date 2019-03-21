package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class nameArray {

    public static int getLongest (String[] names) {
        String longestName = names[0];
        int nameIndex = 0;
        for(int index = 1; index < names.length; index++) {
            if(names[index].length() > longestName.length()) {
                longestName = names[index];
                nameIndex = index;
            }
        }
        return (nameIndex + 1);
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("We're naming three pandas! Please enter three names.");
        String[] array1 = new String[3];

        for (int index =0; index < array1.length; index++) {
            System.out.println("Name: ");
            String name = keyboard.nextLine();
            array1[index] = name;
        }

        System.out.println("Here's your given names " + Arrays.toString(array1));

        int length1 = array1[0].length();
        int length2 = array1[1].length();
        int length3 = array1[2].length();

        System.out.println("The length of " + array1[0] + " is " + length1);
        System.out.println("The length of " + array1[1] + " is " + length2);
        System.out.println("The length of " + array1[2] + " is " + length3);

        System.out.println("The longest name is name number " + getLongest(array1));
    }
}