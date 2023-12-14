package org.example.homework.lesson5_6.ex4;

import org.example.homework.lesson5_6.HomeWork3;

public class LotteryTicket extends HomeWork3 {
    public int checkLuck() {
        ticketNumber++;

        if (ticketNumber % 100 == 0) {
            return 5000;
        } else if (ticketNumber % 10 == 0) {
            return 100;
        } else {
            return 0;
        }
    }
}
