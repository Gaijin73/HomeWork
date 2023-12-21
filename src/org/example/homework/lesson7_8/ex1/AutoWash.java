package org.example.homework.lesson7_8.ex1;

public class AutoWash {
    public static final int BIG_AUTO_RATE = 4000;
    public static final int SMALL_AUTO_RATE = 2000;

    public static int washCar(Auto auto) {
        if (!auto.isClean) {
            auto.isClean = true;
            return auto.isBig() ? BIG_AUTO_RATE : SMALL_AUTO_RATE;
        }
        return 0;
    }

}
