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
        int count = 0;
        boolean go = true;
        
        Scanner input = new Scanner(System.in);
        while(go){
            System.out.print("Please guess a number 1-10:");
            int guess = input.nextInt();
        
            if(guess==answer){
                count++;
                System.out.println("Correct!" + "\nNumber of attempts:" + count);
            }
            else{
                System.out.println("Incorrect!");
                count++;
                if(guess>answer){
                    System.out.println("Too high!");
                }
                if(guess<answer){
                    System.out.println("Too low!");
                }
            }
        }
    }
}
