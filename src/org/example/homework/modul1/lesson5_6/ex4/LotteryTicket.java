package org.example.homework.modul1.lesson5_6.ex4;

public class LotteryTicket {
    static int ticketNumber = 0;

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
