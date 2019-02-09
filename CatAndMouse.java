import static java.lang.System.out;
import java.util.Scanner;
public class CatAndMouse
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        //question 1
        String question1;
        out.println("You are a small, hungry field mouse. You find yourself standing in a mouse hole in the kitchen of a farm house. In the room is a bowl of cat food that smells really tasty.");
        out.println("A young cat is sleeping on a rug in the middle of the room. Looking around the room, you see a wooden table with chairs, a metal floor lamp, and curtains over a window.");
        out.println("You can smell a summer breeze blowing in.\n");
        out.println("Where do you go? Options: chair table lamp food curtain ");
        question1 = keyboard.next();

        if (question1.equals("chair"))
        {
            //question 2
            String question2;
            out.println(" ");
            out.println("You sneak quietly to the chair and climb its rough wood. The only place you can reach from here is the table, so you climb it too. Looking around from the table, you see two paths.");
            out.println("You can walk across the countertop to the open window, or you can climb down the table leg to the floor.\n");
            out.println("Where do you go? Options: window floor ");
            question2 = keyboard.next();

            if (question2.equals("window")) {
                //question 7
                out.println(" ");
                out.println("You climb out the window and down. The tall grass hides you well. You find some tasty spilled grain. By the time you get to the barn, you are well fed, and ready to take a nap");
                out.println(" in the hay. There is no cat in the barn. You're a happy mouse.\n");
                out.println("The End. YOU WIN! :D");
            }
            else if (question2.equals("floor")) {
                //question 8
                out.println(" ");
                out.println("You try to climb down the table leg but it's too slippery. Thump! You hit the floor with a bang. The cat wakes up and chases you around the kitchen! You race back to your hole,");
                out.println(" still hungry, and hide for the rest of the day.\n");
                out.println("The End. Try again next time :( ");
            }
        }
        else if (question1.equals("table"))
        {   //question 3
            out.println(" ");
            out.println("You sneak quietly to the table. The legs are polished and slippery, and you fall with a thump when you try to climb up. The cat woke up! He chases you around the kitchen and back into");
            out.println(" the mouse hole! Exhausted and hungry, you give up for the day.\n");
            out.println("The End. Try again next time :( ");
        }
        else if (question1.equals("lamp"))
        {   //question 4
            out.println(" ");
            out.println("You sneak quietly over to the lamp and try to climb it. The lamp buzzes slightly under your paws, and the light turns on with a click! The cat heard the lamp turn on and snaps awake.");
            out.println("He chases you around the kitchen and back into your hole!\n");
            out.println("The End. Try again next time :( ");
        }
        else if (question1.equals("food"))
        {   //question 5
            String question3;
            out.println(" ");
            out.println("You sneak over to the cat's food dish. There's one piece of food on the floor and more in the dish. You're very hungry.\n");
            out.println("What do you eat? Options: floor dish ");
            question3 = keyboard.next();

            if (question3.equals("floor")) {
                //question 9
                String question5;
                out.println(" ");
                out.println("You eat a large, tasty piece of cat food that was dropped on the floor. You were very quiet. The cat hasn't woken up yet.\n");
                out.println("Where do you go next? Options: dish curtain ");
                question5 = keyboard.next();

                if (question5.equals("dish")) {
                    out.println(" ");
                    out.println("The cat food rattles loudly as you climb in the cat food dish. The cat wakes up! And he knows exactly where you are. He's on you in an instant!");
                    out.println(" You are lunch. :( We'll be sure to notify your next of kin.\n");
                    out.println("The End. RIP. :(");
                } else if (question5.equals("curtain")) {
                    out.println(" ");
                    out.println("You quietly neak over to the curtain. The cat wakes up slow and groggy. You've already made it to the curtain by the time he notices ");
                    out.println("you. With a burst of well-fed strength, you race up the curtain and leap out the open window! Behind you, you hear the thump of the cat hitting ");
                    out.println("the window frame and not making it through.\n");
                    out.println("You follow a grain trail to the barn and find some warm hay to hide in for a nap. There is no cat in the barn. You're a happy mouse!\n");
                    out.println("The End. YOU WIN! :D");
                }
            }
            else if (question3.equals("dish"))
            {
                out.println(" ");
                out.println("The cat food rattles loudly as you climb in the cat food dish. The cat wakes up! And he knows exactly where you are. He's on you in an instant!");
                out.println(" You are lunch. :( We'll be sure to notify your next of kin.\n");
                out.println("The End. RIP. :(");
            }
        }
        else if (question1.equals("curtain"))
        {   //question 6
            String question4;
            out.println(" ");
            out.println("You sneak quietly across the room to the long curtains hanging by the window. The curtains are an easy climb. The cat is");
            out.println(" still asleep. You smell a barn just outside.\n");
            out.println("Where do you go? Options: down window ");
            question4 = keyboard.next();

            if (question4.equals("down"))
            {
                //question 11
                out.println(" ");
                out.println("As you climb back down the curtain, the cat stretches and looks around the room. He notices the curtain hanging strangely and comes over to investigate. ");
                out.println("You barely have a moment to race back into your hole and try again tomorrow.\n");
                out.println("The End. Try again next time :( ");
            }
            else if (question4.equals("window"))
            {
                //question 12
                out.println(" ");
                out.println("You climb out the window and down. The tall grass hides you well. You find some tasty spilled grain. By the time you get to the barn, you are well fed, and ready to take a nap");
                out.println(" in the hay. There is no cat in the barn. You're a happy mouse.\n");
                out.println("The End. YOU WIN! :D ");
            }
            }
        }
    }
