package org.example.homework.modul2.lesson3_4.task4;

/**
 * Задание №4: Гори ясно!
 * Создать функциональный интерфейс сжигание, ничего не возвращает, принимает аргумент любого типа.
 * Создать с помощью лямбд выражений:
 * Атомный реактор: принимает в себя уран, печатает на экран: зеленый свет вокруг!
 * Костер: принимает в себя дерево, печатает на экран: желто-красный свет вокруг!
 */
public class Runner {
    public static void main(String[] args) {
        Burn<Uranium> atomicReactor = uranium
                -> System.out.println("зеленый свет вокруг!");
        Burn<Wood> bonfire = uranium
                -> System.out.println("желто-красный свет вокруг!");

        atomicReactor.burning(new Uranium());
        bonfire.burning(new Wood());
    }
}
