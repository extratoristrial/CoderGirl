package com.company;

import static java.lang.System.out;
import java.util.Scanner;

public class Grocery
{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String item;
        out.println("Please list three items on your grocery shopping list.");
        out.print("Item 1? ");
        item = keyboard.next();
        out.print("Item 2? ");
        item = keyboard.next();
        out.print("Item 3? ");
        item = keyboard.next();

        int quan;
        out.println("Now, please enter the quantity of each item.");
        out.print("How many milk? ");
        quan = keyboard.nextInt();
        out.print("How many eggs? ");
        quan = keyboard.nextInt();
        out.print("How many bread? ");
        quan = keyboard.nextInt();

        float cost;
        out.println("Now, please enter the price of each item.");
        out.print("How much does one milk cost?");
        cost = keyboard.nextFloat();
        out.print("How much does one bread cost?");
        cost = keyboard.nextFloat();
        out.print("How much does one eggs cost?");
        cost = keyboard.nextFloat();

        out.println("Calculating your grocery bill.");
        float total = quan * cost;
        total = (float)quan * cost;
        out.println("Your total cost is " + total );
    }
}
