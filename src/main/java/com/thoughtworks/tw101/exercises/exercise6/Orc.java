package com.thoughtworks.tw101.exercises.exercise6;

/**
 * Created by pxtang on 7/6/15.
 */
public class Orc implements Monster {
    private String name = "Orc";
    private int hp = 20;

    public void takeDamage(int amount) {
        hp -= amount;
    }

    public void reportStatus() {
        System.out.printf("%s has %d hp\n",name, hp);
    }
}
