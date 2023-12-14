package org.example.homework.lesson5_6.ex2;

public class Camera {
    private String type;
    private boolean flash;

    public Camera(String type, boolean flash) {
        this.type = type;
        this.flash = flash;
    }

    public String getType() {
        return type;
    }

    public boolean getFlash() {
        return flash;
    }
}
