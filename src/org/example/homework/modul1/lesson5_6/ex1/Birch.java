package org.example.homework.modul1.lesson5_6.ex1;

public class Birch extends Deciduous {

    public Birch(int age, boolean leaves, boolean blooms) {
        super(age, leaves, blooms);
        if (blooms) {
            System.out.println("Когда береза цветет, "
                    + "помимо появления листьев, она источает аллергены");
        }
    }
}
