package org.example.homework.lesson5_6.ex2;

public class Board {
    private String name;
    private int width;
    private int length;
    private int height;

    public Board(String name, int width, int length, int height) {
        this.name = name;
        this.width = width;
        this.length = length;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }
}
