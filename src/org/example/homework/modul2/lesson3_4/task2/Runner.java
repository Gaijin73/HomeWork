package org.example.homework.modul2.lesson3_4.task2;

/**
 * Задание №2: Сад
 * Создать два фрукта: яблоко, абрикос. (Без полей)
 * Создать функциональный интерфейс сад, который умеет выращивать фрукты.
 * Метод ничего не принимает.
 * Создать с помощью лямбд выражений 2 фермы: яблочная, абрикосовая.
 * Яблочная ферма должна отдавать яблоки(не фрукты!), абрикосовая абрикосы(не фрукты!).
 */
public class Runner {
    public static void main(String[] args) {
        Garden appleGarden = () -> new Apple("яблоко");
        Garden apricotGarden = () -> new Apricot("абрикос");

        System.out.println(appleGarden.grow());
        System.out.println(apricotGarden.grow());
    }
}
