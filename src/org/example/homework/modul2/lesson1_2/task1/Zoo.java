package org.example.homework.modul2.lesson1_2.task1;

import org.example.homework.modul2.lesson1_2.task1.animal.Animal;

public class Zoo <T extends Animal> {
    private T animal;

    public Zoo(T animal) {
        this.animal = animal;
    }
    public void  receiveAnimal(){
        animal.action();
    }
}
