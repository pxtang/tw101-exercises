package com.thoughtworks.tw101.exercises.exercise5;

public class RectangleAverager {

    public float averageArea(Rectangle[] rectangles) {
        if (rectangles.length == 0)
            return 0;

        int avg = 0;
        for (int i = 0; i < rectangles.length; i++)
            avg += rectangles[i].area();
        avg /= rectangles.length;
        return avg;
    }
}
