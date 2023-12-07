package org.example.homework.lesson3_4.shop;

public class Runner {

    public static void main(String[] args) {
        Item hammer = new Item("Молот", 1000);
        Item screwdriver = new Item("Отвертка", 50);
        Item notebook = new Item("Тетрадь", 30);
        Item pen = new Item("Ручка", 10);

        Item[] vasiliyIt = {hammer, screwdriver};
        Worker vasiliy = new Worker("Василий", 30 , 'M', vasiliyIt);

        Item[] mariyaIt = {notebook, pen};
        Worker mariya = new Worker("Марьяна", 25, 'Ж', mariyaIt);

        Worker[] workers = {vasiliy, mariya};
        Shop shop = new Shop(workers);

        shop.printWorker();

        for (Worker worker : workers) {
            worker.itemBragging();
        }

    }
}
