package com.thoughtworks.tw101.exercises.exercise3;

public class OddSum {

    public int of(int start, int end) {
        if (start % 2 == 0) // if even, make it odd
            start++;

        int sum = 0;
        for (int i = start; i < end; i += 2) { // only iterate through odds
            sum += i;
        }

        return sum;
    }
}
