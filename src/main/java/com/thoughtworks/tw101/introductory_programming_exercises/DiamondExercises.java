package com.thoughtworks.tw101.introductory_programming_exercises;

public class DiamondExercises {
    public static void main(String[] args) {
        drawAnIsoscelesTriangle(3);
        drawADiamond(8);
        drawADiamondWithYourName(3);
    }

    // Helper method to print one line of a triangle
    public static void printOneLine(int n, int i) {
        for (int j = 0; j < n-i-1; j++) // spaces loop
            System.out.print(" ");

        for (int k = 1; k <= 2*i+1; k++) // * loop
            System.out.print("*");

        System.out.println();
    }

//    Isosceles Triangle
//    Given a number n, print a centered triangle. Example for n=3:
//              *
//             ***
//            *****
    private static void drawAnIsoscelesTriangle(int n) {
        for (int i = 0; i < n; i++) // control line #
            printOneLine(n,i);
    }

//    Diamond
//    Given a number n, print a centered diamond. Example for n=3:
//              *
//             ***
//            *****
//             ***
//              *
    private static void drawADiamond(int n) {
        // Draw an isoceles triangle
        for (int i = 0; i < n; i++) // control line #
            printOneLine(n, i);

        // Now do it in reverse
        for (int i = n-2; i >= 0; i--) // control line #
            printOneLine(n, i);
    }

//    Diamond with Name
//    Given a number n, print a centered diamond with your name in place of the middle line. Example for n=3:
//
//             *
//            ***
//           Bill
//            ***
//             *
    private static void drawADiamondWithYourName(int n) {
        // Draw an isoceles triangle without last line
        for (int i = 0; i < n-1; i++) // control line #
            printOneLine(n, i);

        System.out.println("Peter"); // my name fits perfectly

        // Now do it in reverse
        for (int i = n-2; i >= 0; i--) // control line #
            printOneLine(n,i);
    }
}
