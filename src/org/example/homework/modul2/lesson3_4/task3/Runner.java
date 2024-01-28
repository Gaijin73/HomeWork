package org.example.homework.modul2.lesson3_4.task3;

import java.util.function.Function;

/**
 * Задание №3: Поиск пары с помощью гадания
 * Создать функциональный гадание, который на вход принимает аргумент любого типа, на выход возвращает да/нет.
 * Создать с помощью лямбд выражений:
 * ромашку: принимает имя, возвращает да если в имени четное кол-во букв, нет если нечетное
 * бабку гадалку: принимает Человека(возраст,рост),
 * возвращает да - если возраст + рост больше 210, нет - если меньше или равно
 */
public class Runner {
    public static void main(String[] args) {
        Divination<Name> chamomile = name -> name.getName().length() % 2 == 0;
        Divination<People> fortuneTeller = people -> people.getAge() + people.getGrowth() > 220;

        System.out.println(chamomile.divination(new Name("Максим")));
        System.out.println(fortuneTeller.divination(new People(31, 184)));
    }
}
