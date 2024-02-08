package org.example.homework.modul2.lesson5_6.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Задание №1 - Список спец номеров
 * Создать класс машина. У машины есть номер.
 * Создать 50 машин с номерами а0[01-50]ан799 (где [01-50] - это все значения от 01 до 50)
 * Создать 50 машин с номерами к0[01-50]се178
 * Соединить машины в единый стрим
 * Машины, с номерами 04[0-9] - это спец номера (врачи)
 * оставить только те машины, которые обладают спец номерами
 * Получить из машин номера
 * Соединить в единую строку, с разделителем в " ," - самостоятельное изучение
 * Ожидаемый результат:
 * "a040ан1799, a041ан799, ... , k048се178, k049се178"
 */
public class Runner {
    public static void main(String[] args) {

        List<Car> cars = IntStream.range(1,  50)
                .boxed()
                .flatMap(i -> Stream.of(
                        new Car("a0" + String.format("%02d", i) + "ан799"),
                        new Car("k0" + String.format("%02d", i) + "се178")
                ))
                .toList();

        // Фильтрация машин по спецномерам
        List<Car> specialCar = cars.stream()
                .filter(car -> car.getNumber().matches(".*04\\d.*"))
                .toList();

        // Вывод машин со спецномерами в строку
        String printSpecialCar = specialCar.stream()
                .map(Car::getNumber)
                .collect(Collectors.joining(", "));

        System.out.println(printSpecialCar);
    }
}
