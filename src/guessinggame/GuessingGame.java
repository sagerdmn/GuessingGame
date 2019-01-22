package guessinggame;

import java.util.Scanner;

/**
 * Dan Sager -  Week 2 Assignment - GitHub exercize
 */
public class GuessingGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int answer = 4;
        Scanner input = new Scanner(System.in);
        System.out.print("Please guess a number 1-10:");
        int guess = input.nextInt();
        if(guess==answer){
            System.out.print("Correct!");
        }
        else{System.out.print("Incorrect!");}
    }
    
}
