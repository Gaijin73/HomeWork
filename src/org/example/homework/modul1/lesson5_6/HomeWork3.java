package org.example.homework.modul1.lesson5_6;

import org.example.homework.modul1.lesson5_6.ex1.Birch;
import org.example.homework.modul1.lesson5_6.ex1.Pine;
import org.example.homework.modul1.lesson5_6.ex1.Spruce;
import org.example.homework.modul1.lesson5_6.ex1.Tree;
import org.example.homework.modul1.lesson5_6.ex2.*;
import org.example.homework.modul1.lesson5_6.ex3.Pyramid1;
import org.example.homework.modul1.lesson5_6.ex4.LotteryTicket;

public class HomeWork3 {

    public static void main(String[] args) {
        //В этом дз уже будет проверятся наличие корректных модификаторов доступа
        //у классов, атрибутов, методов
        ex1();
        ex2();
        ex3();
        ex4();
        ex5();
    }

    public static void ex1() {
        //Реализовать в Java следующую схему (в скобках свойства объектов)
        //У нас есть Дерево(возраст)
        //Деревья делятся на:
        //хвойные(имеют тип иголок)
        //лиственные(есть листья на дереве сейчас), умеют опадать (листья пропадают с дерева)
        //умеют цвести (листья появляются)
        //
        //Сосна и Ель являются хвойными.
        //для сосны характерен тип иголок - крупный
        //для ели характерен тип иголок - мелкий
        //
        //Береза является лиственным деревом.
        //Когда Береза цветет, помимо появления листьев, она источает аллергены (печать в консоль)
        //
        //Создать в методе ex1 сосну, березу, ель. Положить в массив.
        //Посчитать их средний возраст.
        
        Pine pine = new Pine(152, "крупный");
        Spruce spruce = new Spruce(250, "мелкий");
        Birch birch = new Birch(55, true, false);

        Tree[] trees = new Tree[3];
        trees[0] = pine;
        trees[1] = spruce;
        trees[2] = birch;

        int totalAge = 0;
        for (Tree tree : trees) {
            totalAge += tree.getAge();
        }

        System.out.printf("Средний возраст деревьев = %.1f%n", (double) totalAge / trees.length);
        System.out.println("_____________________________________________");
    }

    public static void ex2() {
        //Задача: Фабрика телефонов
        //Создать 2 типа телефонов и комплектующих к ним.
        //При печати телефона должны показываться все свойства телефона и вложенных объектов.
        //1 тип: Samsung galaxy. Имеет операционную систему Android,
        //плату j-108(размер (ширина Х длина Х высота) 10х12х13), камеру Samsung(20x zoom).
        //2 Тип: Iphone 15. Имеет операционную систему Ios, плату 7uik(размер 15х12х13),
        //камеру iphone(15x zoom, есть вспышка).
        //
        //Создать фабрику, которая заполняет созданный телефон деталями
        //При создании телефона в нем нет комплектующих, как будто пустой пластиковый каркас,
        //но при этом модель телефона уже есть.
        //
        //
        //В фабрике должно быть два публичных метода с одним названием:
        //один будет собирать iphone, второй будет собирать samsung.
        //В данном методе создать два телефона, собрать их, распечатать.
        Factory factory = new Factory();

        Board boardIphone = new Board("7uik", 15,  12, 13);
        Camera cameraIphone = new Camera("15x zoom", true);
        Iphone iphone = new Iphone("15", "IOS", boardIphone, cameraIphone);
        factory.createAndPrintPhone(iphone);

        Board boardSamsung = new Board("j-108", 10,  12, 13);
        Camera cameraSamsung = new Camera("20x zoom", false);
        Samsung samsung = new Samsung("galaxy", "Android", boardSamsung, cameraSamsung);
        factory.createAndPrintPhone(samsung);

        System.out.println("_____________________________________________");
    }

    public static void ex3() {
        //Задача: Пирамида наследования
        //Создать классы Pyramid1, Pyramid2, Pyramid3.
        //НЕОБХОДИМО НАСЛЕДОВАНИЕ С ИСПОЛЬЗОВАНИЕМ РОДИТЕЛЬСКИХ МЕТОДОВ!
        // Создать метод print, который будет выводить следующий текст:
        // M <- из Pyramid1
        // MM <- из Pyramid2
        // MMM <- из Pyramid3

        //Т.е. при вызове pyramid1.print выведется:
        // M
        // MM
        // MMM

        //при вызове pyramid2.print выведется:
        // MM
        // MMM

        //при вызове pyramid3.print выведется:
        // MMM

        //создать здесь pyramid1 и вызвать print
        Pyramid1 pyramid1 = new Pyramid1();
        pyramid1.print();
        System.out.println("_____________________________________________");
    }

    public static void ex4() {
        //Задача со звездочкой!: Лотерейный билет
        //Создать класс лотерейный билет (у объекта не может быть атрибутов)
        //создать метод проверить удачу (не принимает в себя аргументов!):
        //каждый десятый билет дает 100 руб,
        //каждый сотый - 5_000,
        //иначе 0
        //Если совпало что билет одновременно десятый и сотый выбор в пользу сотого.
        //
        //Создать здесь 110 билетов, и проверить по каждому удачу.
        //Итоговая сумма выигрыша после проверки удачи 110 билетов должна составить 6_000.

        int totalWin = 0;
        for (int i = 0; i < 110; i++) {
            LotteryTicket ticket = new LotteryTicket();
            totalWin += ticket.checkLuck();
        }
        System.out.println("Итоговая сумма: " + totalWin);
        System.out.println("_____________________________________________");
    }

    public static void ex5() {
        //Задача со звездочкой: иммутабельность города.
        //Иммутабельность - невозможность поменять свойства объекта и всех его вложенных объектов.
        //
        //Создать класс House (наименование улицы, номер дома) - создать сеттеры! и геттеры на него.
        //Переопределить вывод в текст - вывод улицы и номера дома
        //Создать иммутабельный класс City (наименование города, и массив домов).
        //Переопределить вывод в текст - чтобы выводило имя города, и все дома
        //
        //Создать два дома, создать город с массивом созданных домов
        //При получении домов из массива, и изменении данных (например замена улицы) у дома,
        //у домов внутри city ничего не поменяется.
        // Т.е. при вызове toString, будут старые имена улицы
    }
}