package org.example.homework.lesson7_8.ex3;

public class Driver implements Sound {
    private Human human;

    public Driver(Human human) {
        this.human = human;
    }

    @Override
    public String makeSound() {
        return "Я водитель.";
    }
}
