package com.company;

import static java.lang.System.out;
import java.util.Scanner;

public class Grocery
{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        out.println("Please list three items on your grocery shopping list.");
        out.print("Item 1? ");
        String item1 = keyboard.next();
        out.print("Item 2? ");
        String item2 = keyboard.next();
        out.print("Item 3? ");
        String item3 = keyboard.next();

        out.println("Now, please enter the quantity of each item.");
        out.print("How many milk? ");
        int quan1 = keyboard.nextInt();
        out.print("How many eggs? ");
        int quan2 = keyboard.nextInt();
        out.print("How many bread? ");
        int quan3 = keyboard.nextInt();

        out.println("Now, please enter the price of each item.");
        out.print("How much does one milk cost?");
        float cost1 = keyboard.nextFloat();
        out.print("How much does one bread cost?");
        float cost2 = keyboard.nextFloat();
        out.print("How much does one eggs cost?");
        float cost3 = keyboard.nextFloat();

        out.println("Calculating your grocery bill.");
        float total = (quan1 * cost1) + (quan2 * cost2) + (quan3 * cost3);
        out.println("Your total cost is " + total );
    }
}
