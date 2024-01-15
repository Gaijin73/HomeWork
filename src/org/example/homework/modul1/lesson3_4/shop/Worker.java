package org.example.homework.modul1.lesson3_4.shop;

public class Worker {

    private String name;
    private Integer age;
    private char gender;
    private Item[] items;

    public Worker(String name, int age, char gender, Item[] items) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.items = items;
    }

    public void itemBragging() {
        for (Item item : items) {
            System.out.printf("%s: смотрите какая у меня вещь - %s%n", name ,item.getName());
        }
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public Item[] getItems() {
        return items;
    }
}
