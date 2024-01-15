package org.example.homework.modul2.lesson1_2.task2;

import java.util.ArrayList;
import java.util.Arrays;

public class Runner {
        /**
         * Создать два List с числами
         * Первый List: 5,2,4
         * Второй List: 7,10
         * Создать финальный лист и заполнить его данными из первого и второго листа, не используя for each.
         * Удалить 3 элемент в финальном листе. Вывести на экран индекс числа 10.
         */
    public static void main(String[] args) {

        ArrayList<Integer> listFirst = new ArrayList<>(Arrays.asList(5,2,4));
        ArrayList<Integer> listSecond = new ArrayList<>(Arrays.asList(7,10));
        ArrayList<Integer> finishList =  new ArrayList<>();


        finishList.addAll(listFirst);
        finishList.addAll(listSecond);

        finishList.remove(2);

        System.out.println("Индекс числа 10 равен: " + finishList.indexOf(10));
    }
}
