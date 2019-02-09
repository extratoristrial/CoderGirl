import static java.lang.System.out;

import java.util.Scanner;

public class SandwichShop
{
    public static void main(String[] args)
    {
        // Don't change these lines.
        Scanner keyboard = new Scanner(System.in);
        int goalForVeggies = 50;
        int goalForBurgers = 250;
        int goalForSubs = 180;
        int goalForSoup = 70;

        //Veggies
        int veggiesToday;
        out.println("The goal for veggie sandwiches sold is " + goalForVeggies);
        out.println("How many veggie sandwiches were sold today?");
        veggiesToday = keyboard.nextInt();
        out.println("You sold " + veggiesToday + " sandwiches.");
        if (veggiesToday == goalForVeggies) {
            out.println("Meets goal!");
        } else if (veggiesToday < goalForVeggies) {
            out.println("Fell short");
        } else if (veggiesToday > goalForVeggies){
            out.println("Surpassed goal! Good job!");
        };

        //burgers
        int burgersToday;
        out.println("The goal for burgers sold is " + goalForBurgers);
        out.println("How many burgers were sold today?");
        burgersToday = keyboard.nextInt();
        out.println("You sold " + burgersToday + " burgers.");
        if (burgersToday == goalForBurgers) {
            out.println("Meets goal!");
        } else if (burgersToday < goalForBurgers) {
            out.println("Fell short");
        } else if (burgersToday > goalForBurgers){
            out.println("Surpassed goal! Good job!");
        };

        //subs
        int subsToday;
        out.println("The goal for subs sold is " + goalForSubs );
        out.println("How many subs were sold today?");
        subsToday = keyboard.nextInt();
        out.println("You sold " + subsToday + " subs.");
        if (subsToday == goalForSubs) {
            out.println("Meets goal!");
        } else if (subsToday < goalForSubs) {
            out.println("Fell short");
        } else if (subsToday > goalForSubs){
            out.println("Surpassed goal! Good job!");
        };

        //soup
        int soupToday;
        out.println("The goal for soups sold is " + goalForSoup );
        out.println("How many soups were sold today?");
        soupToday = keyboard.nextInt();
        out.println("You sold " + soupToday + " soups.");
        if (soupToday == goalForSoup) {
            out.println("Meets goal!");
        } else if (soupToday < goalForSoup) {
            out.println("Fell short");
        } else if (soupToday > goalForSoup){
            out.println("Surpassed goal! Good job!");
        };

        if (veggiesToday == goalForVeggies && burgersToday == goalForBurgers && subsToday == goalForSubs && soupToday == goalForSoup) {
            out.println("Made goal for everything!");
        } else if (veggiesToday > goalForVeggies && burgersToday > goalForBurgers && subsToday > goalForSubs && soupToday > goalForSoup) {
            out.print("Surpassed goal for everything! Wow! Good job!");
    }
    }
}