package org.example.homework.modul1.lesson7_8.ex2;

public class Airplane implements Fly {
    private int countPassengers;

    public Airplane(int countPassengers) {
        this.countPassengers = countPassengers;
    }

    @Override
    public void fly() throws FlyException {
        if (countPassengers < 0) {
            throw new FlyException("Пассажиров в самолете меньше 0");
        } else {
            System.out.println("Самолет летит");
        }
    }
}
