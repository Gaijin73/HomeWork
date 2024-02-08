package org.example.homework.modul2.lesson5_6.task3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Задание №3 - Небоскребы, небоскребы, а я...
 * Дано: Небоскреб - имя небоскреба, его высота в метрах.
 * Необходимо создать небоскребы:
 * 1 Всемирный торговый центр 1 - 541м
 * 2 Шанхайская башня - 632м
 * 3	Бурдж-Халифа - 828м
 * 4 Международный финансовый центр Пинань - 599м
 * 5 Абрадж аль-Бейт - 601м
 * 6 Всемирный центр Лотте - 555м
 *
 * Занести данный список в List! Дважды положить бурдж халифа в лист.
 * С помощью стримов:
 * Убрать дубликаты
 * (РАЗНЫЕ СТРИМЫ)
 * Вывести только первые три небоскреба.
 * Вывести самый высокий небоскреб.
 * Вывести те небоскребы, которые выше километра.
 * Если выше нет, то вывести на экран: небоскреба выше километра - нет.
 */
public class Runner {
    public static void main(String[] args) {
        List<Skyscraper> skyscrapers = new ArrayList<>(List.of(
                new Skyscraper("World Trade Center 1", 541),
                new Skyscraper("Burj Khalifa", 828),
                new Skyscraper("Burj Khalifa", 828),
                new Skyscraper("Shanghai Tower", 632),
                new Skyscraper("Ping An Finance Centre", 599),
                new Skyscraper("Abraj al-Bait", 1601),
                new Skyscraper("Lotte World Tower", 1555)
        ));

        skyscrapers.stream()
                .distinct()
                .limit(3)
                .forEach(System.out::println);

        Optional<Skyscraper> highestSkyscrapers = skyscrapers.stream()
                .max(Comparator.comparingInt(Skyscraper::getHeight));

        highestSkyscrapers.ifPresentOrElse(
                skyscraper -> System.out.println("Самый высокий небоскреб: " + skyscraper.getName()),
                () -> System.out.println("Небоскребов нет"));

        Optional<List<Skyscraper>> overKilometer = skyscrapers.stream()
                .filter(sky -> sky.getHeight() > 1000)
                .collect(Collectors.collectingAndThen(Collectors.toList(),
                        sky -> !sky.isEmpty() ? Optional.of(sky) : Optional.empty()));

        overKilometer.ifPresentOrElse(
                sky -> System.out.println("Небоскребы с высотой больше 1км " + sky),
                () -> System.out.println("Небоскребов выше 1 км нет"));
    }
}
