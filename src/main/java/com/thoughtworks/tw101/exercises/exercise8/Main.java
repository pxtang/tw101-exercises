package com.thoughtworks.tw101.exercises.exercise8;

// Exercise #8: Create a new version of Exercise #7 where you also record all of the user’s guesses and print them out
// once they guess correctly. Use an ArrayList to store the guesses. Catch the NumberFormatException and handle the case
// where the user entered a String that is not parseable.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        Guesser g = new Guesser();
        System.out.println("Input a number from 1-100 to guess!");
        while (!g.hasWon()) {
            try {
                int guess = Integer.parseInt(user.nextLine());
                g.evalGuess(guess);
            }
            catch (NumberFormatException e) {
                System.out.println("You didn't input a number - try again!");
            }
        }

        user.close();
    }
}
