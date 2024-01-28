package org.example.homework.modul2.lesson3_4.task5;

/**
 * Задание №5: универсальная линейка
 * Создать функциональный интерфейс линейка: принимает в себя любой тип, возвращает Integer
 * Создать с помощью лямбд выражений:
 * Измеритель лодок: на вход лодка(длина), возвращает длину лодки
 * Измеритель животных: на вход животное(длина тела, длина хвоста),
 * возвращает сумму длин тела и хвоста
 */
public class Runner {
    public static void main(String[] args) {

        Ruler<Animal> animalMeter = animal -> animal.getBodyLength() + animal.getTailLength();
        System.out.println(animalMeter.measure(new Animal(2323, 232323)));

        Ruler<Boat> boatMeter = Boat::getLength;
        System.out.println(boatMeter.measure(new Boat(345345)));
    }
}