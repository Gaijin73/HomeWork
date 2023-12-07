package org.example.homework.lesson3_4.shop;

import java.util.Arrays;

public class Shop {
    private Worker[] workers;

    public Shop(Worker[] workers) {
        this.workers = workers;
    }
    public void printWorker() {
        for (Worker worker: workers) {
            System.out.print(worker.getName() + ":" + worker.getAge() + " лет, " + worker.getGender()
                    + ", список вещей:");
            for (Item item : worker.getItems()) {
                System.out.println(item.getName());
            }
        }
    }
}
