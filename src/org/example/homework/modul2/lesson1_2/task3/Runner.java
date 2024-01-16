package org.example.homework.modul2.lesson1_2.task3;

import java.util.ArrayList;

public class Runner {
    /**
     * Задание №3 Создать волшебный склад.
     * Создать класс Item - с единственным атрибутом - имя вещи.
     * Склад принимает в себя вещи. У склада нет ограничений в хранении.
     * Склад умеет принимать в себя список вещей и хранить их с уже существующими вещами.
     * В складе должен быть метод: получить все вещи. Данный метод вернет список, в котором будет только каждая четная вещь из склада.
     * В складе должен быть метод: получить вещь по индексу. Данная вещь пропадает из склада.
     * Склад умеет удалять все вещи, кроме последней.
     */
    public static void main(String[] args) {
        ArrayList<Item> items = new ArrayList<>();

        for (int i = 0;  i <= 5 ; i++) {
            items.add( new Item("Велосипед " + i));
            items.add( new Item("Машина " + i));
        }
        Warehouse warehouse = new Warehouse();
        warehouse.addItems(items);
        //Вывод четных вещей склада
        System.out.println(warehouse.getAllItems());

        //Вывод вещи по индексу
        System.out.println(warehouse.getItemByIndex(4));
        System.out.println(warehouse.getAllItems());

        //Удаленеий всех вещей кроме последней
        System.out.println(warehouse);
        warehouse.removeAllButLast();
        System.out.println(warehouse);
    }
}