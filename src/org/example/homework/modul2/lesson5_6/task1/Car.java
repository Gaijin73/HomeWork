package org.example.homework.modul2.lesson5_6.task1;

public class Car {
    private String number;

    public Car(String name) {
        this.number = name;
    }

    public String getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Car{" +
                "number='" + number + '\'' +
                '}';
    }
}
