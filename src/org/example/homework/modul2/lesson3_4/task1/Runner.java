package org.example.homework.modul2.lesson3_4.task1;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Задание №1: сортировка отзывов
 * Создать класс отзыв с полями: id отзыва, текст отзыва, количество лайков, дата + время отзыва (LocalDateTime)
 * Создать коллекцию, которая хранит отсортированные отзывы по лайкам и дата + время отзыва.
 * Уникальность определяется на основе сортировки.
 * Создать comparator через лямбда выражение, для сортировки отзывов:
 * сначала у кого больше лайков, если лайки совпадают, то сначала идут более новые отзывы
 * Пример, отсортированный :
 *           (id, текст, кол-во лайков, дата+время)
 * отзыв №1: 1, отличный товар, 200, 25.01.2024 13:37
 * отзыв №2: 2, так себе товар, 100, 25.01.2024 16:37
 * отзыв №3: 3, плохой товар, 100, 25.01.2024 13:37
 */
public class Runner {
    public static void main(String[] args) {
        List<Feedback> reviews = new ArrayList<>();
        reviews.add(new Feedback(1, "отличный товар", 200,
                LocalDateTime.of(2024, 1, 25, 13, 37)));
        reviews.add(new Feedback(2, "так себе товар", 100,
                LocalDateTime.of(2024, 1, 25, 16, 37)));
        reviews.add(new Feedback(3, "плохой товар", 100,
                LocalDateTime.of(2024, 1, 25, 13, 37)));
        reviews.add(new Feedback(4, "средний товар", 150,
                LocalDateTime.of(2022, 1, 25, 13, 37)));
        reviews.add(new Feedback(5, "все отлично", 60,
                LocalDateTime.of(2021, 1, 25, 13, 37)));
        reviews.add(new Feedback(6, "хороший, но дорого", 200,
                LocalDateTime.of(2020, 1, 25, 13, 37)));


        // Вывод отзывов до сортировки
        System.out.println("Список отзывов до сортировки:");
        for (Feedback review : reviews) {
            System.out.println(review);
        }

        // Создаем компаратор
        Comparator<Feedback> compareFeedback = (r1, r2) -> {
            int likesCompare = r2.getLikesCount() - r1.getLikesCount();
            if (likesCompare == 0) {
                return r2.getDateTime().compareTo(r1.getDateTime());
            }
            return likesCompare;
        };
        // Cортируем отзывы по нашему компоратору
        reviews.sort(compareFeedback);

        // Вывод отзывов после сортировки
        System.out.println("Список отзывов после сортировки:");
        for (Feedback review : reviews) {
            System.out.println(review);
        }
    }
}
