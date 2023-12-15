package org.example.homework.lesson5_6.ex1;

public class Deciduous extends Tree {
    private boolean hasLeaves;
    private boolean hasBlooms;

    protected Deciduous(int age, boolean leaves, boolean blooms) {
        super(age);
        this.hasLeaves = leaves;
        this.hasBlooms = blooms;
    }
}
