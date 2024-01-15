package org.example.homework.modul2.lesson1_2.task3;

import java.util.ArrayList;

public class Warehouse {

    private ArrayList<Item> items = new ArrayList<>();

    public void addItems(ArrayList<Item> newItems) {
        items.addAll(newItems);
    }

    public ArrayList<Item> getAllItems() {
        ArrayList<Item> allItems = new ArrayList<>();
        for (int i = 0; i < items.size(); i++) {
            if (i % 2 == 0) {
                allItems.add(items.get(i));
            }
        }
        return allItems;
    }

    public Item getItemByIndex(int index) {
        return items.remove(index);
    }

    public void removeAllButLast() {
        items.subList(0, items.size() - 1).clear();
    }

    @Override
    public String toString() {
        return "Warehouse{" +
                "items=" + items +
                '}';
    }
}
