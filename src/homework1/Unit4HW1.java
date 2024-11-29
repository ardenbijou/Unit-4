package homework1;

import java.util.Random;
import java.util.Scanner;

public class Unit4HW1 {

    public static void main(String[] args) {
        guessingGame();
        tiredTurtle();
        notATamagotchi();
        int bob = 5;
        System.out.println(bob);
        bob = 8;


    }

    /**
     * Picks a random number between 1 and 100 and asks the user
     * to guess it. For each guess, the program should tell the user whether
     * the guess is too high, too low, or correct.
     *
     */
    public static void guessingGame(){
        Random rand = new Random();
        Scanner input = new Scanner(System.in);

        int num = rand.nextInt(101);
        System.out.println("guess the number i'm thinking of, between 1 and 100.");

        System.out.print("guess the number: ");
        int guess = input.nextInt();
        while (guess != num) 
        {
            if(guess > num) {
                System.out.println("too high! try again.");
            }
            if(guess < num) {
                System.out.println("too low! try again.");
            }
            System.out.print("guess the number: ");
            guess = input.nextInt();
        }
        System.out.println("\ncorrect! you guessed it!");
    }

    /**
     * Tired Turtle
     * Asks the user how many steps they want the turtle to take in its
     * first move. Then it calculates and displays how many total steps
     * the turtle took until it stopped.
     *
     */
    public static void tiredTurtle(){
        Scanner input = new Scanner(System.in);

        System.out.print("how many steps should the turtle take in his first move? ");
        int move = input.nextInt();
        int total = move + 0;

        while (move > 0) 
        {
            move /= 2;
            total += move;
        }
        System.out.println("\ntotal steps taken by the turtle: " + total);
        
    }



    /**
     * Write your own description
     */
    public static void notATamagotchi(){
        Scanner input = new Scanner(System.in);

        int hunger = 0;
        String feed = "";
        boolean fed;
        // i don't think we would've known about for loops at this point, but i think that would make more sense?
        for (int i = 0; i <= 5; i++)
        {
            System.out.println("hour " + i + ": current hunger level is " + hunger);

            if (hunger >= 40) 
            {
                System.out.println("feed your animal soon, it is unhappy.");

                System.out.print("do you want to feed your pet? (yes/no): ");
                feed = input.nextLine();
                if (feed.equals("no"))
                {
                    System.out.println("end of simulation, your pet is dead.");
                    return;
                }
            }

            System.out.print("do you want to feed your pet? (yes/no): ");
            feed = input.nextLine();
            if (feed.equals("yes")) 
            {
                hunger -= 25;
                if (hunger < 0) {
                    hunger = 0;
                }
            } 
            hunger += 10;
            System.out.println();
        }
        System.out.print("end of simulation. your pet is content.");
        }
    }