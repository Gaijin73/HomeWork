package org.example.homework.modul1.lesson7_8.ex1;

public class Car extends Auto {
    private boolean cruiseControl;

    public Car(boolean isClean, double width, double height, double length, boolean cruiseControl) {
        super(isClean, width, height, length);
        this.cruiseControl = cruiseControl;
    }

    @Override
    public boolean isBig() {
        return (length > 6) || (height > 2.5) || (width > 2);
    }
}
