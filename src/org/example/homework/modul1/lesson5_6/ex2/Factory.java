package org.example.homework.modul1.lesson5_6.ex2;

public class Factory {
    public void createAndPrintPhone(Iphone iphone) {
        iphone.printPropertiesPhone(Iphone.name);
    }

    public void createAndPrintPhone(Samsung samsung) {
        samsung.printPropertiesPhone(Samsung.name);
    }

}