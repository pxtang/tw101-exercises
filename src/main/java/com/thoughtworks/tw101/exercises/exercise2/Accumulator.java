package com.thoughtworks.tw101.exercises.exercise2;

public class Accumulator {
    private static int calls = 0;

    public void increment() {
        calls ++;
    }

    public void total() {
        System.out.println(calls);
    }

}
