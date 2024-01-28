package org.example.homework.modul2.lesson3_4.task2;

public abstract class Fruit {
    private String name;

    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                '}';
    }

    public Fruit(String name) {
        this.name = name;
    }
}
