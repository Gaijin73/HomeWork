package org.example.homework.modul2.lesson1_2.task1;

import org.example.homework.modul2.lesson1_2.task1.animal.Bird;
import org.example.homework.modul2.lesson1_2.task1.animal.Dog;
import org.example.homework.modul2.lesson1_2.task1.animal.Tiger;

public class Runner {
    /**
     * Задание №1 Зоопарк
     * Создать три вида животных: Тигр - умеет рычать, Собака - умеет лаять, Птица - умеет летать.
     * Создать зоопарк, который может хранить в себе трех животных.
     * Сделать так, чтобы при получении животного, мы могли воспользоваться специфичным для него действием.
     */
    public static void main(String[] args) {
        Zoo<Tiger> tigerZoo = new Zoo<>(new Tiger());
        tigerZoo.receiveAnimal();

        Zoo<Dog> dogZoo = new Zoo<>(new Dog());
        dogZoo.receiveAnimal();

        Zoo<Bird> birdZoo = new Zoo<>(new Bird());
        birdZoo.receiveAnimal();
    }
}
