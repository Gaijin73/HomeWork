package org.example.homework.modul2.lesson5_6.task2;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Задание №2 - Сколько здесь "о" ?
 * Создать набор уникальных слов: "тонь", "тополь", "боль", "рой", "стройка"
 * Внутри одного стрима:
 * Посчитать количество букв "о" в одном слове
 * Посчитать сумму количества букв "о" во всех словах из набора
 * Если буквы "о" есть - напечатать количество букв "о", если нет выкинуть исключение
 * ожидаемый результат: 6
 */
public class Runner {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("тонь", "тополь", "боль", "рой", "стройка");

        long count = words.stream()
            .flatMap(word -> word.chars().boxed())
            .filter(chars -> chars == 'о')
            .count();

        if (count > 0) {
            System.out.printf("Количество букв O = %s", count);
        } else {
            throw new RuntimeException("Нет буквы 'о' в словах");
        }
    }
}
