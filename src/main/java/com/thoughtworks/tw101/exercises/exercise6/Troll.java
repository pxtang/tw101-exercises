package com.thoughtworks.tw101.exercises.exercise6;

/**
 * Created by pxtang on 7/6/15.
 */
public class Troll implements Monster{
    private String name = "Troll";
    private int hp = 40;

    public void takeDamage(int amount) {
        hp -= amount/2;
    }

    public void reportStatus() {
        System.out.printf("%s has %d hp\n",name, hp);
    }
}
