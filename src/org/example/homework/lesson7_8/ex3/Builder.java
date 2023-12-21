package org.example.homework.lesson7_8.ex3;

public class Builder implements Sound {
    private Human human;

    public Builder(Human human) {
        this.human = human;
    }

    @Override
    public String makeSound() {
        return "Я строитель." + human.makeSound();
    }
}
