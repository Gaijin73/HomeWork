package org.example.homework.modul2.lesson1_2.task3;

public class Item {
    private String name;

    public Item(String itemName) {
        this.name = itemName;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Item{" +
                "itemName='" + name + '\'' +
                '}';
    }
}
