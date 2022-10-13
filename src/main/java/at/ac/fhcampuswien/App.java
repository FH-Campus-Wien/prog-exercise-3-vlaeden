package at.ac.fhcampuswien;

import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

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

    public static boolean swapArrays(int[] array1, int[] array2){
        int i;
        if(array1.length!=array2.length){
            return false;
        }
        for(i = 0; i < array1.length; i++)
        {
            array1[i] = array1[i] + array2[i];
            array2[i] = array1[i] - array2[i];
            array1[i] = array1[i] - array2[i];
        }
        System.out.print("Array1 =>   ");
        for (int element: array1) {
            System.out.println(element);
        }
        System.out.print("Array1 => :  ");
        for (int element: array2) {
            System.out.println(element);
        }

        return true;
    }

    public static String camelCase(String text){

            // to keep track of spaces
            int spaces = 0;
            // variable to hold the length of the string
            int length = text.length( );
            // converting the string expression to character array
            char ch[ ] = text.toCharArray( ) ;
            // // keep track of indices of ch[ ] array
            int c = 0;
            // traversing through each character of the array
            for ( int i = 0; i < length; i++ )
            {
                ch[i] = Character.toLowerCase( ch[i] ) ;
            }
            for ( int i = 0; i < length; i++ )
            {
                if( i == 0 )
                    ch[ i ] = Character.toUpperCase( ch[ i ] );

                if (ch[ i ] == '\''|| ch[ i ] == '!'|| ch[ i ] == '"'|| ch[ i ] == ','|| ch[ i ] == '.'  ){
                    ch[ i ] = ' ';
                    spaces++;
                    continue;
                }

                if (ch[i] == ' ') {
                    spaces++;
                    ch[i + 1] = Character.toUpperCase( ch[ i + 1] );
                    continue ;
                }
                    ch[c++] = ch[i];
                }
            return String.valueOf( ch, 0, length - spaces ) ;
        }




    public static void main(String[] args) {
        // test your method implementations here
        // make method calls
        // print their results
        // etc.
        oneMonthCalendar(30,5);
        guessingGame(5);
        camelCase("Susn't is the bread");

        //swapArrays();

        }
    }


