package com.company;

import  java.util.Scanner;

public class multiplicationTable {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Welcome to the Multiplication Table!\n");
        System.out.println("What size would you like to print? Respond with a number no larger than 20.");
        int size = keyboard.nextInt();
        System.out.println("You asked for a table up to: " + size);
        int multiplier;
        int multipliedBy;

        for (multiplier = 0; multiplier <= size; multiplier++) {
            for (multipliedBy = 0; multipliedBy <= size; multipliedBy++) {
                System.out.println(multiplier + " * " + multipliedBy + " = " + (multiplier*multipliedBy));
            }
        }
    }
}
