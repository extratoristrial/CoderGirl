package com.company;

import java.util.Scanner;

public class addingMachine {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int total = 0;
        int add = 1;
        int numbers = -1;
        System.out.println("Welcome to adding machine!");
        System.out.println("Total: " + total);

        while (add != 0) {
            System.out.print("Add: ");
            add = keyboard.nextInt();
            total = add + total;
            System.out.println("Total: " + total + "\n");
            numbers++;
        }

        System.out.println("You entered " +  numbers + " numbers, for a final total of " + total + ".");

    }

}
