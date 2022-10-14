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

    public static long[] lcg(long n) {

        long[] arr = new long[10];
        long a = 1103515245L, c = 12345L, m = (long) Math.pow(2, 31);

        for (int i = 0; i < 10; i++) {
            if (i == 0) {
                arr[0] = (((n * a) + c) % m);
            } else {
                arr[i] = ((a * arr[i - 1]) + c) % m;
                System.out.println("Arr[" + i + "] = " + arr[i]);
            }
        }
        return arr;
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

            int spaces = 0;
            int length = text.length( );
            char ch[ ] = text.toCharArray( ) ;
            int c = 0;

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

    public static int checkDigit(int[] code){

        int checksum = 0;

        for (int i = 0; i <code.length ; i++) {
            int num = code[i];
            int weight = i + 2;
            checksum += num * weight;
        }

        int checknum = checksum % 11;
        checknum = 11 - checknum;

        if (checknum == 10){
            checknum = 0;
        } else if (checknum == 11) {
            checknum = 5;
        } else {

        }
       return checknum;
    }


    public static void main(String[] args) {

        //oneMonthCalendar(30,5);
        //guessingGame(5);
        //camelCase("Susn't is the bread");
        //swapArrays();

        }
    }


