package org.example.homework.modul1.lesson7_8.ex1;

public abstract class Auto {
    protected boolean isClean;
    protected double width;
    protected double height;
    protected double length;

    public Auto(boolean isClean, double width, double height, double length) {
        this.isClean = isClean;
        this.width = width;
        this.height = height;
        this.length = length;
    }
    public abstract boolean isBig();
}
