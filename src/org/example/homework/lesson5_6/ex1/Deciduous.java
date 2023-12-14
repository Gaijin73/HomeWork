package org.example.homework.lesson5_6.ex1;

public class Deciduous extends Tree {
    private boolean leaves;
    private boolean blooms;

    protected Deciduous(int age, boolean leaves, boolean blooms) {
        super(age);
        this.leaves = leaves;
        this.blooms = blooms;
    }
}
