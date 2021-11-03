/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution, Exercise 32
 *  Copyright 2021 Mayank Goyal
 */

package ex32;

import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Let's play Guess the Number!");
        int chosenNumber;

        chosenNumber = (int) (Math.random() * 999 + 1);

        int guessNumber,total=0,level;

        while(true)
        {

            total = 0;

            System.out.print("\nEnter the difficulty level(1, 2, or 3): ");
            level=scanner.nextInt();

            if(level == 1)
            {

                chosenNumber = (int) (Math.random() * 10 + 1);

            }
            else if(level == 2)
            {

                chosenNumber = (int) (Math.random() * 100 + 1);

            }
            else
            {

                chosenNumber = (int) (Math.random() * 1000 + 1);

            }

            System.out.print("I have my number. What's your guess?: ");
            do
            {
                guessNumber = scanner.nextInt();
                total++;

                if (guessNumber == chosenNumber)
                {

                    System.out.println("You got it in " + total +"  guesses!");

                }
                else if (guessNumber < chosenNumber)
                {

                    System.out.println("Too low. Guess again: ");

                }
                else if (guessNumber > chosenNumber)
                {

                    System.out.println("Too high. Guess again: ");

                }

            }while (guessNumber != chosenNumber);

            System.out.print("\nDo you wish to play again (Y/N)?  ");
            char s=scanner.next().charAt(0);

            if(s=='N' || s=='n')
                break;
        }

    }
}
