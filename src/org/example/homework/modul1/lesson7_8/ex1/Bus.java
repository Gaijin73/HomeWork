package org.example.homework.modul1.lesson7_8.ex1;

public class Bus extends Auto {
    private int maxPassengers;

    public Bus(boolean isClean, double width, double height, double length, int maxPassengers) {
        super(isClean, width, height, length);
        this.maxPassengers = maxPassengers;
    }

    @Override
    public boolean isBig() {
        return (length > 6) || (height > 2.5) || (width > 2);
    }
}
