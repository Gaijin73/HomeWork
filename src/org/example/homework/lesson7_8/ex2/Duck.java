package org.example.homework.lesson7_8.ex2;

public class Duck implements Fly {
    private boolean isInjured;

    public Duck(boolean isInjured) {
        this.isInjured = isInjured;
    }

    @Override
    public void fly() throws FlyException {
        if (isInjured) {
            throw new FlyException("Утка ранена");
        } else {
            System.out.println("Утка летит");
        }
    }
}
