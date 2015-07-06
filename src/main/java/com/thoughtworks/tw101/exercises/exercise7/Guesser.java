package com.thoughtworks.tw101.exercises.exercise7;

/**
 * Created by pxtang on 7/6/15.
 */
public class Guesser {
    private final int secret = (int)(100 * Math.random() + 1);
    private boolean win = false;

    public boolean hasWon() {
        return win;
    }

    public void evalGuess(int guess) {
        if (guess < secret) {
            System.out.println("Your guess was too low - try again!");
        } else if (guess > secret) {
            System.out.println("Your guess was too high - try again!");
        } else {
            win = true;
            System.out.println("You guessed the right number! Congrats!");
        }
    }

}
