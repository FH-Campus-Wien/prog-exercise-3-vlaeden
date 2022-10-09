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
    public static void oneMonthCalendar(int days, int firstday){

        int spaces = (firstday-1)%7;

                for (int i = 0; i < spaces; i++) {
                    System.out.print("   ");
                }
                for (int i = 1; i <= days; i++) {
                    if(i<10)
                        System.out.print(" ");
                    System.out.printf("%1d ", i);

                    if (((i + spaces) % 7 == 0) || (i == days)) System.out.println();
                }
    }
    public static int randomNumberBetweenOneAndHundred(){

        int randomnum = 1;
        while (randomnum <= 1 && randomnum>=100)
        {
            randomnum = (int)(Math.random());
        }
        return randomnum;
    }

    public static void swapArrays(int[] Array1, int[] Array2){



    }

    public static void CamelCase(){



    }

    public static void main(String[] args) {
        // test your method implementations here
        // make method calls
        // print their results
        // etc.
        oneMonthCalendar(30,5);
        guessingGame(5);

        }
    }
