package com.company;

import java.util.Scanner;

public class AreWeThereYet {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String areWeThere = "";
        boolean keepGoing = true;
        while (keepGoing)
        {
            System.out.println("Are we there yet?");
            areWeThere = keyboard.nextLine();
            if (areWeThere.equals("yes")) {
                keepGoing = false;
                System.out.println("Yay!");
            }
            else if (!areWeThere.equals("yes") && !areWeThere.equals("no")){
                System.out.println("Sorry, what was that?");
            }
        }

        }

}
