package at.ac.fhcampuswien;

import java.util.Random;
import java.util.Scanner;

public class App {
    public static void guessingGame(int numberToGuess){
        Scanner scan = new Scanner(System.in);

        int userguess = 0;
        int randomnumber = numberToGuess;
        int counter=1;

            while (counter < 10){
                System.out.print("Guess number " + counter + ": ");
                userguess = scan.nextInt();

                if (userguess>randomnumber){
                    System.out.println("The number AI picked is lower than your guess.");
                    counter++;

                } else if (userguess < randomnumber){
                    System.out.println("The number AI picked is higher than your guess.");
                    counter++;

                } else if (userguess == randomnumber) {
                    System.out.println("You won wisenheimer!");
                    return;
                }

            }
        System.out.println("Guess number 10: You lost! Have you ever heard of divide & conquer?");
    }
    public static void main(String[] args) {
        // test your method implementations here
        // make method calls
        // print their results
        // etc.
        guessingGame(5);
        }
    }
